import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

public class TestaLoop {
	public static void main(String[] args) throws TwitterException {
	    //Connection builder
	    ConfigurationBuilder builder = new ConfigurationBuilder();
	    builder.setOAuthConsumerKey("pPzh0kqMWblUFxkLqVR1p0dFr");
	    builder.setOAuthConsumerSecret("yUxFkxuZ8JLH8cW2H6JxNGhGfzOujg3zC9LpkAeQdJyH05wbAw");
	    builder.setOAuthAccessToken("1345533410-lmyD5pPmA3EXOZHkggBXvIB7nypcPLP8uMrP4Pt");
	    builder.setOAuthAccessTokenSecret("963uFbR5z6FAXFELrkglkYctKCooTUk6TGHNHeEWzsJXJ");
	    Configuration configuration = builder.build();
	    TwitterFactory factory = new TwitterFactory(configuration);
	    Twitter twitter = factory.getInstance();
	    
	    Query query = new Query("madrid");
	    query.setCount(200);

	    int searchResultCount;
	    long lowestTweetId = Long.MAX_VALUE;
	    
	    QueryResult queryResult = twitter.search(query);
	    searchResultCount = queryResult.getTweets().size();
	    System.out.println(searchResultCount);

//	    do {
//	        QueryResult queryResult = twitter.search(query);
//
//	        searchResultCount = queryResult.getTweets().size();
//
//	        for (Status tweet : queryResult.getTweets()) {
//
//	            // do whatever with the tweet
//
//
//	            if (tweet.getId() < lowestTweetId) {
//		        	//System.out.println(tweet.getUser());
//	                lowestTweetId = tweet.getId();
//	                query.setMaxId(lowestTweetId);
//	            }
//	        }
//
//	    } while (searchResultCount != 0 && searchResultCount % 100 == 0);
	}
}
