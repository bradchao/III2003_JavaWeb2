package tw.org.iii;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.LinkedList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/Brad11")
public class Brad11 extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		PrintWriter out = response.getWriter();
		
		String name = request.getParameter("name");
		String price = request.getParameter("price");
		
		out.print("Hello, World:" + name + ":" + price);
		
		LinkedList<HashMap<String,Integer>> line = 
				(LinkedList<HashMap<String,Integer>>)
				request.getAttribute("linedata");
		
		for (HashMap<String,Integer> point : line){
			out.println(point.get("x") + "  x " + point.get("y") + "<br>");
		}
		
		
	}
}
