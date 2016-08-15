package jad.test.hello;

public class HelloHtml extends Hello{

	private static final String HTML = "<html><body><h1>Hello Vagrant!</h1></body></html";
	
	@Override
	public String sayHello() {
		return HTML;
	}

}
