/* Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. 

A seguir, calcule e mostre o valor da conta a pagar.

Código         Especificação            Preço
1				Cachorro Quente			R$ 4,00

2				X Salada 				R$ 4,50

3				X Bacon					R$ 5,00

4				Torrada Simples	        R$ 2,00

5 				Refrigerante			R$ 1,50

Entrada
O arquivo de entrada contém dois valores inteiros correspondentes ao código e à quantidade de um item conforme tabela acima.

Saída
O arquivo de saída deve conter a mensagem "Total: R$ " seguido pelo valor a ser pago, com 2 casas após o ponto decimal. */

import java.util.Scanner;
public class Main{
public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int cod, qtd;
		double valor, total;
		cod = scan.nextInt();
		qtd = scan.nextInt();
		switch(cod){
			case 1:
				valor = 4;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			case 2:
				valor = 4.5;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			case 3:
				valor = 5;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			case 4:
				valor = 2;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			case 5:
				valor = 1.5;
				total = qtd * valor;
				System.out.print("Total: R$ ");
				System.out.printf("%.2f", total);
				System.out.print("\n");
				break;
			default:
				break;
		}
		
	}
}