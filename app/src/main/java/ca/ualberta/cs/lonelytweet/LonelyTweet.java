package ca.ualberta.cs.lonelytweet;

import java.io.IOException;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by skhanna1 on 10/31/17.
 */

abstract class LonelyTweet implements Serializable {
    private static final long serialVersionUID = 1L;
    //made Date private
    // Made tweetBody private
    Date tweetDate;
    String tweetBody;

    private Date getTweetDate() {
        return tweetDate;
    }

    public void setTweetDate(Date tweetDate) {
        this.tweetDate = tweetDate;
    }

    // made it protected
    protected abstract String getTweetBody();

    public void setTweetBody(String tweetBody) {
        this.tweetBody = tweetBody;
    }

    private void writeObject(java.io.ObjectOutputStream out) throws IOException {
        out.writeObject(tweetDate);
        out.writeObject(tweetBody);
    }

    private void readObject(java.io.ObjectInputStream in) throws IOException,
            ClassNotFoundException {
        tweetDate = (Date) in.readObject();
        tweetBody = (String) in.readObject();
    }

    public abstract boolean isValid();

    @Override
    public String toString() {
        return getTweetDate() + " | " + getTweetBody() ;
    }
}
