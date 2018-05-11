package Lista02;

import javax.swing.JOptionPane;

public class Exe01 {

		
		//Atributos
		String nome, cargo, sexo; 
		int idade;
		
		//contadres
		int masculino, feminino, maiorIdade, gere, aten, acou,  secre, almo, pade, estag;
		
		//Metodo obter nome
		public void obterNome(){
			
			boolean valida = false;
			
			do{	
				nome = JOptionPane.showInputDialog("informe o nome").toLowerCase();
				
				if(nome.equals("")){
					JOptionPane.showMessageDialog(null, "O campo nome deve ser informado");
				}else{
					valida = true;
				}
			}while(valida == false);
		}
		
		//Método obter idade
		public void obterIdade(){
					
			boolean valida = false;
			
			do{	
				do{	
					valida = true;
					try{
						idade = Integer.parseInt(JOptionPane.showInputDialog("informe a idade"));
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "O campo idade deve conter apenas números");
						valida = false;
					}
				}while(valida == false);
				
				valida = false;
				if(idade == 0){
					JOptionPane.showMessageDialog(null, "O campo idade deve ser informado");
				}else{
					valida = true;
				}
			}while(valida == false);
		}
		
		//Metodo obter sexo
		public void obterSexo(){

			
			boolean valida = false;
			
			do{	
				sexo = JOptionPane.showInputDialog("informe o sexo usando \"M\" ou \"N\"").toLowerCase();
				
				if(sexo.equals("")){
					JOptionPane.showMessageDialog(null, "O campo sexo deve ser informado");
				}else if(sexo.equals("m") || sexo.equals("f")){
					valida = true;
				}
			}while(valida == false);
		}
		
		//Metodo obter cargo
		public void obterCargo(){

			
			boolean valida = false;
			
			do{	
				cargo = JOptionPane.showInputDialog("informe um cargo entre:\n\nGerente\nAtendente\nAçougueiro\nSecretária\nAlmoxarife\npadeiro\nSecretária").toLowerCase();
				
				if(cargo.equals("")){
					JOptionPane.showMessageDialog(null, "O campo cargo deve ser informado com um dos cargos");
				}else if (cargo.equals("gerente") || cargo.equals("atendente") || cargo.equals("açougueiro") || cargo.equals("secretária") || cargo.equals("almoxarife") || cargo.equals("padeiro") || cargo.equals("estagiário")){
					valida = true;
				}
			}while(valida == false);
		}

		//Método perguntar
		public void perguntar(){
			
				obterNome();
				obterIdade();
				obterSexo();
				obterCargo();
				
		}
		
		//Método laço
		public void laco(){
			
			//variável
			int continuar = 0;
			
			//Laço
			do{
				perguntar();
				contador();
				continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
			}while(continuar == 0);
			
			exibir();
		}
		
		//Método para contagens
		public void contador(){
			 
			
			//contar sexo
			if(sexo.equals("m")){
				masculino++;
			}else if(sexo.equals("f")){
				feminino++;
			}
			
			//Contadores maiores de idade
			if(idade >= 18){
				maiorIdade++;
			}
			
			//contar cargos
			if(cargo.equals("gerente")){
				gere++;
			}else if(cargo.equalsIgnoreCase("atendente")){
				aten++;
			}else if(cargo.equalsIgnoreCase("açougueiro")){
				acou++;
			}else if(cargo.equalsIgnoreCase("secretária")){
				secre++;
			}else if(cargo.equalsIgnoreCase("almoxarifado")){
				almo++;
			}else if(cargo.equalsIgnoreCase("padeiro")){
				pade++;
			}else if(cargo.equalsIgnoreCase("estagiário")){
				estag++;
			}
			
			
		}
		
		//Exibir
		public void exibir(){
			String msg = "Foram cadastrados";
				   msg+= "\n\n"+masculino+" homens e "+feminino+" mulheres";
				   msg+= "\n"+gere+" gerentes";
				   msg+= "\n"+aten+" atendentes";
				   msg+= "\n"+acou+" açougueiros";
				   msg+= "\n"+secre+" secretárias";
				   msg+= "\n"+almo+" almoxarifes";
				   msg+= "\n"+pade+" padeiros";
				   msg+= "\n"+estag+" estagiários";
				   msg+= "\n"+maiorIdade+" pessoas maiores de 18 anos";
				   
		JOptionPane.showMessageDialog(null, msg);
		}

	}


