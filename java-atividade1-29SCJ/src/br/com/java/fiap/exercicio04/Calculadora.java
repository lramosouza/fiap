package br.com.java.fiap.exercicio04;

/**
 * @author Leandro Ramo de Souza RM:35873
 * 
 * Calculadora - Exerc�cio 04
 */
import javax.swing.JOptionPane;

public class Calculadora {

	public static void main(String[] args) { 
		String opcao = "https://github.com/lramosouza/fiap0";
		while (!"9".equals(opcao)) {
			opcao = JOptionPane.showInputDialog("Escolha a opera��o desejada:" + "\n" + "1 - MULTIPLICACAO" + "\n"
					+ "2 -DIVISAO" + "\n" + "3 - ADI��O" + "\n" + "4 - SUBTRA��O" + "\n" + "9 - SAIR");
			switch (opcao) {
			case "3":
				Double valor1 = Double.parseDouble(JOptionPane.showInputDialog("Entre com o n�mero a ser somado"));
				Double valor2 = Double.parseDouble(
						JOptionPane.showInputDialog("Entre com o n�mero a ser adicionado ao primeiro n�mero"));
				Double resSoma = somar(valor1, valor2);
				JOptionPane.showMessageDialog(null, "O resuldado �: " + resSoma);
				break;
			case "2":
				Double dividendo = Double.parseDouble(JOptionPane.showInputDialog("Entre com o n�mero dividendo"));
				Double divisor = Double.parseDouble(JOptionPane.showInputDialog("Entre com o n�mero divisor"));
				Double resDivisao = dividir(dividendo, divisor);
				JOptionPane.showMessageDialog(null, "O resuldado �: " + resDivisao);
				break;
			case "1":
				Double valorMultipicacao = Double
						.parseDouble(JOptionPane.showInputDialog("Entre com o n�mero a ser multiplicado"));
				Double multiplicador = Double
						.parseDouble(JOptionPane.showInputDialog("Entre com o n�mero multiplicador"));
				Double resMultiplicacao = multiplicar(valorMultipicacao, multiplicador);
				JOptionPane.showMessageDialog(null, "O resuldado �: " + resMultiplicacao);
				break;
			case "4":
				Double valorSubtracao = Double.parseDouble(JOptionPane.showInputDialog("Entre com o primeiro n�mero"));
				Double valorSubtarido = Double.parseDouble(
						JOptionPane.showInputDialog("Entre com o n�mero a ser subtraido ao primeiro n�mero"));
				Double resSubtracao = subtrair(valorSubtracao, valorSubtarido);
				JOptionPane.showMessageDialog(null, "O resuldado �: " + resSubtracao);
				break;
			case "9":
				System.exit(0);
				System.out.println("ENCERRANDO...");
			default:
				JOptionPane.showMessageDialog(null, "Op��o inv�lida");
				break;
			}
		}

	}

	private static Double subtrair(Double valorSubtracao, Double valorSubtarido) {
		return valorSubtracao - valorSubtarido;
	}

	private static Double multiplicar(Double valorMultipicacao, Double multiplicador) {
		return valorMultipicacao * multiplicador;
	}

	private static Double dividir(Double dividendo, Double divisor) {
		if (divisor == 0) {
			JOptionPane.showMessageDialog(null, "N�o se pode dividir por zero!");
			System.exit(0);
		}
		return dividendo / divisor;
	}

	private static Double somar(Double valor1, Double valor2) {
		return valor1 + valor2;
	}
}