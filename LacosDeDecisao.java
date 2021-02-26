package Turma17;

import java.util.Scanner;

/* 3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
categoria ela se encontra:
 10-14 infantil
 15-17 juvenil
 18-25 adulto
*/

public class LacosDeDecisao {
	
	
		public static void main(String[] args) {
		
		int idade;
		
		try (Scanner leia = new Scanner(System.in)) {
			System.out.println("Entre com a sua idade: ");
			idade = leia.nextInt();
		}
		
		if(idade>=10 && idade<=14)
		{
			System.out.println("\nInfantil");
		}
		else if(idade<15 && idade>=17)
			{
				System.out.println("\nJuvenil");
			}
		else if (idade>=0 && idade<=9)
			{
				System.out.println("\nCriança");
			}
		else 
		{
			System.out.println("\nAdulto");
		}


		
	}
	
	

}
