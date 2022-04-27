package Questao4;
import javax.swing.JOptionPane;



		public class Main {

			public static void main(String[] args) {
				
				popular[] carros = new popular[100];
				int cont = 0;
				do{
				
					String  op = JOptionPane.showInputDialog("(1) Cadastro Carro Popular \n(2) Calcular Preço \n(3) Sair");
					
					switch (op) {
						case "1":
							
							int PB = Integer.parseInt( JOptionPane.showInputDialog("Qual o preço base? "));
							boolean ABS = Boolean.parseBoolean( JOptionPane.showInputDialog("Deseja abs? \n1 - Sim \n0 - Não"));
							boolean AB = Boolean.parseBoolean( JOptionPane.showInputDialog("Deseja airbag? \n1 - Sim \n0 - Não"));
							boolean AL = Boolean.parseBoolean( JOptionPane.showInputDialog("Deseja alarme? \n1 - Sim \n0 - Não)"));
							boolean SOM = Boolean.parseBoolean( JOptionPane.showInputDialog("Deseja som? \n1 - Sim \n0 - Não"));
							boolean CE = Boolean.parseBoolean( JOptionPane.showInputDialog("Deseja conjunto Eletrico? \n1 - Sim \n0 - Não"));
							boolean CB = Boolean.parseBoolean( JOptionPane.showInputDialog("Deseja computador Bordo? \n1 - Sim \n0 - Não"));
							
							carros[cont] = new popular(PB, ABS, AB, AL, SOM, CE, CB);
							
							cont++;
							break;
						case "2":
							
							JOptionPane.showMessageDialog(null, "Preço final: "+ carros[cont - 1].calcularPrecoFinalPopular());
							
							break;
						case "3":
							JOptionPane.showMessageDialog(null, "OK!");
							cont = 1000;
							break;
						default:
							JOptionPane.showMessageDialog(null, "Resposta Invalída");
					}
					
					
				}while(cont != 1000);
			}
	}
