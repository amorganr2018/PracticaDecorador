
public abstract class DecoradorObjeto implements Elemento{
	
	private Objeto objeto;
	
	public DecoradorObjeto(Objeto pObjeto) {
		this.objeto = pObjeto;		
	}
	
	protected Objeto getObjeto() {
		return objeto;
	}
	

}
