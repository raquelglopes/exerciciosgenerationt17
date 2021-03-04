package Turma17;

public class Administrador extends Pessoa {

	private Float ajudaCusto;

	public Administrador(String nome, String endereco, String telefone) {
		super(nome, endereco, telefone);
		
	}
	public Administrador(String nome, String endereco, String telefone,Float ajudaCusto) {
		super(nome, endereco, telefone);
		this.ajudaCusto = ajudaCusto;
	}
	public Float getAjudaCusto() {
		return ajudaCusto;
	}
	public void setAjudaCusto(Float ajudaCusto) {
		this.ajudaCusto = ajudaCusto;
	}
	public void setAjudaCusto(int i, int j) {
		// TODO Auto-generated method stub
		
	}
	
	

}