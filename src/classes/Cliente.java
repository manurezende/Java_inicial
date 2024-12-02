package classes;

public class Cliente {
//atributos da classe cliente
	private String nome;
	private String email;
	private String cpf;
	private Integer idade;
	
	
//	metodos
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	
	
	public String cadastrasr() {
		String msg = "o cliente "+nome+" foi cadastrado";
		return msg;
		
	}
}
