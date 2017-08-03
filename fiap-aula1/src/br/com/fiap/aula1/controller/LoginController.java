package br.com.fiap.aula1.controller;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginController {
	
	public static void logar(String login, String senha) throws IOException {
		
		FileWriter arquivo = new FileWriter ("C:\\leandro\\arquivo.txt", true);
		PrintWriter printer = new PrintWriter(arquivo);
		
		printer.append("\r\n").append(login).append(", ").append(senha);
		
		printer.close();
		arquivo.close();
		
	}

}
