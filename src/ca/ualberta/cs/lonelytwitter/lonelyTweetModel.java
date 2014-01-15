package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/* <default> (blank) - accessible in current class and in package
 * private - only accessible in current class
 * protected - only accessible in current class and subclasses, and in package
 * public - anywhere
 */

public abstract class lonelyTweetModel {
	protected String text;
	protected Date timeStamp;
	
	public String getText() {
		return text;
	}
	public abstract void setText(String text);
	
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
	public boolean getTweetImportance() {
		return false;
	}
	
	public lonelyTweetModel(String text, Date timeStamp) {
		super();
		this.text = text;
		this.timeStamp = timeStamp;
	}
	public lonelyTweetModel(String text) {
		super();
		this.text = text;
		this.timeStamp = new Date();
	}
	
}
