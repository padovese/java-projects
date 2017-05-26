package swing;

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
import twitter4j.json.DataObjectFactory;

public class test {
public static void main(String[] args) {

    String dataa = "lula"; //perform your operation
    //System.out.println(data);
    //Inicio tweet
	ConfigurationBuilder builder = new ConfigurationBuilder();
	builder.setJSONStoreEnabled(true);
	builder.setOAuthConsumerKey("pPzh0kqMWblUFxkLqVR1p0dFr");
	builder.setOAuthConsumerSecret("yUxFkxuZ8JLH8cW2H6JxNGhGfzOujg3zC9LpkAeQdJyH05wbAw");
	builder.setOAuthAccessToken("1345533410-lmyD5pPmA3EXOZHkggBXvIB7nypcPLP8uMrP4Pt");
	builder.setOAuthAccessTokenSecret("963uFbR5z6FAXFELrkglkYctKCooTUk6TGHNHeEWzsJXJ");
	Configuration configuration = builder.build();
	TwitterFactory factory = new TwitterFactory(configuration);
	Twitter twitter = factory.getInstance();

	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
	Date date = new Date();	
	
	PrintStream ps;
	try {
		ps = new PrintStream(dataa + dateFormat.format(date) + ".txt");



ConfigurationBuilder cb = new ConfigurationBuilder();
cb.setJSONStoreEnabled(true);

Twitter twitter1 = new TwitterFactory(cb.build()).getInstance();
Query query = new Query(dataa);
query.setCount(100);
QueryResult result;
try {
result = twitter.search(query);

for (Status tweet : result.getTweets()) {
String json = DataObjectFactory.getRawJSON(tweet);
ps.println(json);


}
} catch (TwitterException e1) {
// TODO Auto-generated catch block
e1.printStackTrace();
}
ps.close();
    //Fim

	} catch (FileNotFoundException e1) {
		// TODO Auto-generated catch block
		e1.printStackTrace();
	}

}
}
