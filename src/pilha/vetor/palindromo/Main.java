package pilha.vetor.palindromo;

public class Main {

	public static void main(String[] args) {
		Pilha pOri = new Pilha();
		pOri.adicionar(1);
		pOri.adicionar(2);
		pOri.adicionar(3);
		pOri.adicionar(4);
		pOri.adicionar(5);
		pOri.mostrar();
		
		Pilha pAux = new Pilha();
		pAux.adicionar(1);
		pAux.adicionar(2);
		pAux.adicionar(3);
		pAux.adicionar(4);
		pAux.adicionar(5);
		
		Pilha pSaida = new Pilha();
		
		while(pAux.estaVazia() == false){
			pAux.remover();
			pSaida.adicionar(pAux.topo());
		}
		pSaida.mostrar();
	}
}
