
public class Guerrero extends PersonajeDecorador {
	
	public Guerrero(Personaje pPersonaje) {
		super(pPersonaje);
	}
	
	public void vida() {
		getPersonaje().vida = 20;
	}
	
	public void ataque() {
		getPersonaje().ataque = 30;
	}
	
	public void defensa() {
		getPersonaje().defensa = 30;
	}
	
	public void magia() {
		getPersonaje().magia = 20;
	}	

}
