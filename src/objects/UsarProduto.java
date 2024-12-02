package objects;

import classes.Fornecedor;
import classes.Produto;

public class UsarProduto {

	public static void main(String[] args) {
		Fornecedor dell = new Fornecedor();
		dell.setRazaoSocial("Dell computer");
		dell.setCnpj("087546839756");
		dell.setNomeFantasia("dell");
		System.out.println(dell.cadastro());
		
		Produto mouse = new Produto();
		mouse.setNome("mouse sem fio");
		mouse.setDescricao("mouse sem fio recarrecavel");
		mouse.setPreco(54.90);
		mouse.setFornecedor(dell);
		System.out.println(mouse.cadastrar());
		System.out.println("o preço do produto é "+mouse.getPreco());
	}
}
