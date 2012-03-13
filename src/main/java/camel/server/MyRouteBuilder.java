package camel.server;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import org.apache.camel.builder.RouteBuilder;
import org.apache.camel.spring.Main;

/**
 * A Camel Router
 *
 * @version $
 */
public class MyRouteBuilder extends RouteBuilder {

    /**
     * A main() so we can easily run these routing rules in our IDE
     * @throws Exception 
     */
    public static void main(String... args) throws Exception {
        Main.main(args);
    }

    /**
     * Lets configure the Camel routing rules using Java code...
     */
    public void configure() {

    	// don't do anything here, define the routes in 
    	// src/main/resources/META-INF/spring/camel-context.xml
    	
	    from("netty:tcp://localhost:5155?sync=true")
	      .process(new Processor() {
	         public void process(Exchange exchange) throws Exception {
	           exchange.getOut().setBody("No soup for you.");
	         }
	      });
    }
}
