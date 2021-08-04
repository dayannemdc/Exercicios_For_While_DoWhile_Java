package ExerciciosJavaForWhile;

import java.util.Scanner;

public class Questao5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* 5 - Crie um programa que leia um número do teclado até que encontre um número igual a zero. No final, mostre a soma dos números digitados.(DO...WHILE)*/
		
		int numero,soma=0;
		
		Scanner leia=new Scanner(System.in);
		
		System.out.println("Entre com um número de 0 a 9: ");
		numero=leia.nextInt();
		
		do
		{
			soma=soma+numero;
			System.out.println("Entre com um número de 0 a 9: ");
			numero=leia.nextInt();
		}
		while(numero!=0);
		
		System.out.println("A soma dos números digitados é: "+soma);

	}

}
