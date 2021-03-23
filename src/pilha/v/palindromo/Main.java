package pilha.v.palindromo;

public class Main {

	public static void main(String[] args) {
		Pilha pOri = new Pilha();
		pOri.adicionar("t");
		pOri.adicionar("e");
		pOri.adicionar("n");
		pOri.adicionar("e");
		pOri.adicionar("t");
		pOri.mostrar();
		
		Pilha pAux = new Pilha();
		pAux.adicionar("t");
		pAux.adicionar("e");
		pAux.adicionar("n");
		pAux.adicionar("e");
		pAux.adicionar("t");
		
		Pilha pSaida = new Pilha();
		
		while(pAux.estaVazia() == false){
			pAux.remover();
			pSaida.adicionar(pAux.topo());
		}
		pSaida.mostrar();
		
		String StringPilha1 = pOri.comparar();
		String StringPilha2 = pSaida.comparar();
		
		System.out.println("É palindromo?");
		if(StringPilha1.equals(StringPilha2)){
			System.out.println("sim");
		} else{
			System.out.println("não");
		}
	}
}
