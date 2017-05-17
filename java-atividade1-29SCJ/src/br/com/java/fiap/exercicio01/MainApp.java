package br.com.java.fiap.exercicio01;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MainApp {
	/**
	 * 
	 * 1 - Informe primeiro o número de posições que o vetor a ser invertido terá
	 * 2 - Informe o número inteiro referente a posição do vetor
	 * 3 - Será exibido na tela o valor do vetor original e o valor do vetor invertido
	 * 
	 */

	public static void main(String[] args) {
		
		ConversorDeVetores conversor = new ConversorDeVetores();
		Integer numeroVertores = null;
		
		try{
			numeroVertores = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de posições que o vetor invertido terá: "));
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Entre com um número inteiro válido!");
		}
		
		Integer[] vetor = new Integer[numeroVertores];
		
		int i = 0;
		
		while(i<numeroVertores){
			try{
				int y = i;
				y++;
				vetor[i] =Integer.parseInt(JOptionPane.showInputDialog("Entre com o número da posição " +y+ " do vetor"));
				i++;;
				y++;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Entre com um número inteiro válido!");
			}
		}
		
		JOptionPane.showMessageDialog(null,"Vetor Original: "+Arrays.deepToString(vetor)+"\n"+ "Vetor Invertido: " +Arrays.deepToString(conversor.inverterPosicoes(vetor)));
	}
}
