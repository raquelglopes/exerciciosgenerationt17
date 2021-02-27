package Turma17;

import java.util.Scanner;

public class exercicio4 {
	int x=1,idade,sexo,fp,contpc=0,contmn=0,contha=0,contoc=0,contpn40=0,contpc18=0;
	
	Scanner leia = new Scanner (System.in);
	
	while(x<=6)
	{
		System.out.println("Entre com a sua idade: ");
		idade = leia.nextInt();
		while(idade<1 || idade>130)
		{
			System.out.println("Idade Inválida!!! Entre novamente com a sua idade: ");
			idade = leia.nextInt();
		}
		
		System.out.println("Entre com o seu sexo: 1 -- Feminino 2 -- Masculino 3 -- Outros ");
		sexo = leia.nextInt();
		while(sexo<1 || sexo>3)
		{
			System.out.println("\nOpção Inválida...");
			System.out.println("Entre com o seu sexo: 1 -- Feminino 2 -- Masculino 3 -- Outros ");
			sexo = leia.nextInt();
		}
		
		System.out.println("Entre com o seu fator psicológico: 1 -- Calma(o) 2 -- Nervoso(a) 3 -- Agressivo (a)");
		fp = leia.nextInt();
		while(fp<1 || fp>3)
		{
			System.out.println("\nOpção Inválida...");
			System.out.println("Entre com o seu fator psicológico: 1 -- Calma(o) 2 -- Nervoso(a) 3 -- Agressivo (a) ");
			fp = leia.nextInt();
		}
		
		if(fp==1)
		{
			contpc++;
		}
		
		if(sexo==1 && fp==2)
		{
			contmn++;
		}
		
		if(sexo==2 && fp==3)
		{
			contha++;
		}
		
		if(sexo==3 && fp==1)
		{
			contoc++;
		}
		
		if(fp==2 && idade>40)
		{
			contpn40++;
		}
		
		if(fp==1 && idade<18)
		{
			contpc18++;
		}
	x++;
	}
	System.out.println("\nPessoas calmas: "+contpc);
	System.out.println("\nMulheres nervosas: "+contmn);
	System.out.println("\nHomens Agressivos: "+contha);
	System.out.println("\nOutros calmos: "+contoc);
	System.out.println("\nNervosos com mais de 40 anos: "+contpn40);
	System.out.println("\nCalmas com menos de 18 anos: "+contpc18);
}

}




