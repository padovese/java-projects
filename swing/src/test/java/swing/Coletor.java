package swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import com.mongodb.DBObject;
import com.mongodb.util.JSON;

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

public class Coletor extends JFrame implements ActionListener
{
    JTextField txtdata;
    JButton calbtn = new JButton("Coletar");
    JLabel texto = new JLabel("Digite seu par�metro de coleta:");

    public Coletor()
    {
        JPanel myPanel = new JPanel();
        add(myPanel);
        myPanel.setLayout(new GridLayout(3, 2));
        myPanel.add(texto);
        txtdata = new JTextField();
        myPanel.add(txtdata);
        myPanel.add(calbtn);
        calbtn.addActionListener(this);

        
        setLocationRelativeTo(null);
        setSize(300, 120);
        setTitle("Coletor de Tweets");
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public void actionPerformed(ActionEvent e)
    {
        if (e.getSource() == calbtn) {
            String data = txtdata.getText(); //perform your operation
            System.out.println(data);
	
        }
    }

    public static void main(String args[]) throws FileNotFoundException, TwitterException
    {
        Swingtest g = new Swingtest();
        g.setVisible(true);
    }
    
    public void geraTxt(String data) throws FileNotFoundException, TwitterException{
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

		PrintStream ps = new PrintStream(data + dateFormat.format(date) + ".txt");

		ConfigurationBuilder cb = new ConfigurationBuilder();
		cb.setJSONStoreEnabled(true);
		
	    Query query = new Query(data);
	    query.setCount(100);
	    QueryResult result;

		result = twitter.search(query);

	    for (Status tweet : result.getTweets()) {
	        String json = DataObjectFactory.getRawJSON(tweet);
	        ps.println(json);
	        System.out.println(json);
	    }
	    ps.close();
    }
}