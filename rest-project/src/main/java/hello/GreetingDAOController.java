package hello;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import DAO.ConnectionFactory;
import DAO.GreetingDAO;

@RestController
public class GreetingDAOController {

    @RequestMapping("/greetingDAO")
    public Greeting greeting(@RequestParam(value="id", defaultValue="1") int p_id) throws SQLException {
        
    	System.out.println(p_id);
    	
	Connection connection = new ConnectionFactory().getConnection();
	System.out.println("Abrindo uma conex�o com sucesso.");
			
    	
    List<Greeting> greetingDAO = new GreetingDAO(connection).lista(p_id);
    
    int id;
    String content;
    
    for(Greeting g : greetingDAO) {
    	System.out.println(g.getId());
    	System.out.println(g.getContent());
    	
    	id = (int) g.getId();
    	content = g.getContent();
    
    	return new Greeting(id, content);
    }
    	
    connection.close();
    
	return new Greeting(0, "error");
    }
}