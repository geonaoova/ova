package Lista02;

import javax.swing.JOptionPane;

public class main {

	public static void main(String[] args) {
		
		int exercicio;
		
		Exe03 b = new Exe03();
		b.exibirMenu();
		
		exercicio = Integer.parseInt(JOptionPane.showInputDialog("Qual exercício deseja ver?"));

		if(exercicio == 1){
			JOptionPane.showMessageDialog(null, "Será exibido o 1º exercício");
		Exe01 a = new Exe01();
		a.laco();
		}else if(exercicio == 2){
			Exe02 a = new Exe02();
			a.laco();
		}

		

	}

}
