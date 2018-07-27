
public class Trabajador extends PersonajeDecorador {
	
	public Trabajador(Personaje pPersonaje) {
		super(pPersonaje);
	}
	
	public void vida() {
		getPersonaje().vida = 25;
	}
	
	public void ataque() {
		getPersonaje().ataque = 10;
	}
	
	public void defensa() {
		getPersonaje().defensa = 10;
	}
	
	public void magia() {
		getPersonaje().magia = 10;
	}	

}
