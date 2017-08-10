import com.mongodb.DB;
import com.mongodb.MongoClient;

public class TestaMongo {
 
	public static void main(String[] args) {
 
	     MongoClient mongoClient = new MongoClient("localhost", 27017); //Exception


	        DB db = mongoClient.getDB("mydb");
	        System.out.println("Database connection successfull.");
	}
 
}