package Questao4;
import javax.swing.JOptionPane;
import java.util.Scanner;



		public class Main {

			public static void main(String[] args) {
				Scanner ler = new Scanner(System.in);
				popular[] carros = new popular[100];
				int cont = 0;
				String resposta;
				boolean ABS=false, AB=false, AL=false, SOM=false, CE=false, CB=false;
				do{
				
					String  op = JOptionPane.showInputDialog("(1) Cadastro Carro Popular \n(2) Calcular Pre�o \n(3) Sair");
					
					switch (op) {
						case "1":
							
							double PB = Double.parseDouble( JOptionPane.showInputDialog("Qual o pre�o base? "));									
							resposta = JOptionPane.showInputDialog("Deseja abs? \n1 - Sim \n0 - N�o");
							System.out.println(resposta);
							if(resposta.equals("1")) {
								ABS = true;
							}
							resposta = JOptionPane.showInputDialog("Deseja airbag? \n1 - Sim \n0 - N�o");
							if(resposta.equals("1")) {
								AB = true;
							}
							resposta = JOptionPane.showInputDialog("Deseja alarme? \n1 - Sim \n0 - N�o)");
							if(resposta.equals("1")) {
								AL = true;
							}
							resposta = JOptionPane.showInputDialog("Deseja som? \n1 - Sim \n0 - N�o");
							if(resposta.equals("1")) {
								SOM = true;
							}
							resposta = JOptionPane.showInputDialog("Deseja conjunto Eletrico? \n1 - Sim \n0 - N�o");
							if(resposta.equals("1")) {
								CE = true;
							}
							resposta = JOptionPane.showInputDialog("Deseja computador Bordo? \n1 - Sim \n0 - N�o");
							if(resposta.equals("1")) {
								CB = true;
							}
							carros[cont] = new popular(PB, ABS, AB, AL, SOM, CE, CB);
							
							cont++;
							break;
						case "2":
							System.out.println(carros[cont - 1].isAbs());
							JOptionPane.showMessageDialog(null, "Pre�o final: "+ carros[cont - 1].calcularPrecoFinalPopular());
							
							break;
						case "3":
							JOptionPane.showMessageDialog(null, "OK!");
							cont = 1000;
							break;
						default:
							JOptionPane.showMessageDialog(null, "Resposta Inv�lida");
					}
					
					
				}while(cont != 1000);
			}
	}
