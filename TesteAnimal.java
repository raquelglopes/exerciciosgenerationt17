package Aprende;
import java.util.Scanner;

public class TesteAnimal {
	
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);
		Cachorro cachorro = new Cachorro();
		Cavalo cavalo = new Cavalo();
		Pregui�a pregui�a = new Pregui�a();
		
		Animal animal = null;
		int x=0;
		do
		{
			System.out.println("Qual o tipo do seu animal: //01 cachorro. //02 cavalo. //03 pregui�a ");
			x=leia.nextInt();
			if(x==1)
			{
				animal=cachorro;
				System.out.println("Qual o nome do seu Cachorro ? ");
				String nome = leia.next();
				System.out.println("Quantos anos seu Cachorro tem ? ");
				int idade= leia.nextInt();
				System.out.println("Essa � lega! Qual o som seu cachorro emite");
				String som = leia.next();
				System.out.println("-------------------------------------------------");
				cachorro.Nome(nome);
				cachorro.Idade(idade);
				cachorro.Som(som);
				cachorro.Correr();
			}
			else if(x==2)
			{
				animal=cavalo;
				System.out.println("Qual o nome do seu Cavalo? ");
				String nome = leia.next();
				System.out.println("Quantos anos seu Cavalo tem? ");
				int idade= leia.nextInt();
				System.out.println("Essa � lega! Qual o som seu Cavalo emite");
				String som = leia.next();
				System.out.println("-------------------------------------------------");
				cavalo.Nome(nome);
				cavalo.Idade(idade);
				cavalo.Som(som);
				cavalo.Correr();
			}
			else if(x==3)
			{
				animal=pregui�a;
				System.out.println("Qual o nome do seu Pregui�a? ");
				String nome = leia.next();
				System.out.println("Quantos anos seu Pregui�a tem? ");
				int idade= leia.nextInt();
				System.out.println("Essa � lega! Qual o som seu Pregui�a emite");
				String som = leia.next();
				System.out.println("-------------------------------------------------");
				pregui�a.Nome( nome );
				pregui�a.Idade( idade );
				pregui�a.Som( som );
				pregui�a.SubirArvores();
				
			} 
			else
			{
			System.out.println("Informa��o Invalida");	
			}
			
			
		}
		while (x<=0 || x>=4);
	}
}
