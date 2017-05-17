package br.com.java.fiap.exercicio03;

import javax.swing.JOptionPane;

public class MainApp {
	/**
	 * 
	 * 1 - Informe primeiro o número de funcionários da empresa
	 * 2 - Informe o salário para cada funcionário
	 * 3 - Será exibido na tela o valor da média salarial dos funcionários inseridos
	 * 
	 */

	public static void main(String[] args) {
		
		SalarioBusiness salarioBusiness = new SalarioBusiness();
		Integer numeroFuncionarios = null;
		
		try{
			numeroFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de funcionários da empresa: "));
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Entre com um número inteiro válido!");
		}catch (NullPointerException e) {
			System.out.println("Fechando App...");
			System.exit(0);
		}
		
		Double[] salarios = new Double[numeroFuncionarios];
		
		int i = 0;
		
		while(i<numeroFuncionarios){
			try{
				int y = i;
				y++;
				salarios[i] =Double.parseDouble(JOptionPane.showInputDialog("Entre com o salário do funcionário de posição: " +y));
				i++;
				y++;
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Entre com um número de salário válido!");
			}catch (NullPointerException e) {
				System.out.println("Fechando App...");
				System.exit(0);
			}
		}
		
		JOptionPane.showMessageDialog(null,"Média salarial da empresa: "+salarioBusiness.calcularMediaSalarial(numeroFuncionarios, salarios));
	}
}