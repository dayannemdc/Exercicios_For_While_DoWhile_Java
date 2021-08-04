package ExerciciosJavaForWhile;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2 - Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)*/

		int numero,par=0,impar=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Entre com um número: ");
			numero=leia.nextInt();
			if(numero%2==0)
			{
				par++;
			}
			else
			{
				impar++;
			}
		}
		
		System.out.println("Quantidade de números pares: "+par);
		System.out.println("Quantidade de números ímpares: "+impar);
		

	}

}
