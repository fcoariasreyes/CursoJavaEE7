package cl.programando.cursojavaee7.spring.object;

public class JineteObject extends PersonaObject{

	private CaballoObject caballo;

	public CaballoObject getCaballo() {
		return caballo;
	}

	public void setCaballo(CaballoObject caballo) {
		this.caballo = caballo;
	}

	@Override
	public String toString() {
		return "JineteObject [caballo=" + caballo + "]";
	}
	
	
	
	
}
