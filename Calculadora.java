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
		}
		System.out.println("digite os numeros");
		a = opcao.nextInt();
		System.out.println("digite os numeros");
		b = opcao.nextInt();
		
		switch(c) {
		case 1:
			 
			d = a + b;
			System.out.println(d);
			break;
		
		case 2:
			d = a - b;
			System.out.println(d);
			break;
		case 3:
			d = a * b;
			System.out.println(d);
			break;
		case 4:
			d = a / b;
			System.out.println(d);
			break;
		default:
			System.out.println("Numero incorreto refa�a novamente a opera��o.");
			break;
		}
		opcao.close();
	}
}



//calculadora finalizada

