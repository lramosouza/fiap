package br.com.fiap.app;

import java.util.Calendar;
import java.util.Date;
import java.util.List;

import br.com.fiap.dao.impl.GenericDao;
import br.com.fiap.entity.Clientes;
import br.com.fiap.entity.Pedidos;

public class TestGenericDAO {

	public static void main(String[] args) {

		incluirCliente();
		listarClientes();
		buscarCliente(1);
		alterarCliente();
		deletarCliente();
		System.exit(1);
	}

	private static void deletarCliente() {
		Clientes cliente = new Clientes();
		cliente.setEmail("lramosouza@outlook.com");
		cliente.setNome("Leandro Ramo");

		Pedidos pedido = new Pedidos();
		pedido.setCliente(cliente);
		pedido.setData(new Date());
		pedido.setDescricao("Galaxy note 8");
		pedido.setValor(5000);

		cliente.getPedidos().add(pedido);

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, -10);

		Pedidos pedido2 = new Pedidos();
		pedido2.setCliente(cliente);
		pedido2.setData(cal.getTime());
		pedido2.setDescricao("Drone");
		pedido2.setValor(6000);

		cliente.getPedidos().add(pedido2);
		
		try {
			GenericDao<Clientes> dao = new GenericDao<>(Clientes.class);
			dao.remover(cliente);
			System.out.println("Deletado com sucesso");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		
	}

	private static void alterarCliente() {
		Clientes cliente = new Clientes();
		cliente.setEmail("lramosouza@outlook.com");
		cliente.setNome("Leandro Ramo");

		Pedidos pedido = new Pedidos();
		pedido.setCliente(cliente);
		pedido.setData(new Date());
		pedido.setDescricao("Galaxy note 8");
		pedido.setValor(5000);

		cliente.getPedidos().add(pedido);

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, -10);

		Pedidos pedido2 = new Pedidos();
		pedido2.setCliente(cliente);
		pedido2.setData(cal.getTime());
		pedido2.setDescricao("Drone");
		pedido2.setValor(6000);

		cliente.getPedidos().add(pedido2);
		
		try {
			GenericDao<Clientes> dao = new GenericDao<>(Clientes.class);
			dao.atualizar(cliente);
			System.out.println("Alterado com sucesso");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void incluirCliente() {

		Clientes cliente = new Clientes();
		cliente.setEmail("lramosouza@outlook.com");
		cliente.setNome("Leandro Ramo");

		Pedidos pedido = new Pedidos();
		pedido.setCliente(cliente);
		pedido.setData(new Date());
		pedido.setDescricao("Galaxy note 8");
		pedido.setValor(5000);

		cliente.getPedidos().add(pedido);

		Calendar cal = Calendar.getInstance();
		cal.add(Calendar.MINUTE, -10);

		Pedidos pedido2 = new Pedidos();
		pedido2.setCliente(cliente);
		pedido2.setData(cal.getTime());
		pedido2.setDescricao("Drone");
		pedido2.setValor(6000);

		cliente.getPedidos().add(pedido2);

		try {
			GenericDao<Clientes> dao = new GenericDao<>(Clientes.class);
			dao.adicionar(cliente);
			System.out.println("Salvo com sucesso");

		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
	}

	private static void listarClientes() {
		GenericDao<Clientes> dao = new GenericDao<>(Clientes.class);
		List<Clientes> clientes = dao.listar();
		for (Clientes cliente : clientes) {
			System.out.println(cliente.getNome() + ": " + cliente.getEmail());
		}
	}

	private static void buscarCliente(Integer idCliente) {
		GenericDao<Clientes> dao = new GenericDao<>(Clientes.class);
		Clientes f = dao.buscar(idCliente);
		System.out.println(f.getNome() + ": " + f.getEmail());
	}
}