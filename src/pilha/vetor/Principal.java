package pilha.vetor;

public class Principal {

    public static void main(String[] args) {
        Pilha p = new Pilha();
        p.adicionar(10);
        p.adicionar(12);
        p.adicionar(30);
        p.mostrar();
        p.remover();
        p.mostrar();
    }
}