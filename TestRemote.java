package area;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

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

public class TestRemote {
	public static void main(String[] args) throws TwitterException, FileNotFoundException {
		
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
    

    MongoClient mongo = new MongoClient("200.160.118.58", 27017);
	DB db = mongo.getDB("radarDB");
	DBCollection table = db.getCollection("tweets");
	
	BasicDBObject documentDetail = new BasicDBObject();
	
	
//	List<String> parametros = new LinkedList<String>();
//	parametros.add("Lula");
//	parametros.add("Dilma");
//
//	
//	for (int i = 0; i < parametros.size(); i++){
//		
//		
//	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
//	Date date = new Date();	
//	
//	PrintStream ps = new PrintStream("tweets/" + parametros.get(i).trim() + "_" + dateFormat.format(date) + ".txt");
//	
//   
//    Query query = new Query(parametros.get(i));
//    query.setCount(100);
//    QueryResult result = twitter.search(query);
//    for (Status tweet : result.getTweets()) {
//        String json = DataObjectFactory.getRawJSON(tweet);
//        DBObject doc = (DBObject)JSON.parse(json);
//        table.insert(doc);
//        ps.println(doc);
//    }
//    System.out.println(i);
//    ps.close();
//	}
	}
}
