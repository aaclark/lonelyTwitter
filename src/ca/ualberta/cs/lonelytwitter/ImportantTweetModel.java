package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

public class ImportantTweetModel extends LonelyTweetModel {

	public ImportantTweetModel(String text, Date timeStamp) {
		super(text, timeStamp);
		// TODO Auto-generated constructor stub
	}

	public ImportantTweetModel(String text) {
		super(text);
		// TODO Auto-generated constructor stub
	}
	public void setText(String text) {
		this.text = text;
	}
	
	@Override
	public boolean getTweetImportance() {
		return true;
	}
}
