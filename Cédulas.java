/* Leia um valor inteiro. 

A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode ser decomposto. 

As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. 

A seguir mostre o valor lido e a relação de notas necessárias.

Entrada
O arquivo de entrada contém um valor inteiro N (0 < N < 1000000).

Saída
Imprima o valor lido e, em seguida, a quantidade mínima de notas de cada tipo necessárias, conforme o exemplo fornecido. 

Não esqueça de imprimir o fim de linha após cada linha, caso contrário seu programa apresentará a mensagem: “Presentation Error”. */

import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int valor, qtd100, qtd50, qtd20, qtd10, qtd5, qtd2, qtd1;
		valor = scan.nextInt();
		qtd100 = valor/100;
		qtd50 = (valor-(qtd100*100))/50;
		qtd20 = (valor-((qtd100*100) + (qtd50*50)))/20;
		qtd10 = (valor-((qtd100*100) + (qtd50*50) + (qtd20*20)))/10;
		qtd5 = (valor-((qtd100*100) + (qtd50*50) + (qtd20*20) + (qtd10*10)))/5;
		qtd2 = (valor-((qtd100*100) + (qtd50*50) + (qtd20*20) + (qtd10*10) + (qtd5*5)))/2;
		qtd1 = (valor-((qtd100*100) + (qtd50*50) + (qtd20*20) + (qtd10*10) + (qtd5*5) + (qtd2*2)));
		System.out.println(valor + "\n" + qtd100 + " nota(s) de R$ 100,00\n" + qtd50 + " nota(s) de R$ 50,00\n" + qtd20 + " nota(s) de R$ 20,00\n"
			 + qtd10 + " nota(s) de R$ 10,00\n" + qtd5 + " nota(s) de R$ 5,00\n" + qtd2 + " nota(s) de R$ 2,00\n" + qtd1 + " nota(s) de R$ 1,00");
	}
}