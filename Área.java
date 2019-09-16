/*Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. 

Em seguida, calcule e mostre:

a) a área do triângulo retângulo que tem A por base e C por altura.
b) a área do círculo de raio C. (pi = 3.14159)
c) a área do trapézio que tem A e B por bases e C por altura.
d) a área do quadrado que tem lado B.
e) a área do retângulo que tem lados A e B.

Entrada
O arquivo de entrada contém três valores com um dígito após o ponto decimal.

Saída
O arquivo de saída deverá conter 5 linhas de dados. 

Cada linha corresponde a uma das áreas descritas acima, sempre com mensagem correspondente e um espaço entre os dois pontos e o valor. 

O valor calculado deve ser apresentado com 3 dígitos após o ponto decimal.*/

import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double a, b, c, areaTri, areaCirc, areaTrap, areaQuad, areaRet;
		a = scan.nextDouble();
		b = scan.nextDouble();
		c = scan.nextDouble();
		areaTri = (a * c)/2;
		areaCirc = 3.14159 * c * c;
		areaTrap = ((a + b) * c)/2;
		areaQuad = b * b;
		areaRet = a * b;
		
		System.out.printf("TRIANGULO: %.3f\n", areaTri);
		System.out.printf("CIRCULO: %.3f\n", areaCirc);
		System.out.printf("TRAPEZIO: %.3f\n", areaTrap);
		System.out.printf("QUADRADO: %.3f\n", areaQuad);
		System.out.printf("RETANGULO: %.3f\n", areaRet);
	}
}