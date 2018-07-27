
public class Amuleto extends DecoradorObjeto{

	public Amuleto(Objeto pObjeto) {
		super(pObjeto);
	}

	public int magia() {
		return getObjeto().magia + 10;
	}
	
}
