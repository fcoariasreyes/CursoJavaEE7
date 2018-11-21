package cl.programando.cursojavaee7.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class HelloServlet
 */
public class LoginServlet extends BaseServlet{

	public LoginServlet() {
		super("LOGIN");
	}
	
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String usuario = request.getParameter("usuario");
		String clave = request.getParameter("clave");
		
		//Guardamos en sesion el usuario
		HttpSession session = request.getSession();
		session.setAttribute("usuario", usuario);
		
		if (usuario.equalsIgnoreCase("admin"))
			session.setAttribute("privilegio", "ADMIN");
		else
			session.setAttribute("privilegio", "USER");
		
		
		//response.getWriter().append("<h1>Bienvenido "+usuario+" !!!</h1>");
		response.sendRedirect("principal.jsp");

		
	}

}
