package br.com.java.fiap.exercicio03;

/**
 * 
 * @author Leandro Ramo de Souza RM:35873
 * 
 * Construa um programa que crie um vetor para coletar informações de salários de
   determinados funcionários. O programa inicialmente deverá questionar a
   quantidade de funcionários que servirá para determinar o tamanho do vetor.
   Após isso, será questionado o salário para cada funcionário deste vetor. Ao final,
   o programa deverá informar a média salarial da empresa.
   Nota: utilize o comando JOptionPane.showInputDialog para a entrada de dados.
   Como este comando retorna o tipo String, faça a conversão de tipos apropriada
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
