package ExerciciosJavaForWhile;

import java.util.Scanner;

public class Questao6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//6 - Escrever um programa que receba varios numeros inteiros no teclado. E no final imprimir a media dos numeros multiplos de 3. Para sair digitar 0(zero).(DO...WHILE)
		
		int numero,media=0,contador=0,soma=0;
		
		Scanner leia=new Scanner(System.in);
		
		do
		{
			System.out.println("Entre com um número ou digite 0 para sair: ");
			numero=leia.nextInt();
			
			if(numero!=0)
			{
				if(numero%3==0)
				{
					soma+=numero;
					contador++;
				}
				media=soma/contador;
			}
		}
		while(numero!=0);
		
		System.out.println("A media dos números múltiplos de 3 digitados é: "+media);

	}

}
