package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;

public class TweetListModel {
	public TweetListModel() {
		this.list = new ArrayList<LonelyTweetModel>();
	}

	private ArrayList<LonelyTweetModel> list;
	
	public ArrayList<LonelyTweetModel> getList() {
		return list;
	}
	
	public void setList(ArrayList<LonelyTweetModel> list) {
		this.list = list;
	}

	public TweetListModel(ArrayList<LonelyTweetModel> list) {
		super();
		this.list = list;
	}
}
