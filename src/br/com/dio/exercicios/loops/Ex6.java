package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int number,fatorial=1;
		
		
		System.out.println("Digite o numero que deseja saber o fatorial");
		number = sc.nextInt();
		while(number>0) {
			fatorial = fatorial * number;
			number--;
		}
		System.out.println("O fatorial é :" + fatorial);
		

	}

}
