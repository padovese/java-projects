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

public class TestAllInserts {
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
    
    
    MongoClient mongo = new MongoClient("localhost", 27017);
	DB db = mongo.getDB("padoveseDB");
	DBCollection table = db.getCollection("tweets");
	
	BasicDBObject documentDetail = new BasicDBObject();
	
	
	List<String> parametros = new LinkedList<String>();
	parametros.add("CAPITÃO AUGUSTO");
	parametros.add("JOSÉ ROCHA");
	parametros.add("PAULO AZI");
	parametros.add("VITOR VALIM");
	parametros.add("DARCÍSIO PERONDI");
	parametros.add("ROBERTO SALES");
	parametros.add("VANDER LOUBET");
	parametros.add("PROFESSORA DORINHA SEABRA REZENDE");
	parametros.add("MARCO TEBALDI");
	parametros.add("SÉRGIO BRITO");
	parametros.add("CABUÇU BORGES");
	parametros.add("CARLOS MARUN");
	parametros.add("PEDRO VILELA");
	parametros.add("CLEBER VERDE");
	parametros.add("SILVIO COSTA");
	parametros.add("JUNIOR MARRECA");
	parametros.add("DR. JORGE SILVA");
	parametros.add("VANDERLEI MACRIS");
	parametros.add("JÉSSICA SALES");
	parametros.add("BENITO GAMA");
	parametros.add("WELITON PRADO");
	parametros.add("BRUNNY");
	parametros.add("IZALCI LUCAS");
	parametros.add("ONYX LORENZONI");
	parametros.add("DIEGO GARCIA");
	parametros.add("RAIMUNDO GOMES DE MATOS");
	parametros.add("ALEX CANZIANI");
	parametros.add("LUIZ COUTO");
	parametros.add("ADAIL CARNEIRO");
	parametros.add("ALBERTO FRAGA");
	parametros.add("JHC");
	parametros.add("ZÉ GERALDO");
	parametros.add("WEVERTON ROCHA");
	parametros.add("FÁBIO SOUSA");
	parametros.add("DELEGADO EDSON MOREIRA");
	parametros.add("JOÃO ARRUDA");
	parametros.add("ROGÉRIO MARINHO");
	parametros.add("KAIO MANIÇOBA");
	parametros.add("JARBAS VASCONCELOS");
	parametros.add("BOHN GASS");
	parametros.add("JOSÉ OTÁVIO GERMANO");
	parametros.add("MARIA DO ROSÁRIO");
	parametros.add("LEONARDO QUINTÃO");
	parametros.add("SILVIO TORRES");
	parametros.add("NEWTON CARDOSO JR");
	parametros.add("FÉLIX MENDONÇA JÚNIOR");
	parametros.add("CONCEIÇÃO SAMPAIO");
	parametros.add("LUCAS VERGILIO");
	parametros.add("ALEXANDRE SERFIOTIS");
	parametros.add("FÁBIO FARIA");
	parametros.add("CÉSAR MESSIAS");
	parametros.add("JAIR BOLSONARO");
	parametros.add("GIVALDO CARIMBÃO");
	parametros.add("GUILHERME MUSSI");
	parametros.add("ALESSANDRO MOLON");
	parametros.add("LUIZ CLÁUDIO");
	parametros.add("EDUARDO CURY");
	parametros.add("CELSO RUSSOMANNO");
	parametros.add("FLÁVIA MORAIS");
	parametros.add("PAULO MAGALHÃES");
	parametros.add("MAGDA MOFATTO");
	parametros.add("CAETANO");
	parametros.add("CESAR SOUZA");
	parametros.add("ZENAIDE MAIA");
	parametros.add("ASSIS DO COUTO");
	parametros.add("HUGO MOTTA");
	parametros.add("EVAIR VIEIRA DE MELO");
	parametros.add("ROBERTO DE LUCENA");
	parametros.add("MIRO TEIXEIRA");
	parametros.add("PAULO TEIXEIRA");
	parametros.add("VALDIR COLATTO");
	parametros.add("ZÉ CARLOS");
	parametros.add("ARLINDO CHINAGLIA");
	parametros.add("MIGUEL HADDAD");
	parametros.add("DANIEL VILELA");
	parametros.add("ERIKA KOKAY");
	parametros.add("DELEGADO FRANCISCHINI");
	parametros.add("DELEGADO ÉDER MAURO");
	parametros.add("FÁBIO MITIDIERI");
	parametros.add("GONZAGA PATRIOTA");
	parametros.add("FÁBIO RAMALHO");
	parametros.add("JORGE CÔRTE REAL");
	parametros.add("RENZO BRAZ");
	parametros.add("JOSÉ MENTOR");
	parametros.add("JOÃO DERLY");
	parametros.add("JOÃO PAULO KLEINÜBING");
	parametros.add("BONIFÁCIO DE ANDRADA");
	parametros.add("RUBENS PEREIRA JÚNIOR");
	parametros.add("HERMES PARCIANELLO");
	parametros.add("MAURO LOPES");
	parametros.add("LELO COIMBRA");
	parametros.add("MÁRIO NEGROMONTE JR.");
	parametros.add("SILAS FREIRE");
	parametros.add("ZÉ AUGUSTO NALIN");
	parametros.add("PAULO HENRIQUE LUSTOSA");
	parametros.add("NELSON PADOVANI");
	parametros.add("GUILHERME COELHO");
	parametros.add("CREUZA PEREIRA");
	parametros.add("CAJAR NARDES");
	parametros.add("ANDRÉ AMARAL");
	parametros.add("POLLYANA GAMA");
	parametros.add("SABINO CASTELO BRANCO");
	parametros.add("ADÉRMIS MARINI");
	parametros.add("RENATO ANDRADE");
	parametros.add("VAIDON OLIVEIRA");
	parametros.add("DEJORGE PATRÍCIO");
	parametros.add("ASSIS MELO");
	parametros.add("GORETE PEREIRA");
	parametros.add("MARCELO AGUIAR");
	parametros.add("ELIZEU DIONIZIO");
	parametros.add("WILSON BESERRA");

	
	for (int i = 0; i < parametros.size(); i++){
		
		
	DateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy_HH-mm-ss");
	Date date = new Date();	
	
	PrintStream ps = new PrintStream("tweets/" + parametros.get(i).trim() + "_" + dateFormat.format(date) + ".txt");
	
   
    Query query = new Query(parametros.get(i));
    query.setCount(100);
    QueryResult result = twitter.search(query);
    for (Status tweet : result.getTweets()) {
        String json = DataObjectFactory.getRawJSON(tweet);
        DBObject doc = (DBObject)JSON.parse(json);
        table.insert(doc);
        ps.println(doc);
    }
    System.out.println(i);
    ps.close();
	}
	}
}
