import java.util.List;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;

public class TestaTwitter {

  public static void main(String[] args) throws TwitterException {
    //Realiza conexão ok
    ConfigurationBuilder builder = new ConfigurationBuilder();
    builder.setOAuthConsumerKey("pPzh0kqMWblUFxkLqVR1p0dFr");
    builder.setOAuthConsumerSecret("yUxFkxuZ8JLH8cW2H6JxNGhGfzOujg3zC9LpkAeQdJyH05wbAw");
    builder.setOAuthAccessToken("1345533410-lmyD5pPmA3EXOZHkggBXvIB7nypcPLP8uMrP4Pt");
    builder.setOAuthAccessTokenSecret("963uFbR5z6FAXFELrkglkYctKCooTUk6TGHNHeEWzsJXJ");
    Configuration configuration = builder.build();
    TwitterFactory factory = new TwitterFactory(configuration);
    Twitter twitter = factory.getInstance();
  
        // Post a Tweet using Twitter4j API
//        Status status = twitter.updateStatus("Hello");
//        System.out.println("Successfully updated the status to [" + status.getText() + "].");

    
    //Coleta Timeline
//      List<Status> statuses = twitter.getHomeTimeline();
//      System.out.println("Showing home timeline.");
//      for (Status status : statuses) {
//          System.out.println(status.getUser().getName() + ":" +
//                             status.getText());
//      }

    //Realiza consulta no twitter geral
      Query query = new Query("juventus");
      query.setCount(100);
      //query.setSince("2015-05-25");
      QueryResult result = twitter.search(query);
      for (Status status : result.getTweets()) {
          System.out.println("@" + status.getUser().getScreenName() + ":" + status.getText());
      }
    
    }
}