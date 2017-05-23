package br.com.java.fiap.mba.io;

import java.io.IOException;
import java.nio.file.FileSystems;
import java.nio.file.FileVisitResult;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.PathMatcher;
import java.nio.file.SimpleFileVisitor;
import java.nio.file.StandardCopyOption;
import java.nio.file.attribute.BasicFileAttributes;

public class FileReader extends SimpleFileVisitor<Path> {
	private Path destino;
	PathMatcher matcher = FileSystems.getDefault().getPathMatcher("glob:*.txt");
	
	public FileReader(Path destino){
		this.destino=destino;
	}
	@Override
	public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
		System.out.println("Analisando..." + file.getFileName()+"....");
		if(matcher.matches(file.getFileName())) {
			System.out.println("Copiando..." + file.getFileName()+"....");
			Files.copy(file,destino.resolve(file.getFileName()),StandardCopyOption.REPLACE_EXISTING);
		}		
		return FileVisitResult.CONTINUE;
	}

	@Override
	
	public FileVisitResult visitFileFailed(Path file, IOException exc) throws IOException {
		System.out.println("Falhou ");
		return FileVisitResult.CONTINUE;
	}
	
	public Path getDestino() {
		return destino;
	}
	public void setDestino(Path destino) {
		this.destino = destino;
	}
	
}
