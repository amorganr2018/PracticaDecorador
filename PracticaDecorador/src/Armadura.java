public class Armadura extends DecoradorObjeto{

	public Armadura(Objeto pObjeto) {
		super(pObjeto);
	}
	
	public int defensa() {
		return getObjeto().defensa + 20;
	}
	
	public int vida() {
		return getObjeto().vida + 20;
	}	

}