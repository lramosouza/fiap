package br.com.java.fiap.exercicio03;

import javax.swing.JOptionPane;

public class MainApp {
	/**
	 * 
	 * 1 - Informe primeiro o n�mero de funcion�rios da empresa
	 * 2 - Informe o sal�rio para cada funcion�rio
	 * 3 - Ser� exibido na tela o valor da m�dia salarial dos funcion�rios inseridos
	 * 
	 */

	public static void main(String[] args) {
		
		SalarioBusiness salarioBusiness = new SalarioBusiness();
		Integer numeroFuncionarios = null;
		
		try{
			numeroFuncionarios = Integer.parseInt(JOptionPane.showInputDialog("Entre com o n�mero de funcion�rios da empresa: "));
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Entre com um n�mero inteiro v�lido!");
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
				salarios[i] =Double.parseDouble(JOptionPane.showInputDialog("Entre com o sal�rio do funcion�rio de posi��o: " +y));
				i++;
				y++;
			}catch(NumberFormatException e){
				JOptionPane.showMessageDialog(null, "Entre com um n�mero de sal�rio v�lido!");
			}catch (NullPointerException e) {
				System.out.println("Fechando App...");
				System.exit(0);
			}
		}
		
		JOptionPane.showMessageDialog(null,"M�dia salarial da empresa: "+salarioBusiness.calcularMediaSalarial(numeroFuncionarios, salarios));
	}
}