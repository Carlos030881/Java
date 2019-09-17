/* Leia quatro números (N1, N2, N3, N4), cada um deles com uma casa decimal, correspondente às quatro notas de um aluno. 

Calcule a média com pesos 2, 3, 4 e 1, respectivamente, para cada uma destas notas e mostre esta média acompanhada pela mensagem "Media: ". 

Se esta média for maior ou igual a 7.0, imprima a mensagem "Aluno aprovado.". 

Se a média calculada for inferior a 5.0, imprima a mensagem "Aluno reprovado.". 

Se a média calculada for um valor entre 5.0 e 6.9, inclusive estas, o programa deve imprimir a mensagem "Aluno em exame.".

No caso do aluno estar em exame, leia um valor correspondente à nota do exame obtida pelo aluno. 

Imprima então a mensagem "Nota do exame: " acompanhada pela nota digitada. 

Recalcule a média (some a pontuação do exame com a média anteriormente calculada e divida por 2). e imprima a mensagem "Aluno aprovado." 

(caso a média final seja 5.0 ou mais ) ou "Aluno reprovado.", 

(caso a média tenha ficado 4.9 ou menos). 

Para estes dois casos (aprovado ou reprovado após ter pego exame) apresente na última linha uma mensagem "Media final: " seguido da média final para esse aluno.

Entrada
A entrada contém quatro números de ponto flutuante correspendentes as notas dos alunos.

Saída
Todas as respostas devem ser apresentadas com uma casa decimal. As mensagens devem ser impressas conforme a descrição do problema. 

Não esqueça de imprimir o enter após o final de cada linha, caso contrário obterá "Presentation Error". */

import java.util.Scanner;
import java.text.*;
class Main{
	public static void main(String[] args){
		Scanner scan = new Scanner(System.in);
		double n1, n2, n3, n4, media;
		n1 = scan.nextDouble();
		n2 = scan.nextDouble();
		n3 = scan.nextDouble();
		n4 = scan.nextDouble();
		media = ((n1*2) + (n2*3) + (n3*4) + n4)/10;
		if(media >= 7){
			customFormat("##.0", media);
			System.out.print("Aluno aprovado.\n");
		}else if(media >= 5){
			customFormat("##.0", media);
			System.out.print("Aluno em exame.\n");
			double nExam = scan.nextDouble();
			format("##.0", nExam);
			media = (media + nExam)/2;
			if(media >= 5){
				System.out.print("Aluno aprovado.\n");
				finalFormat("##.0", media);
			}else{
				System.out.print("Aluno reprovado.\n");
				finalFormat("##.0", media);
			}
		}else{
			customFormat("##.0", media);
			System.out.print("Aluno reprovado.\n");
		}
		
	}

	static public void customFormat(String pattern, double value){
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.print("Media: " + output + "\n");
	}
	static public void format(String pattern, double value){
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.print("Nota do exame: " + output + "\n");
	}
	static public void finalFormat(String pattern, double value){
		DecimalFormat myFormatter = new DecimalFormat(pattern);
		String output = myFormatter.format(value);
		System.out.print("Media final: " + output + "\n");
	}
}