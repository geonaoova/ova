package Lista02;

import javax.swing.JOptionPane;

public class Exe02 {
	
	//Atributos
	String nome, maiorPesoNome, maiorIdadeNome, maiorAlturaNome;
	int idade, maiorIdade, masculino, feminino;
	double peso, altura, maiorPeso, maiorAltura, somaAltura, media, participantes;
	
	//M�todo obter nome
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
	
	//M�todo obter altura
		public void obterAltura(){
					
			boolean valida = false;
			
			do{	
				do{	
					valida = true;
					try{
						altura = Double.parseDouble(JOptionPane.showInputDialog("informe a altura"));
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "O campo altura deve conter apenas n�meros e ponto");
						valida = false;
					}
				}while(valida == false);
				
				valida = false;
				if(altura == 0){
					JOptionPane.showMessageDialog(null, "O campo altura deve ser informado");
				}else{
					valida = true;
				}
				
			}while(valida == false);
		}
		
		//M�todo obter peso
		public void obterPeso(){
					
			boolean valida = false;
			
			do{	
				do{	
					valida = true;
					try{
						peso = Double.parseDouble(JOptionPane.showInputDialog("informe a peso"));
					}catch(Exception e){
						JOptionPane.showMessageDialog(null, "O campo peso deve conter apenas n�meros");
						valida = false;
					}
				}while(valida == false);
				
				valida = false;
				if(peso == 0){
					JOptionPane.showMessageDialog(null, "O campo peso deve ser informado");
				}else{
					valida = true;
				}
			}while(valida == false);
		}
		
		//M�todo para contagens
		public void contador(){
			 			
			
			//contar cargos
			if(idade > maiorIdade){
				maiorIdadeNome = nome;
				maiorIdade = idade;
			}if(peso > maiorPeso){
				maiorPesoNome = nome;
				maiorPeso = peso;
			}if(altura > maiorAltura){
				maiorAlturaNome = nome;
				maiorAltura = altura;
			}
			
			somaAltura+= altura;
			participantes++;
			
		}
		
		//Media
		public void calculoMedia(){
			
			media = somaAltura / participantes;
			
		}
		
		//Exibir
		public void exibir() {
			
			//Mensagem
			String msg = "******Parcial jogadores*******";
				   msg+= "\nForam cadastrados "+String.format("%.0f", participantes)+" jogadores";
				   msg+= "\n O jogador mais velho � : "+maiorIdadeNome+", ele tem "+ maiorIdade;
				   msg+= "\n O jogador mais pesado � : "+maiorPesoNome+", ele tem "+maiorPeso;
				   msg+= "\n O jogador mais alto � : "+maiorAlturaNome+", ele tem "+maiorAltura;
				   msg+= "\nA m�dia de altura �: "+String.format("%.2f", media);
				   
			//Exibir mensagem
			JOptionPane.showMessageDialog(null, msg);
		}
		
		//La�o
		public void laco(){
			obterNome();
			
			while(!nome.equals("sair")){
				
				obterIdade();
				obterAltura();
				obterPeso();
				contador();
				obterNome();
			}
			
			calculoMedia();
			
			exibir();
			}
		}


