package pilha.ordemcrescente.v;

public class Pilha {
	int inicio;
    int fim;
    int qtdeElementos = 0;
    double p[] = new double [5];

    public Pilha() {
        inicio = fim = -1;
    }

    public boolean estaVazia() {
        if (qtdeElementos == 0) {
            return true;
        }
        return false;
    }

    public boolean estaCheia() {
        if (qtdeElementos == p.length - 1) {
            return true;
        }
        return false;
    }

    public void adicionar(double e) {
        if (!estaCheia()) {
            if (inicio == -1) {
                inicio = 0;
            }
            fim++;
            p[fim] = e;
            qtdeElementos++;
        }
    }

    public void remover() {
        if (!estaVazia()) {
            fim--;
            qtdeElementos--;
        }
    }
    
    private void removerCabeca() {
    	if (!estaVazia()) {
    		for(int i = 0; i < p.length - 1; i++){
    			p[i] = p[i + 1];
    		}
            fim--;
            qtdeElementos--;
        }
	}

    public double topo() {
        return p[fim];
    }
    
    public double cabeca() {
        return p[inicio];
    }
    
    public void mostrar() {
        String elementos = "";
        for (int i = fim; i >= 0; i--) {
            elementos += p[i] + " - ";
        }
        System.out.println(elementos);
    }
    
    public int getQtdeElementos(){
    	return qtdeElementos;
    }
    
    public void ordemCrescente(Pilha pA, Pilha pB) {
    	if(pB.topo() >= pA.topo()) {
			pA.adicionar(pB.topo());
			pB.remover();
		} else {
			while(pA.getQtdeElementos()!=0){
				pB.adicionar(pA.topo());
				pA.remover();
			}
			while(pB.getQtdeElementos()!=0){
				pA.adicionar(pB.cabeca());
				pB.removerCabeca();
			}
		}
    }

	
}
