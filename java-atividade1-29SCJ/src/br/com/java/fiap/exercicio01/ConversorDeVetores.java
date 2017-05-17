package br.com.java.fiap.exercicio01;

/**
 * @author Leandro Ramo de Souza RM:35873
 * 
 * <b> MBA em Java, SOA e IOT - FIAP 2017 </b>
 * 
 * Crie um programa que leia a seqüência de um determinado vetor (array) e
   depois escreva, em seqüência inversa, em outro vetor. Por exemplo, se o vetor A = {1,2,3}, então vetor B = {3,2,1}.
 */

public class ConversorDeVetores {
	
	
	public Integer[] inverterPosicoes(Integer[] vetor){

		Integer aux = 0;
		
		Integer[] vetorInverso = vetor;
		
		for ( int i = 0; i < vetorInverso.length / 2; i++) {
			aux = vetorInverso[ vetorInverso.length - i - 1 ];
			vetorInverso[ vetorInverso.length - i - 1 ] = vetorInverso[ i ];
			vetorInverso[ i ] = aux;
		}
		return vetorInverso;
	}

}
