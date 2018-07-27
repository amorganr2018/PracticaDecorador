
public class Mago extends PersonajeDecorador {

	public Mago(Personaje pPersonaje) {
		super(pPersonaje);
	}
	
	public void vida() {
		getPersonaje().vida = 8;		
	}
	
	public void ataque() {
		getPersonaje().ataque = 15;
	}
	
	public void defensa() {
		getPersonaje().defensa = 15;
	}
	
	public void magia() {
		getPersonaje().magia = 40;
	}	
	
}
