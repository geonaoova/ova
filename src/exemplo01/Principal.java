package exemplo01;

import javax.swing.JOptionPane;

public class Principal {
	
	public static void main(String[] args) {
		
		//Instanciar
		Pessoa p1 = new Pessoa();
		p1.nome = "Geovani";
		p1.idade = 21;
		p1.peso = 59;
		p1.altura = 1.76;
		
		//Instancia outro objeto
		Pessoa p2 = new Pessoa();
		p2.nome = "Caio";
		p2.idade = 23;
		p2.peso = 72;
		p2.altura = 1.70;
				
		//invocar métodos
		p1.apresentacao();
		p1.exibirImc();
	}

}
