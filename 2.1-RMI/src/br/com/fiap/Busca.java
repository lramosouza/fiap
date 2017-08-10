package br.com.fiap;

import java.rmi.Naming;
import java.rmi.RemoteException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class Busca {

	public static void main(String[] args) throws Throwable {
		Carrinho carrinho = (Carrinho) Naming.lookup("rmi://10.20.74.41:1099/farmacia/carrinho");
		Item item = new Item();
		ExecutorService executorService = Executors.newFixedThreadPool(1500);

		executorService.execute(new Runnable() {
		    public void run() {
		    	while (true) {	
					
					item.setNome(".NET É LIXO");
					item.setPreco(666);
					try {
						carrinho.cadastrarItem(item);
					} catch (RemoteException e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
		    }
		});

		
	}

}
