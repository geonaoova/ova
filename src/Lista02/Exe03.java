package Lista02;

import javax.swing.JOptionPane;

public class Exe03 {
	
	//Atributos
	String[][] menu = {
			           {"1", "Hambúrguer + Suco de Laranja", "5.00"},
					   {"2", "Sanduíche natural + Suco de Uva", "4.50"},
					   {"3", "Prato do dia", "8.00"},
					   {"4", "Pizza", "12.00"}, 
					   {"5", "Lasanha", "16.50"},
					   {"6", "Pão de queijo", "1.00"},
					   {"7", "Bolo", "2.50"},
					   
	};
	String[][] pedido = new String[50][2];
	String listaMenu, resposta;
	
	public void exibirMenu(){
		
		for(int i = 0; i <= 7; i++){
			listaMenu+="\n";
			
			for(int i2 = 0; i2 <= 3; i++){
				listaMenu+= menu[i2][i];
			}
		}
		
		JOptionPane.showMessageDialog(null, listaMenu);
	}
	
	public void fazerPedido(){
		
		resposta = JOptionPane.showInputDialog("Qual item vc deseja?");
	}
}
