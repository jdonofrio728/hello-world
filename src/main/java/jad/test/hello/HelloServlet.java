package jad.test.hello;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(loadOnStartup=1, name="HelloServlet", urlPatterns={"/*"}, displayName = "Hello Servlet")
public class HelloServlet extends HttpServlet{
	private static final long serialVersionUID = 1L;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		log("Received Request");
		resp.setContentType("text/html");
		resp.getWriter().write(new HelloHtml().sayHello());
	}

}
