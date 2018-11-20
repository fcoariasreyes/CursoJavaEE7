package cl.programando.cursojavaee7.spring.object;

public class CaballoObject extends AnimalObject{

	@Override
	public String toString() {
		
		return "CaballoObject []";
	}
	
	public static CaballoObject copy(CaballoObject caballo) {
		CaballoObject object = new CaballoObject();
		object.setDv(caballo.getDv());
		object.setNombre(caballo.getNombre());
		
		
		return object;	
		
	}

	
	
}
