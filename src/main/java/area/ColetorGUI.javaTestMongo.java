package area;
import java.net.UnknownHostException;
import java.util.Date;
import com.mongodb.BasicDBObject;
import com.mongodb.DB;
import com.mongodb.DBCollection;
import com.mongodb.DBCursor;
import com.mongodb.MongoClient;
import com.mongodb.MongoException;

public class TestMongo {

	  public static void main(String[] args) {

		  try {

		/**** Connect to MongoDB ****/
		// Since 2.10.0, uses MongoClient
		MongoClient mongo = new MongoClient("localhost", 27017);

		/**** Get database ****/
		// if database doesn't exists, MongoDB will create it for you
		DB db = mongo.getDB("padoveseDB");
		
		DBCollection table = db.getCollection("funcionarios");
		
		BasicDBObject searchQuery = new BasicDBObject();
		searchQuery.put("nome", "padova");

		DBCursor cursor = table.find(searchQuery);

		while (cursor.hasNext()) {
			System.out.println(cursor.next());
		}
		

		        } catch (MongoException e) {
		    	e.printStackTrace();
		        }

	    }
}
