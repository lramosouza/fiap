package br.com.java.fiap.exercicio01;

import java.util.Arrays;

import javax.swing.JOptionPane;

public class MainApp {
	/**
	 * 
	 * 1 - Informe primeiro o n�mero de posi��es que o vetor a ser invertido ter�
	 * 2 - Informe o n�mero inteiro referente a posi��o do vetor
	 * 3 - Ser� exibido na tela o valor do vetor original e o valor do vetor invertido
	 * 
	 */

	public static void main(String[] args) {
		
		ConversorDeVetores conversor = new ConversorDeVetores();
		Integer numeroVertores = null;
		
		try{
			numeroVertores = Integer.parseInt(JOptionPane.showInputDialog("Entre com o n�mero de posi��es que o vetor invertido ter�: "));
		}catch(Exception e){
			JOptionPane.showMessageDialog(null, "Entre com um n�mero inteiro v�lido!");
		}
		
		Integer[] vetor = new Integer[numeroVertores];
		
		int i = 0;
		
		while(i<numeroVertores){
			try{
				int y = i;
				y++;
				vetor[i] =Integer.parseInt(JOptionPane.showInputDialog("Entre com o n�mero da posi��o " +y+ " do vetor"));
				i++;;
				y++;
			}catch(Exception e){
				JOptionPane.showMessageDialog(null, "Entre com um n�mero inteiro v�lido!");
			}
		}
		
		JOptionPane.showMessageDialog(null,"Vetor Original: "+Arrays.deepToString(vetor)+"\n"+ "Vetor Invertido: " +Arrays.deepToString(conversor.inverterPosicoes(vetor)));
	}
}
