/* Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e informe-o expresso no formato horas:minutos:segundos.

Entrada
O arquivo de entrada contém um valor inteiro N.

Saída
Imprima o tempo lido no arquivo de entrada (segundos), convertido para horas:minutos:segundos, conforme exemplo fornecido.

1 = 0:0:1

556 = 0:9:16 */

import java.util.Scanner;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		int tempo, horas, min, seg;
		tempo = scan.nextInt();
		horas = tempo/3600;
		min = (tempo%3600)/60;
		seg = tempo%60;
		System.out.println(horas + ":" + min + ":" + seg);
	}
}