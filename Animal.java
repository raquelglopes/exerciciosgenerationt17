package Aprende;

public abstract class  Animal { //classe abstrata 
	String TipoAnimal; //ATRIBUTO
	
	public Animal (String TipoAnimal)	//Construtor
	{
		this.TipoAnimal = TipoAnimal; 
	}
	// Comece a declara��o de metodo abstratos
	abstract public void Nome(String nomeanimal);
	abstract public void Idade(int idadeanimal);
	abstract public void Som(String somanimal);
	//
	//get set
	public String getTipoAnimal() {
		return TipoAnimal;
	}
	public void setTipoAnimal(String tipoAnimal) {
		TipoAnimal = tipoAnimal;
	}
	
	
	
	
	
	/*Crie uma hierarquia de classes conforme abaixo com os seguintes atributos e
	comportamentos (observe a tabela), utilize os seus conhecimentos e distribua as
	caracter�sticas de forma que tudo o que for comum a todos os animais fique na classe
	Animal:*/

}
