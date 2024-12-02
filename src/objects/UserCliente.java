package objects;

import classes.Cliente;

public class UserCliente {

	public static void main(String[] args) {
		Cliente cli = new Cliente();
		cli.setNome("manuella Rezende");
		cli.setCpf("998.577.367.-98");
		cli.setEmail("manuiella@gmail");
		cli.setIdade(17);
		System.out.println(cli.cadastrasr());
		
		


	}

}
