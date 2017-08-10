package area;

import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBObject;
import com.mongodb.MongoClient;
import com.mongodb.util.JSON;

import twitter4j.Query;
import twitter4j.QueryResult;
import twitter4j.Status;
import twitter4j.Twitter;
import twitter4j.TwitterException;
import twitter4j.TwitterFactory;
import twitter4j.conf.Configuration;
import twitter4j.conf.ConfigurationBuilder;
import twitter4j.json.DataObjectFactory;

public class TestInsert {
	public static void main(String[] args) throws TwitterException {
		
	ConfigurationBuilder builder = new ConfigurationBuilder();
	builder.setJSONStoreEnabled(true);
	builder.setOAuthConsumerKey("pPzh0kqMWblUFxkLqVR1p0dFr");
	builder.setOAuthConsumerSecret("yUxFkxuZ8JLH8cW2H6JxNGhGfzOujg3zC9LpkAeQdJyH05wbAw");
	builder.setOAuthAccessToken("1345533410-lmyD5pPmA3EXOZHkggBXvIB7nypcPLP8uMrP4Pt");
	builder.setOAuthAccessTokenSecret("963uFbR5z6FAXFELrkglkYctKCooTUk6TGHNHeEWzsJXJ");
	Configuration configuration = builder.build();
	TwitterFactory factory = new TwitterFactory(configuration);
	Twitter twitter = factory.getInstance();
	
	ConfigurationBuilder cb = new ConfigurationBuilder();
    cb.setJSONStoreEnabled(true);
    
    MongoClient mongo = new MongoClient("localhost", 27017);
	DB db = mongo.getDB("padoveseDB");
	DBCollection table = db.getCollection("tweets");
	
	BasicDBObject documentDetail = new BasicDBObject();
	
    
    Twitter twitter1 = new TwitterFactory(cb.build()).getInstance();
    Query query = new Query("lula");
    query.setCount(100);
    QueryResult result = twitter.search(query);
    for (Status tweet : result.getTweets()) {
        System.out.println(tweet.getUser() + ":" + tweet.getText());
        String json = DataObjectFactory.getRawJSON(tweet);
        DBObject doc = (DBObject)JSON.parse(json);
        table.insert(doc);
    }
	}
}
