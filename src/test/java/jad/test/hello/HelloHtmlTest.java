package jad.test.hello;

import org.junit.Test;
import static org.junit.Assert.*;

public class HelloHtmlTest {
	@Test
	public void sayHelloTest(){
		String html = new HelloHtml().sayHello();
		boolean flag = html.contains("Hello");
		assertTrue(flag);
	}
}
