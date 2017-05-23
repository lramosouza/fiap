package br.com.java.fiap.mba.threads;

public class Cavalo implements Runnable {

	private String nome;

	public Cavalo(String nome) {
		super();
		this.nome=nome;
	}

	@Override
	public void run() {
		for (int i = 0; i <= 10; i++) {
			System.out.println("Horse: "
					+ "" + nome + " -- iteração: " + i);
				if(i == 10){
					try {
						stop(nome);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			try {
				Thread.sleep((int) (Math.random() * 5000));
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}

	private void stop(String nome) throws InterruptedException {
		System.out.println("===========================" 
					+"\n"+ "===== WIINER IS "+nome+" ======"+
					 "\n"+ "===========================");
		System.exit(1);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
