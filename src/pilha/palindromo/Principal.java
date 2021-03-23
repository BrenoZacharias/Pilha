package pilha.palindromo;

public class Principal {

	public static void main(String[] args) {
		
		LetraNumero obj1 = new LetraNumero(), obj2 = new LetraNumero(), obj3 = new LetraNumero();
		LetraNumero obj4= new LetraNumero(), obj5 = new LetraNumero();
		obj1.setObj("t");
		obj2.setObj("e");
		obj3.setObj("n");
		obj4.setObj("e");
		obj5.setObj("t");
		
		Pilha pAux = new Pilha();

		pAux.push(obj1);
		pAux.push(obj2);
		pAux.push(obj3);
		pAux.push(obj4);
		pAux.push(obj5);
		
		System.out.println("PILHA AUXILIAR:");
		pAux.mostraLetraNumero();
		
		Pilha pOri = new Pilha();

		pOri.push(obj1);
		pOri.push(obj2);
		pOri.push(obj3);
		pOri.push(obj4);
		pOri.push(obj5);
		
		Pilha pSaida = new Pilha();
		
		for(int sla = pAux.getQtdeElementos(); sla > 0; sla--) {
			pSaida.push(pAux.top());
			pAux.pop();
		}
		
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
