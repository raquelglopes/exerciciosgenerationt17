"package Aprende;

public  class Pregui�a extends Animal { //heren�a de animal com extends
	
	public Pregui�a()
	{
		super("Pregui�a");
	}
	
//implementar nome do animal, sobrescrevendo
	
	@Override
	public void Nome(String nomeanimal)
	{
		System.out.println("Nome do pregui�a"+nomeanimal);
	}
	//implementar idade do anomal, sobreescrevendo
	
	@Override
	public void Idade(int idadeanimal)
	{
		System.out.println("Idade do animal"+idadeanimal);
	}
	//implementar
	
	@Override
	public void Som (String somanimal)
	{
		System.out.println("Som que o pregui�a emite �: "+somanimal);
	}
	public void SubirArvores()
	{
	System.out.println("Som que o pregui�a  � n�o correr");
	}
	
	
	
}
