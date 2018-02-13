package jad.test.hello;

import java.net.Inet4Address;
import java.net.UnknownHostException;

public class HelloHtml extends Hello{

	private static final String HTML = "" +
			"<html>" +
            "<body>" +
            "<h1>Hello World!</h1>" +
            "<h1>${serverName}</h1>" +
            "</body>" +
            "</html";
	
	@Override
	public String sayHello() {
        try {
            return HTML.replace("${serverName}", Inet4Address.getLocalHost().getHostName());
        } catch (UnknownHostException e) {
            e.printStackTrace();
            return HTML.replace("${serverName}", "Error");
        }
    }

}
