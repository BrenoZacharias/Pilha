package pilha.palindromo;

public class Pilha {

	private LetraNumero topo, anterior;
	
	public void push(LetraNumero obj) {
		if (anterior == null){
			anterior = obj;
		} else {
			topo = obj;
			topo.setAnterior(anterior);
			anterior = topo;
		}
	}
	
	public void pop() {
		topo = topo.getAnterior();
		anterior = topo;
	}
	
	public LetraNumero top() {
		return topo;
	}
	
	public void mostraLetraNumero() {
		LetraNumero aux = topo;
		
		while(aux!=null){
			System.out.println(aux.toString());
			aux = aux.getAnterior();
		}
	}
}
