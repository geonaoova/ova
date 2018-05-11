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
		
		//M�todo obter idade
		public void obterIdade(){
					
			boolean valida = false;
			
			do{	
				do{	
					valida = true;
					try{
						idade = Integer.parseInt(JOptionPane.showInputDialog("informe a idade"));
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "O campo idade deve conter apenas n�meros");
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
				cargo = JOptionPane.showInputDialog("informe um cargo entre:\n\nGerente\nAtendente\nA�ougueiro\nSecret�ria\nAlmoxarife\npadeiro\nSecret�ria").toLowerCase();
				
				if(cargo.equals("")){
					JOptionPane.showMessageDialog(null, "O campo cargo deve ser informado com um dos cargos");
				}else if (cargo.equals("gerente") || cargo.equals("atendente") || cargo.equals("a�ougueiro") || cargo.equals("secret�ria") || cargo.equals("almoxarife") || cargo.equals("padeiro") || cargo.equals("estagi�rio")){
					valida = true;
				}
			}while(valida == false);
		}

		//M�todo perguntar
		public void perguntar(){
			
				obterNome();
				obterIdade();
				obterSexo();
				obterCargo();
				
		}
		
		//M�todo la�o
		public void laco(){
			
			//vari�vel
			int continuar = 0;
			
			//La�o
			do{
				perguntar();
				contador();
				continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
			}while(continuar == 0);
			
			exibir();
		}
		
		//M�todo para contagens
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
			}else if(cargo.equalsIgnoreCase("a�ougueiro")){
				acou++;
			}else if(cargo.equalsIgnoreCase("secret�ria")){
				secre++;
			}else if(cargo.equalsIgnoreCase("almoxarifado")){
				almo++;
			}else if(cargo.equalsIgnoreCase("padeiro")){
				pade++;
			}else if(cargo.equalsIgnoreCase("estagi�rio")){
				estag++;
			}
			
			
		}
		
		//Exibir
		public void exibir(){
			String msg = "Foram cadastrados";
				   msg+= "\n\n"+masculino+" homens e "+feminino+" mulheres";
				   msg+= "\n"+gere+" gerentes";
				   msg+= "\n"+aten+" atendentes";
				   msg+= "\n"+acou+" a�ougueiros";
				   msg+= "\n"+secre+" secret�rias";
				   msg+= "\n"+almo+" almoxarifes";
				   msg+= "\n"+pade+" padeiros";
				   msg+= "\n"+estag+" estagi�rios";
				   msg+= "\n"+maiorIdade+" pessoas maiores de 18 anos";
				   
		JOptionPane.showMessageDialog(null, msg);
		}

	}


