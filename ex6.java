package Turma17;

import java.util.Scanner;

public class ex6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num,soma=0,cont=0;
		float media;
		
		Scanner leia = new Scanner (System.in);
		
		
		do
		{
			System.out.println("Entre com um n�mero: ");
			num = leia.nextInt(); //0
			if(num!=0)
			{
				if(num%3==0) 
				{
					soma = soma + num;
					cont++;
				}
			}
		}
		while(num!=0);
		
		if(cont==0)
		{
			System.out.println("\nN�o existe divis�o por 0!!!");
		}
		else
		{
		media = soma / cont;
		System.out.println("M�dia dos n�meros m�ltiplos de 3: "+media);
		}
	}

}