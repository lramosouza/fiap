package br.com.java.fiap.mba.io;

import java.nio.file.Files;
import java.nio.file.Paths;

public class PrintarApp {
	
	public static void main(String[] args) {

		try {
			Files.list(Paths.get("c:\\Windows"))
			.filter(p -> p.toString().endsWith(".exe"))
		    .forEach(System.out::println);
			
		} catch (Exception e) {
			System.out.println(e);
		}
	}
}
