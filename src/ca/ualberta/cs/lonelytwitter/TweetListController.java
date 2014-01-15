package ca.ualberta.cs.lonelytwitter;

public class TweetListController {
	private static TweetListModel tweetListModel=null;
	
	public TweetListController() {
		if (tweetListModel==null) {
			tweetListModel = new TweetListModel();
		}
	}
}
