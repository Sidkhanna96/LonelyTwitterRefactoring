package ca.ualberta.cs.lonelytweet;

import java.util.Date;

public class NormalLonelyTweet extends LonelyTweet {

	public NormalLonelyTweet() {
	}

	public NormalLonelyTweet(String text, Date date) {
		this.tweetDate = date;
		this.tweetBody = text;
	}

	@Override
	public boolean isValid() {
		return !(tweetBody.trim().length() == 0
				|| tweetBody.trim().length() > 10);
		//Removed the return statement and if statement
	}

	@Override
	public String getTweetBody() {
        return tweetBody;
    }
}