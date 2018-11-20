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
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("<html>");
		response.getWriter().append("<body>");
		
		HttpSession session = request.getSession();
		
		if (!session.isNew()) {
			String usuario=(String)session.getAttribute("usuario");
			response.getWriter().append("<b>Ya se encuentra activo el usuario "+usuario+"</b>");
		
		}
		
		response.getWriter().append("<form action='#' method='POST'>");
		response.getWriter().append("<label>Usuario:</label>");
		response.getWriter().append("<input type='text' id='usuario' name='usuario' />");
		response.getWriter().append("<label>Clave:</label>");
		response.getWriter().append("<input type='password' id='clave' name='clave'/>");
		response.getWriter().append("<input type='submit' value='ingresar' />");
		response.getWriter().append("</form>");
		response.getWriter().append("</body>");
		response.getWriter().append("</html>");
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
		
		response.getWriter().append("<h1>Bienvenido "+usuario+" !!!</h1>");
		

		
	}

}
