package ExerciciosJavaForWhile;

import java.util.Scanner;

public class Questao4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//4 - Uma empresa desenvolveu uma pesquisa para saber as características psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
//era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções (1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
//agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150 pessoas, calcule e mostre: (WHILE)
//número de pessoas calmas;
//número de mulheres nervosas;
//número de homens agressivos;
//número de outros calmos;
//número de pessoas nervosas com mais de 40 anos;
//número de pessoas calmas com menos de 18 anos
		
		int pessoas=0,idade,sexo,caracteristica,contPessoasCalmas=0,contMulheresNervosas=0,contHomensAgressivos=0,contOutrosCalmos=0,contPessoas40=0,contPessoas18=0;
		
		Scanner leia = new Scanner(System.in);
		
		while(pessoas<150)
		{
			System.out.println("Entre com sua idade: ");
			idade=leia.nextInt();
			System.out.println("Escolha: \n 1-feminino \n 2-masculino \n 3-Outros");
			sexo=leia.nextInt();
			System.out.println("Escolha: \n 1 - calma; \n 2 - nervosa \n 3 - agressiva");
			caracteristica=leia.nextInt();
			pessoas++;
			if(caracteristica==1)
			{
				contPessoasCalmas++;
				if(sexo==3)
				{
					contOutrosCalmos++;
				}
				if(idade<18)
				{
					contPessoas18++;
				}
			}
			if(sexo==1)
			{
				if(caracteristica==2)
				{
					contMulheresNervosas++;
				}
			}
			if(sexo==2)
			{
				if(caracteristica==3)
				{
					contHomensAgressivos++;
				}
			}
			if(caracteristica==2)
			{
				if(idade>40)
				{
					contPessoas40++;
				}
			}
		}
			
		System.out.println("Número de pessoas calmas:"+contPessoasCalmas);
		System.out.println("Número de mulheres nervosas:"+contMulheresNervosas);
		System.out.println("Número de homens agressivos:"+contHomensAgressivos);
		System.out.println("Número de outros calmos:"+contOutrosCalmos);
		System.out.println("Número de pessoas nervosas com mais de 40 anos:"+contPessoas40);
		System.out.println("Número de pessoas calmas com menos de 18 anos:"+contPessoas18);
	}
}
