package ExerciciosJavaForWhile;

import java.util.Scanner;

public class Questao2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*2 - Ler 10 n�meros e imprimir quantos s�o pares e quantos s�o �mpares. (FOR)*/

		int numero,par=0,impar=0,x;
		
		Scanner leia = new Scanner(System.in);
		
		
		
		for(x=1;x<=10;x++)
		{
			System.out.println("Entre com um n�mero: ");
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
		
		System.out.println("Quantidade de n�meros pares: "+par);
		System.out.println("Quantidade de n�meros �mpares: "+impar);
		

	}

}
