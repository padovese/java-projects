import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

public class PostaTweet {
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
	    
	    //Post a Tweet
	    Status status = twitter.updateStatus("Hello2");
	    System.out.println("Successfully updated the status to [" + status.getText() + "].");
	}
}