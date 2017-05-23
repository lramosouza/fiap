package br.com.java.fiap.mba.threads;

public class MainApp {
	public static void main(String[] args) {
		Cavalo cavalo1 = new Cavalo("Jr");
		Cavalo cavalo2 = new Cavalo("Andy");
		Cavalo cavalo3 = new Cavalo("Redis");
		Cavalo cavalo4 = new Cavalo("Josh");
		Cavalo cavalo5 = new Cavalo("Owen");

		Thread thread1 = new Thread(cavalo1);
		Thread thread2 = new Thread(cavalo2);
		Thread thread3 = new Thread(cavalo3);
		Thread thread4 = new Thread(cavalo4);
		Thread thread5 = new Thread(cavalo5);

		thread1.start();
		thread2.start();
		thread3.start();
		thread4.start();
		thread5.start();
	}

}
