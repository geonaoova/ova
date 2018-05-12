package exemplo03;

import javax.swing.JOptionPane;

public class Carro {
	
	//Atributos
	String[] nomeCarro = new String[5];
	double[] valorCarro = new double[5];
	
	//M�todo para retornar pi��o livre do vetor
	public int posicaoLivre(){
		
		//Vari�vel
		int posicao = 0;
		
		//La�o
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
		
		//Obter a posi��o
		int posicao = posicaoLivre();
		
		nomeCarro[posicao] = JOptionPane.showInputDialog("Informe o carro");
		valorCarro[posicao] = Double.parseDouble(JOptionPane.showInputDialog("Informe o valor do carro"));
		
		
	}

	//Laco
	public void laco(){
		
		//Vari�vel
		int continuar = 0;
		
		//Isso aqui � um la�o
		do{
			
			perguntas();
			continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
			
		}while(continuar == 0);
		
		ordenar();
		exibir();
	}
	
	//M�todo de ordena��o
	public void ordenar(){
		
		//Vari�vel
		String nomeMaiorCarro;
		double valorMaiorCarro;
		
		//La�o principal
		for(int i = 0; i < nomeCarro.length - 1; i++){
			
			//La�o secund�rio
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
	
	//M�todo exibir os carros e seus valores ordenados
	public void exibir(){
		
		//Vari�vel contendo o texto que ser� exibido
		String msg = "******CARROS CADASTRADOS*****";
		
		//La�o
		for(int i = 0; i < nomeCarro.length; i++){
			
			if(nomeCarro[i] != null){
				msg += "\n"+nomeCarro[i]+" "+valorCarro[i];
			}
	
		}
	
	//Exibir Mensagem
	JOptionPane.showMessageDialog(null, msg);
	
	}
}
