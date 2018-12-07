package cl.programando.cursojavaee7.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cl.programando.cursojavaee7.soapws.WebServiceImplService;
import cl.programando.cursojavaee7.soapws.WebServiceIndicadores;
import cl.programando.indicadores.Uf;

@WebServlet("/Indicadores")
public class IndicadoresServlet extends HttpServlet{
	

	public IndicadoresServlet() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		WebServiceImplService ws = new WebServiceImplService();
		WebServiceIndicadores port = ws.getWebServiceImplPort();
		
		Uf uf = port.recuperarUfPorDia("2222");
		
		response.getWriter().append("UF dia "+uf.getFecha()+ " ::: "+uf.getValor());

		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		
	}

}
