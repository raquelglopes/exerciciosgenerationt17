package Turma17;

public class TesteAdministrador {

	public static void main(String[] args) {
		
		Administrador adm1 = new Administrador(null, null, null,(float) 0);
		Administrador adm2 = new Administrador(null, null, null,(float) 0);
		Administrador adm3 = new Administrador(null, null, null,(float) 0);
		
		adm1.setNome("Leonardo");
		adm1.setEndereco("Rua Rosa");
		adm1.setTelefone("15 32776543");
		adm1.setAjudaCusto(2500,00);
		
		adm2.setNome("Paul");
		adm2.setEndereco("Rua das Margaridas");
		adm2.setTelefone(1197653344);
		adm2.setAjudaCusto(3000.00);
		
		adm3.setNome("Marcia");
		adm3.setEndereco("Rua das tulipas");
		adm3.setTelefone("19987666577");
		adm3.setAjudaCusto(1000.00);
		
		
		
	}

}
