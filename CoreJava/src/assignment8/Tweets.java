package assignment8;

import java.util.Set;

public class Tweets {
	
	private String subject;
	private String month;
	private int views;
	private Set<String> hashtags;
	
	public Tweets(String subject,String month, int views, Set<String> hashtags) {
		this.subject = subject;
		this.month = month;
		this.views = views;
		this.hashtags = hashtags;
	}

	public String getSubject() {
		return subject;
	}

	public String getMonth() {
		return month;
	}

	@Override
	public String toString() {
		return "subject=" + subject + ", month=" + month + ", views=" + views + ", hashtags=" + hashtags;
	}

	public int getViews() {
		return views;
	}

	public Set<String> getHashtags() {
		return hashtags;
	}
	

}
