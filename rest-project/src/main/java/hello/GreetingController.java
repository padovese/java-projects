package hello;

import java.util.concurrent.atomic.AtomicLong;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
public class GreetingController {

    private static final String TEMPLATE = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public String greeting(@RequestParam(value="name", defaultValue="World") String name) throws JsonProcessingException {
    	ObjectMapper objectMapper = new ObjectMapper();
    	
    	Greeting g = new Greeting(counter.incrementAndGet(),
                            String.format(TEMPLATE, name));
    	String jsonInString = objectMapper.writeValueAsString(g);
    	System.out.println(jsonInString);
    	return jsonInString;
    }
}