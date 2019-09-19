/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 

A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0).
            |Y
Q2			| Q1
			|				X	
------------------------------
Q3			| Q4	
			|
			|

Se o ponto estiver na origem, escreva a mensagem “Origem”.

Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

Entrada
A entrada contem as coordenadas de um ponto.

Saída
A saída deve apresentar o quadrante em que o ponto se encontra. */

import java.util.Scanner; 
class Main{
public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double x, y;
		x = scan.nextDouble();
		y = scan.nextDouble();
		if((x == 0) && (y == 0)){
			System.out.print("Origem\n");
		}else if(x == 0){
			System.out.print("Eixo Y\n");
		}else if(y == 0){
			System.out.print("Eixo X\n");
		}else if((x > 0) && (y > 0)){
			System.out.print("Q1\n");
		}else if((x < 0) && (y > 0)){
			System.out.print("Q2\n");
		}else if((x < 0) && (y < 0)){
			System.out.print("Q3\n");
		}else if((x > 0) && (y < 0)){
			System.out.print("Q4\n");
		}
	}
}