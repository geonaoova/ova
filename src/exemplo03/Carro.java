package exemplo03;

import javax.swing.JOptionPane;

public class Carro {
	
	//Atributos
	String[] nomeCarro = new String[5];
	double[] valorCarro = new double[5];
	
	//Método para retornar pição livre do vetor
	public int posicaoLivre(){
		
		//Variável
		int posicao = 0;
		
		//Laço
		for(int i = 0; i < nomeCarro.length; i++){
			
			//Condicional
			if(nomeCarro[i] == null){
				posicao = i;
				break;
			}
		}
		
		return posicao;
	}
	
	//Realizar perguntas
	public void perguntas(){
		
		//Obter a posição
		int posicao = posicaoLivre();
		
		nomeCarro[posicao] = JOptionPane.showInputDialog("Informe o carro");
		valorCarro[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro"));
		
		
	}

	//Laco
	public void laco(){
		
		//Variável
		int continuar = 0;
		
		//Isso aqui é um laço
		do{
			
			perguntas();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
			
		}while(continuar == 0);
		
		ordenar();
		exibir();
	}
	
	//Método de ordenação
	public void ordenar(){
		
		//Variável
		String nomeMaiorCarro;
		double valorMaiorCarro;
		
		//Laço principal
		for(int i = 0; i < nomeCarro.length - 1; i++){
			
			//Laço secundário
			for(int i2 = i+1; i2 < nomeCarro.length; i2++){
				
				//Condicional
				if(valorCarro[i2] > valorCarro[i]){
					
					nomeMaiorCarro = nomeCarro[i];
					nomeCarro[i] = nomeCarro[i2];
					nomeCarro[i2] = nomeMaiorCarro;
					
					valorMaiorCarro = valorCarro[i];
					valorCarro[i] = valorCarro[i2];
					valorCarro[i2] = valorMaiorCarro;
				}
				
				
			}
		}
		
		
	}
	
	//Método exibir os carros e seus valores ordenados
	public void exibir(){
		
		//Variável contendo o texto que será exibido
		String msg = "******CARROS CADASTRADOS*****";
		
		//Laço
		for(int i = 0; i < nomeCarro.length; i++){
			
			if(nomeCarro[i] != null){
				msg += "\n"+nomeCarro[i]+" "+valorCarro[i];
			}
	
		}
	
	//Exibir Mensagem
	JOptionPane.showMessageDialog(null, msg);
	
	}
}
