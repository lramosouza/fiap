package br.com.java.fiap.mba.io;

import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
	public static void main(String[] args) {

		try {
			Path origem = Paths.get("C:\\Users\\logonrm\\Downloads");
			Path destino = Paths.get("C:\\Users\\logonrm\\Downloads\\teste");
			Files.walkFileTree(origem, new FileReader(destino));
		} catch (Throwable t) {
			t.printStackTrace();
		}
	}
}
