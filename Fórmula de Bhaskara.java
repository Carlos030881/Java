/* Leia 3 valores de ponto flutuante e efetue o cálculo das raízes da equação de Bhaskara. 

Se não for possível calcular as raízes, mostre a mensagem correspondente “Impossivel calcular”, caso haja uma divisão por 0 ou raiz de numero negativo.

Entrada
Leia três valores de ponto flutuante (double) A, B e C.

Saída
Se não houver possibilidade de calcular as raízes, apresente a mensagem "Impossivel calcular". 

Caso contrário, imprima o resultado das raízes com 5 dígitos após o ponto, com uma mensagem correspondente conforme exemplo abaixo. 

Imprima sempre o final de linha após cada mensagem. */

import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a, b, c, delta, r1, r2;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		delta = (b*b) - (4*a*c);
		if((2*a==0) || (delta<0)){
			System.out.print("Impossivel calcular\n");
		}
		else{
			r1 = ((-1 * b) + Math.sqrt(delta))/(2*a);
			r2 = ((-1 * b) - Math.sqrt(delta))/(2*a);
			System.out.print("R1 = ");
			System.out.printf("%.5f", r1);
			System.out.print("\nR2 = ");
			System.out.printf("%.5f", r2);
			System.out.print("\n");
		}
		
	}
}