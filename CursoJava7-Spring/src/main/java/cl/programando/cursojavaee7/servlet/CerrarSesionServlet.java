package cl.programando.cursojavaee7.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/CerrarSesion")
public class CerrarSesionServlet extends HttpServlet {
	/**
     * @see HttpServlet#HttpServlet()
     */
    public CerrarSesionServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		if (!session.isNew()) {
			String usuario=(String)session.getAttribute("usuario");			
			response.getWriter().append("<b>Se cierra sesi&oacute;n "+usuario+"</b>");
		}else {
			response.getWriter().append("<b>No se encontraba sesi&oacute;n abierta</b>");
		}
		response.getWriter().append(" <a href='HelloServlet'>Volver al inicio</a>");

		session.invalidate(); //matas la sesion
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		
	}
}
