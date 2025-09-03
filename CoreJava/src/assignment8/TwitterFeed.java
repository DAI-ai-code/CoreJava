package assignment8;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwitterFeed {
//	String subject,String month, int views, Set<String> hashtags
	public static List<Tweets> generateTweets() {
			
		List<Tweets> tweets = new ArrayList<Tweets>();
		tweets.add(new Tweets("war", "may", 1000000, Set.of("#War", "#INDvsPAK", "#Jammu", "#AirStrike")));
		tweets.add(new Tweets("pokemon", "may", 17000, Set.of("#Pikachu", "#Cute", "#Go", "#GottaCatchEmAll")));
		tweets.add(new Tweets("education", "jun", 2000, Set.of("#study", "#students", "#TimeTable", "#notebook")));
		tweets.add(new Tweets("education", "aug", 500, Set.of("#placements", "#package", "#LPA", "#Assignment")));
		tweets.add(new Tweets("war", "may", 1005490, Set.of("#War", "#RussiavsUkraine", "#students", "#AirStrike")));
		tweets.add(new Tweets("floods", "sep", 980000, Set.of("#north", "#himachal", "#Jammu", "#tawi")));
		tweets.add(new Tweets("education", "jan", 900000, Set.of("#PaperLeak", "#students", "#corruption")));
		tweets.add(new Tweets("bollywood", "aug", 500000, Set.of("#mumbai", "#Controversy", "#Bollywood", "#MeToo")));
		tweets.add(new Tweets("war", "may", 500540, Set.of("#Israel", "#Iran", "#AirStrike")));
		tweets.add(new Tweets("bollywood", "sep", 99800, Set.of("#songs", "#arijitSingh", "#romantic", "#chartBuster")));
		
		
		return tweets;
		
	}

	public static void main(String[] args) {
		
//		Q1
		System.out.println("<----------------------FILTERING BY MONTH (SEP)---------------------->\n");
		List<Tweets> tweets = generateTweets();
		Stream<Tweets> stream = tweets.stream();
		stream.filter((t) -> t.getMonth().equalsIgnoreCase("sep")).forEach(System.out::println);
		System.out.println();
		
//		Q2
		System.out.println("<----------------------FILTERING BY HASHTAG--------------------------->\n");
		stream = tweets.stream();
		stream.filter((t) -> t.getHashtags().contains("#War")).forEach(System.out::println);
		System.out.println();
		
//		Q3
		System.out.println("<----------------------GROUPING BY SUBJECT WITH COUNT------------------>\n");
		stream = tweets.stream();
		Map<String, List<Tweets>> mapped = stream.collect(Collectors.groupingBy(Tweets::getSubject));
		mapped.forEach((k,v) -> System.out.println(k + " " + v + "\ncount: " + v.size()));
		System.out.println();
		
//		Q4
		System.out.println("<----------------------FILTERING BY VIEWS (>10k)------------------------>\n");
		stream = tweets.stream();
		stream.filter((t) -> t.getViews() >= 10000).forEach(System.out::println);
		System.out.println();
		
//		Q5
		System.out.println("<----------------------TOP 5 TRENDING TWEETS---------------------------->\n");
		stream = tweets.stream();
		stream.sorted((t1, t2) -> t2.getViews() - t1.getViews()).limit(5).forEach(System.out::println);
		
//		display unique hashtags using flatmap
	}

}
