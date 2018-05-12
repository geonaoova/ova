package exemplo02;

import javax.swing.JOptionPane;

public class Aluno {

	
	//Atributos
			String nome;
			double nota1, nota2, nota3;
			int aprovados = 0, reprovados = 0;
			
			//M�todo para realizar as perguntas
			public void perguntas() {
				
				nome = JOptionPane.showInputDialog("Informe o nome do aluno");
				nota1 = Double.parseDouble(JOptionPane.showInputDialog("1� nota"));
				nota2 = Double.parseDouble(JOptionPane.showInputDialog("2� nota"));
				nota3 = Double.parseDouble(JOptionPane.showInputDialog("3� nota"));
				
			}
			
			//M�todo de repeti��o
			public void laco() {
				
				//Vari�vel
				int continuar = 0;
				
				//la�o
				do{
					perguntas();
					exibirSituacao();
					contarAprovadosReprovados();
					continuar = JOptionPane.showConfirmDialog(null, "Deseja continuar?", "", 0);
				}while(continuar == 0);
				
				exibirAprovadosReprovados();
			}
			
			//M�todo para retornar o c�lculo de m�dia
			public double calculoMedia(){
				
				double media = (nota1+nota2+nota3)/3;
				
				return media;
			}
			
			//M�todo para retornar a situa��o do aluno
			public String situacaoAluno() {
				
				String situacao = calculoMedia() >= 7 ? "Aprovado":"Reprovado";
				
				return situacao;
			}
			
			//Exibir m�dia e situa��o
			public void exibirSituacao() {
				
				//Mensagem
				String msg = "******Informa��es do aluno*******";
					   msg+= "\nSua m�dia �: "+String.format("%.2f", calculoMedia());
					   msg+= "\n Sua situa��o �: "+situacaoAluno();
					   
				//Exibir mensagem
				JOptionPane.showMessageDialog(null, msg);
			}
			
			//Contador aprovados e reprovados
			public void contarAprovadosReprovados(){
				
				if(calculoMedia() >= 7){
					aprovados++;
				}else{
					reprovados++;
				}
				
			}
			
			//Exibir quantidade de aprovados
			public void exibirAprovadosReprovados() {
				
				String msg = "Aprovados x Reprovados";
					   msg+= "\nalunos aprovados: "+aprovados;
					   msg+= "\nalunos reprovados: "+reprovados;
			
				//Exibir mensagem aprovados e reprovados
				JOptionPane.showMessageDialog(null, msg);
			}
			

}
