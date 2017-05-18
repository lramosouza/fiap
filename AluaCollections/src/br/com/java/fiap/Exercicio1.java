package br.com.java.fiap;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.LinkedList;

public class Exercicio1 {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		LinkedList<String> linkedList = new LinkedList<>();

		LocalDateTime tempoInicio = LocalDateTime.now();
		
		for (int i = 0; i < 10000000; i++) {
			arrayList.add("A");
			for (int j = 0; j < 4; j++) {
				arrayList.add("C");
			}
		}
		System.out.println(("ArryaList inserção:" +ChronoUnit.MILLIS.between(tempoInicio, LocalDateTime.now())));
		LocalDateTime tempoInicio1 = LocalDateTime.now();
		arrayList.get(arrayList.size()-1);
		System.out.println(("ArryaList obtenção:" +ChronoUnit.MILLIS.between(tempoInicio1, LocalDateTime.now())));
		
		LocalDateTime tempoInicio2 = LocalDateTime.now();
		
		for (int i = 0; i < 10000000; i++) {
			for (int j = 0; j < 4; j++) {
				linkedList.add("C");
			}
			linkedList.add("B");
		}
		System.out.println(("LinkedList Inserção: "+ChronoUnit.MILLIS.between(tempoInicio2, LocalDateTime.now())));
		LocalDateTime tempoInicio3 = LocalDateTime.now();
//		linkedList.get(linkedList.size()>>2);
		linkedList.get(linkedList.size()-1);
		System.out.println(("LinkedList Obtenção: "+ChronoUnit.MILLIS.between(tempoInicio3, LocalDateTime.now())));
	
	}
}
