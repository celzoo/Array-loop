package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int idade;
		String nome = null;
		while(true) {
			System.out.println("Digite seu nome");
			nome = sc.next();
			if(nome.equals("0")) break;
			System.out.println("Digite sua idade");
			idade = sc.nextInt();
		}
		
     System.out.println("Continua aqui");
	}

}
