package cl.programando.cursojavaee7.soapws;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;

@WebService(targetNamespace = "http://indicadores.programando.cl", name="WebServiceIndicadores")
@SOAPBinding(style=SOAPBinding.Style.RPC, use=SOAPBinding.Use.LITERAL)
public interface WebServiceInterface {

	@WebMethod(operationName="recuperarUfPorDia")
	public Uf recuperarUf(@WebParam(name="fecha") String fecha);

	@WebMethod(operationName="recuperarUfList")
	public Uf[] recuperarUfList(@WebParam(name="fecha") String desdeFecha);

}