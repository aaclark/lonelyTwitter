package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/* <default> (blank) - accessible in current class and in package
 * private - only accessible in current class
 * protected - only accessible in current class and subclasses, and in package
 * public - anywhere
 */

public class lonelyTweetModel {
	private String text;
	private Date timeStamp;
	
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Date getTimeStamp() {
		return timeStamp;
	}
	public void setTimeStamp(Date timeStamp) {
		this.timeStamp = timeStamp;
	}
}
