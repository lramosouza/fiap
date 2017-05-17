package br.com.java.fiap.exercicio03;

/**
 * 
 * @author Leandro Ramo de Souza RM:35873
 * 
 * Construa um programa que crie um vetor para coletar informa��es de sal�rios de
   determinados funcion�rios. O programa inicialmente dever� questionar a
   quantidade de funcion�rios que servir� para determinar o tamanho do vetor.
   Ap�s isso, ser� questionado o sal�rio para cada funcion�rio deste vetor. Ao final,
   o programa dever� informar a m�dia salarial da empresa.
   Nota: utilize o comando JOptionPane.showInputDialog para a entrada de dados.
   Como este comando retorna o tipo String, fa�a a convers�o de tipos apropriada
   (classes wrappers).
 *
 */
public class SalarioBusiness {

	public Double calcularMediaSalarial(Integer quantidadeFuncionarios, Double[] salarios) {

		Double totalSalarios = 0.0;

		for (int i = 0; i < salarios.length; i++) {
			totalSalarios = totalSalarios + salarios[i];
		}

		return totalSalarios/quantidadeFuncionarios;
	}

}
