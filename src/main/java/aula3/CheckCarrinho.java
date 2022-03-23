package aula3;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class CheckCarrinho
 */
public class CheckCarrinho extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CheckCarrinho() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		
		HttpSession session = request.getSession(false);
		
		if (session == null) {
			/* 
			 * HttpSession 	getSession()
			 * Returns the current session associated with this request, or if the request does not have a session, creates one.
			 * https://tomcat.apache.org/tomcat-5.5-doc/servletapi/javax/servlet/http/HttpServletRequest.html
			 * ----
			 * If method is empty is almost same as insert true boolean on method
			 * but boolean equals to false, return null if does not have a session created
			 * but boolean equals to true, if does not have a session created, method create another session for this request
			 * https://tomcat.apache.org/tomcat-5.5-doc/servletapi/javax/servlet/http/HttpServletRequest.html#getSession(boolean)
	        */
			out.println("<h1>Seu carrinho de compras esta vazio!</h1>");
		} else {
			ArrayList<String> carrinho = (ArrayList<String>) session.getAttribute("carrinho");
			
			if (carrinho != null) {
				for (int i = 0; i < carrinho.size(); i++) 
					out.println(carrinho.get(i));
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
