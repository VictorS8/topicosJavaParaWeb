package aula1;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AulaUm
 */
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String nomeUsuario = request.getParameter("usuario");
		String senhaUsuario = request.getParameter("senha");
		
		PrintWriter out = response.getWriter();
		
		if (nomeUsuario.equals("admin") && senhaUsuario.equals("123")) {
			request.getSession().setAttribute("usuario", nomeUsuario);
			response.sendRedirect("email.jsp");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("formlogin.html");
			dispatcher.forward(request, response);
		}
	}

}
