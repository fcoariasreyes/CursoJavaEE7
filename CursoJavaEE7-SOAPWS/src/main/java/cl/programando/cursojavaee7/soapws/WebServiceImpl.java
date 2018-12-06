package cl.programando.cursojavaee7.soapws;

import javax.jws.WebService;


@WebService(endpointInterface = "cl.programando.cursojavaee7.soapws.WebServiceInterface")
public class WebServiceImpl implements WebServiceInterface{

	public String printMessage() {
		return "Hello from Java Code Geeks Server";
	}

}