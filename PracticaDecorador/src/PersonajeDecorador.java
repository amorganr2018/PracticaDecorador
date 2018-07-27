
public abstract class PersonajeDecorador implements Elemento{
	
	private Personaje personaje;
	
	public PersonajeDecorador(Personaje pPersonaje) {
		this.personaje = pPersonaje;
	}
	
	protected Personaje getPersonaje() {
		return personaje;
	}

}
