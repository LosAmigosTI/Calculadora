package br.com.calculadora;
import java.util.Scanner;

public class Calculadora {
	
	
	
	public static void main(String[]args) {
		Scanner opcao;	
		int a;
		int b;
		int c;
		int d = 0;
		opcao = new Scanner(System.in);
		System.out.println("digite a opcao");
		System.out.println("1 para soma");
		System.out.println("2 para sub");
		System.out.println("3 para mut");
		System.out.println("4 para div");
		System.out.println("Digite a opcao escolhida");
		c= opcao.nextInt();
		while(c > 4) {
			System.out.println("Numero invalido por favor digitar novamente");
			System.out.println("digite novamente");
			c=opcao.nextInt();
		break;
		}
		System.out.println("digite os numeros");
		a = opcao.nextInt();
		System.out.println("digite os numeros");
		b = opcao.nextInt();
		
		while( c == 1) {
			d = a + b;
			System.out.println(d);
		break;
		}
		while( c == 2) {
			d = a - b;
			System.out.println(d);
		break;
		}
		while( c == 3) {
			d = a * b;
			System.out.println(d);
		break;
		}
		while( c == 4) {
			d = a / b;
			System.out.println(d);
		break;
		}
		
	}
}



//calculadora finalizada

