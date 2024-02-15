package aula2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.Map;
import org.apache.commons.beanutils.BeanUtils;

/**
 * Servlet implementation class BeanUtilities
 */
public class BeanUtilities extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	public static void populateBean(Object formBean, HttpServletRequest request) {
		populateBean(formBean, request.getParameterMap());
	}

	public static void populateBean(Object bean, Map propertyMap) {
		try {
			BeanUtils.populate(bean,propertyMap);
		} catch (Exception e) {}
	}
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BeanUtilities() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//String atributo = request.getParameter("nome");
		PrintWriter out = response.getWriter();
		Carro c = new Carro();
		BeanUtilities.populateBean(c, request);
		out.println("<html>");
		out.println("<h1> Ano: " + c.getAno() + "</h1>");
		out.println("<h1> Marca: " + c.getMarca() + "</h1>");
		out.println("<h1> Modelo: " + c.getModelo() + "</h1>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

class Carro {
	String ano;
	String marca;
	String modelo;
	
	String getAno() {
		return ano;
	}
	
	void setAno(String ano) {
		this.ano = ano;
	}
	
	String getMarca() {
		return marca;
	}
	
	void setMarca(String marca) {
		this.marca = marca;
	}
	
	String getModelo() {
		return modelo;
	}
	
	void setModelo(String modelo) {
		this.modelo = modelo;
	}
	
}
