package pilha.ordemcrescente.v;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		Pilha pA = new Pilha();
		Pilha pB = new Pilha();
				
			double num = Double.parseDouble(JOptionPane.showInputDialog("Insira o 1 número real:"));
			pA.adicionar(num);
			
			double num2 = Double.parseDouble(JOptionPane.showInputDialog("Insira o 2 número real:"));
			pB.adicionar(num2);
			
			pA.ordemCrescente(pA, pB);
			
			pA.mostrar();
			pB.mostrar();
			}
	}

