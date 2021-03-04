package Turma17;

public class Pessoa<telefone> {
	
	private String nome;
	private String endereco;
	private Int telefone;
	
	
	public Pessoa(String nome,String endereco,Int telefone)
	{
		this.nome = nome;
		this.endereco = endereco;
		this.telefone = telefone;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(int i, String telefone) {
		this.telefone = telefone;
	}
	
	

}
