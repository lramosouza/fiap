package br.com.java.fiap.exercicio05;

import javax.swing.JOptionPane;

public class MainApp {
	
	public static void main (String args[]) {
		
		Integer numeroFatorial = null;
		long fatorial = 0l;
		
		try{
			numeroFatorial = Integer.parseInt(JOptionPane.showInputDialog("Entre com o número de fatorial a ser calculado: "));
		}catch(NumberFormatException e){
			JOptionPane.showMessageDialog(null, "Entre com um número inteiro válido!");
		}catch (NullPointerException e) {
			System.out.println("Fechando App...");
			System.exit(0);
		}
		
		for(long i=0; i<=numeroFatorial;i++) {
			fatorial = calcularFatorial(i);
		}
		
		JOptionPane.showMessageDialog(null,"O fatorial de " +numeroFatorial+ " é: "+fatorial);
	}
	
	public static long calcularFatorial(long numero) {
		if (numero <= 1 ){  
			return 1;
		}else{
			long fatorialCalculado = numero * calcularFatorial(numero - 1);
			return fatorialCalculado;
		}
	}
}
