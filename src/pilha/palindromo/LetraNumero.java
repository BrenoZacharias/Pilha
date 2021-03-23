package pilha.palindromo;

public class LetraNumero {

	Object obj; 
	LetraNumero anterior;

	public void setObj(Object obj) {
		this.obj = obj;
	}
	
	public Object getObj() {
		return obj;
	}

	public LetraNumero getAnterior() {
		return anterior;
	}

	public void setAnterior(LetraNumero anterior) {
		this.anterior = anterior;
	}
	
	@Override
	public String toString() {
		return "" + obj;
	}
}

