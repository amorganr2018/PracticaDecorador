
public class Escudo extends DecoradorObjeto{

	public Escudo(Objeto pObjeto) {
		super(pObjeto);
	}

	public int defensa() {
		return getObjeto().defensa + 40;
	}
	
	public int vida() {
		return getObjeto().vida + 10;
	}	

}
