package pilha.palindromo;

public class Pilha {

	private LetraNumero topo, anterior;
	private int qtdeElementos = 0;
	
	public Pilha() {
		qtdeElementos = 0;
	}
	
	public void push(LetraNumero obj) {
		if (anterior == null){
			anterior = obj;
		} else {
			topo = obj;
			topo.setAnterior(anterior);
			anterior = topo;
		}
		qtdeElementos ++;
	}
	
	public void pop() {
		if(qtdeElementos==2){
			topo = topo.getAnterior();
		} 
		else if (qtdeElementos==1){
			topo = null;
		} 
		else{
			topo = topo.getAnterior();
			anterior = topo;
		}
		qtdeElementos --;
	}
	
	public boolean estaVazia() {
        if (qtdeElementos == 0) {
            return true;
        }
        return false;
    }
	
	public int getQtdeElementos(){
		return qtdeElementos;
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
