package pilha.vetor.palindromo;

public class Pilha {
		int inicio;
	    int fim;
	    int qtdeElementos = 0;
	    Object [] p = new Object [5];

	    public Pilha() {
	        inicio = fim = -1;
	        qtdeElementos = 0;
	    }

	    public boolean estaVazia() {
	        if (qtdeElementos == 0) {
	            return true;
	        }
	        return false;
	    }

	    public boolean estaCheia() {
	        if (qtdeElementos == p.length) {
	            return true;
	        }
	        return false;
	    }

	    public void adicionar(Object obj) {
	        if (!estaCheia()) {
	            if (inicio == -1) {
	                inicio = 0;
	            }
	            fim++;
	            p[fim] = obj;
	            qtdeElementos++;
	        }
	    }

	    public void remover() {
	        if (!estaVazia()) {
	            fim--;
	            qtdeElementos--;
	        }
	    }

	    public Object topo() {
	        return p[qtdeElementos];
	    }
	    
	    public void mostrar() {
	        String elementos = "";
	        for (int i = inicio; i <= fim; i++) {
	            elementos += p[i] + " ";
	        }
	        System.out.println(elementos);
	    }
	}
