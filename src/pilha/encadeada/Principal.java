package pilha.encadeada;

public class Principal {

	public static void main(String[] args) {
        Livro l1 = new Livro("Livro 1", 2019, 29.99);
        Livro l2 = new Livro("Livro 2", 2017, 15.99);
        Livro l3 = new Livro("Livro 3", 2015, 27.99);
        Livro l4 = new Livro("Livro 4", 2014, 17.99);

        Pilha p = new Pilha();

        p.push(l1); //empilhar o livro l1
        p.push(l2); //empilhar o livro l2
        p.push(l3); //empilhar o livro l3
        p.push(l4); //empilhar o livro l4

        System.out.println("===================");
        System.out.println("Topo: \n" + p.top());

        System.out.println("===================");
        System.out.println("Todos Elementos:");
        p.mostraLivros();

        System.out.println("===================");
        System.out.println("Removendo um livro:");

        p.pop();

        p.mostraLivros();

        System.out.println("===================");
        System.out.println("Topo: \n" + p.top());
    }
}