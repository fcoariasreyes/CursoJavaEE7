package cl.programando.cursojavaee7.soapws;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.jws.WebService;


@WebService(endpointInterface = "cl.programando.cursojavaee7.soapws.WebServiceInterface")
public class WebServiceImpl implements WebServiceInterface{

	public Uf recuperarUf(String fecha) {
		// TODO Auto-generated method stub
		Uf uf = new Uf();
		uf.setFecha(new Date());
		uf.setValor(27500);
		
		return uf;
	}

	public Uf[] recuperarUfList(String desdeFecha) {
		// TODO Auto-generated method stub
		List<Uf> list = new ArrayList<Uf>();
		
		Uf uf1 = new Uf();
		uf1.setFecha(new Date());
		uf1.setValor(27500);
		
		Uf uf2 = new Uf();
		uf2.setFecha(new Date());
		uf2.setValor(27600);
		
		Uf uf3 = new Uf();
		uf3.setFecha(new Date());
		uf3.setValor(27700);
		
		list.add(uf1);
		list.add(uf2);
		list.add(uf3);
		
		return (Uf[]) list.toArray();
		
	}



}