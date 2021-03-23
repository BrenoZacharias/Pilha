package pilha.ordemcrescente;

import pilha.encadeada.Livro;

public class Pilha {
	 private Livro topo, anterior;

	    public void push(Livro livro) { //empilhar
	        if (anterior == null) {
	            anterior = livro;
	        } else {
	            topo = livro;
	            topo.setAnterior(anterior);
	            anterior = topo;
	        }
	    }

	    public void pop() {
	        topo = topo.getAnterior();
	        anterior = topo;
	    }

	    public Livro top() {
	        return topo;
	    }

	    public void mostraLivros() {
	        Livro aux = topo;

	        while (aux != null) {
	            System.out.println(aux.toString());
	            aux = aux.getAnterior();
	        }
	    }
	}
}
