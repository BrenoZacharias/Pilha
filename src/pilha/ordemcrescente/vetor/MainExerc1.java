package pilha.ordemcrescente.vetor;

public class MainExerc1 {

	public static void main(String[] args) {
		
		PilhaExerc1 pA = new PilhaExerc1();
		PilhaExerc1 pB = new PilhaExerc1();
		
		pA.push(18);
		pA.push(4.64);
		pA.push(20);
		pA.push(-7.6);
		pA.push(3);

		while(!pA.estaVazia()) {
			pB.verifica(pA.pop());
		}
		
		while(!pB.estaVazia()) {
			pA.verifica(pB.pop());
		}
		
		pA.mostrar();
	}

}
