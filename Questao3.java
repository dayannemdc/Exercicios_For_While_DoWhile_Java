package ExerciciosJavaForWhile;

import java.util.Scanner;

public class Questao3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*3- Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de 21 anos. Total de pessoas com mais de 50 anos. O programa termina quando idade for =-99. (WHILE)*/
		
		int idade,cont21=0,cont50=0;
		String nome;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Entre com o seu nome: ");
		nome = leia.next();
		
		System.out.println("Entre com sua idade: ");
		idade=leia.nextInt();
		
		while(idade!=-99)
		{
			System.out.println("Seu nome é: "+nome);
			System.out.println("Sua idade é: "+idade);
			
			if(idade<21)
			{
				cont21++;
			}
			if(idade>50)
			{
				cont50++;
			}
			
			System.out.println("Entre com o seu nome: ");
			nome = leia.next();
			
			System.out.println("Entre com sua idade: ");
			idade=leia.nextInt();
		}
		
		System.out.println("A quantidade de pessoas com menos de 21 anos é de: "+cont21);
		System.out.println("A quantidade de pessoas com mais de 50 anos é de: "+cont50);
		

	}

}
