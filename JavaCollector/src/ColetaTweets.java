import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

public class ColetaTweets {
	public static void main(String[] args) throws TwitterException, FileNotFoundException {
	    //Connection builder
	    ConfigurationBuilder builder = new ConfigurationBuilder();
	    builder.setOAuthConsumerKey("pPzh0kqMWblUFxkLqVR1p0dFr");
	    builder.setOAuthConsumerSecret("yUxFkxuZ8JLH8cW2H6JxNGhGfzOujg3zC9LpkAeQdJyH05wbAw");
	    builder.setOAuthAccessToken("1345533410-lmyD5pPmA3EXOZHkggBXvIB7nypcPLP8uMrP4Pt");
	    builder.setOAuthAccessTokenSecret("963uFbR5z6FAXFELrkglkYctKCooTUk6TGHNHeEWzsJXJ");
	    Configuration configuration = builder.build();
	    TwitterFactory factory = new TwitterFactory(configuration);
	    Twitter twitter = factory.getInstance();
	    
		DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy HH-mm-ss");
		Date date = new Date();		
	    
		PrintStream ps = new PrintStream("tweets " + dateFormat.format(date) + ".txt");
	    
	    //Query builder from tweets of the whole twitter
	      Query query = new Query("madrid");
	      query.setCount(100);
	      //query.setSince("2015-05-25");
	      QueryResult result = twitter.search(query);
	      for (Status status : result.getTweets()) {
	          System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
	          ps.println("@" + status.getUser().getScreenName() + ":" + status.getText());
	      }
	      
	      ps.close();
	}
}
