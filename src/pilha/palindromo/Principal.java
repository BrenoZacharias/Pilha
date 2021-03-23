package pilha.palindromo;

public class Principal {

	public static void main(String[] args) {
		
		LetraNumero obj1 = new LetraNumero();
		obj1.setObj("t");
		LetraNumero obj2 = new LetraNumero();
		obj2.setObj("e");
		LetraNumero obj3 = new LetraNumero();
		obj3.setObj("n");
		LetraNumero obj4 = new LetraNumero();
		obj4.setObj("e");
		LetraNumero obj5 = new LetraNumero();
		obj5.setObj("t");
		
		Pilha pOri = new Pilha();
		Pilha pAux = new Pilha();

		pAux.push(obj1);
		pAux.push(obj2);
		pAux.push(obj3);
		pAux.push(obj4);
		pAux.push(obj5);
		
		System.out.println("PILHA AUXILIAR:");
		pAux.mostraLetraNumero();
		
		System.out.println("PRIMEIRO ELEMENTO AUX: " + pAux.top());
		
		System.out.println("PILHA AUXILIAR:");
		pAux.mostraLetraNumero();
		
		pOri.push(obj1);
		pOri.push(obj2);
		pOri.push(obj3);
		pOri.push(obj4);
		pOri.push(obj5);
		
		Pilha pSaida = new Pilha();
		
	//	LetraNumero obj = new LetraNumero();
	//	obj = pAux.top();	
		
		pSaida.push(pAux.top());
		
		System.out.println("\nPILHA SAÍDA:");
		pSaida.mostraLetraNumero();
		
		System.out.println("\nPILHA ORIGINAL:");
		pOri.mostraLetraNumero();
		
		System.out.println("PILHA AUXILIAR:");
		pAux.mostraLetraNumero();
		
		System.out.println("\nSão iguais?");
		System.out.println(pAux.equals(pOri));
	}
}
