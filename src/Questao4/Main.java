package Questao4;
import javax.swing.JOptionPane;



		public class Main {

			public static void main(String[] args) {
				
				popular[] carros = new popular[100];
				int cont = 0;
				do{
				
					String  op = JOptionPane.showInputDialog("(1) Cadastro Carro Popular \n(2) Calcular Pre�o \n(3) Sair");
					
					switch (op) {
						case "1":
							
							int PB = Integer.parseInt( JOptionPane.showInputDialog("Qual o pre�o base? "));
							boolean ABS = Boolean.parseBoolean( JOptionPane.showInputDialog("Deseja abs? \n1 - Sim \n0 - N�o"));
							boolean AB = Boolean.parseBoolean( JOptionPane.showInputDialog("Deseja airbag? \n1 - Sim \n0 - N�o"));
							boolean AL = Boolean.parseBoolean( JOptionPane.showInputDialog("Deseja alarme? \n1 - Sim \n0 - N�o)"));
							boolean SOM = Boolean.parseBoolean( JOptionPane.showInputDialog("Deseja som? \n1 - Sim \n0 - N�o"));
							boolean CE = Boolean.parseBoolean( JOptionPane.showInputDialog("Deseja conjunto Eletrico? \n1 - Sim \n0 - N�o"));
							boolean CB = Boolean.parseBoolean( JOptionPane.showInputDialog("Deseja computador Bordo? \n1 - Sim \n0 - N�o"));
							
							carros[cont] = new popular(PB, ABS, AB, AL, SOM, CE, CB);
							
							cont++;
							break;
						case "2":
							
							JOptionPane.showMessageDialog(null, "Pre�o final: "+ carros[cont - 1].calcularPrecoFinalPopular());
							
							break;
						case "3":
							JOptionPane.showMessageDialog(null, "OK!");
							cont = 1000;
							break;
						default:
							JOptionPane.showMessageDialog(null, "Resposta Inval�da");
					}
					
					
				}while(cont != 1000);
			}
	}
