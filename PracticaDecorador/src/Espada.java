
public class Espada extends DecoradorObjeto{

	public Espada(Objeto pObjeto) {
		super(pObjeto);
	}
	
	public int ataque() {
		return getObjeto().ataque + 10;
	}
	
	public int defensa() {
		return getObjeto().defensa + 10;
	}
	
	public int vida() {
		return getObjeto().vida + 1;
	}	

}
