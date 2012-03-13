package camel.server;

import org.apache.camel.Exchange;
import org.apache.camel.Processor;

public class NettyProcessor implements Processor {

	@Override
	public void process(Exchange exchange) throws Exception {

		exchange.getOut().setBody("No soup for you.");
	}
}
