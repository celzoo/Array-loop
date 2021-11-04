package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int numeros;
		int qtdnumeros;
		int qtdpares = 0, qtdimpares = 0;
		
		System.out.println("Quantidade de numeros");
		qtdnumeros = sc.nextInt();
		
		int count = 0;
		
		do {
			System.out.println("Número:");
			numeros= sc.nextInt();
			
			if(numeros % 2 ==0) qtdpares++;
			else qtdimpares++;
			
			count++;
		}while(count<qtdnumeros);
		System.out.println("Quantidade de numeros pares" +  qtdpares);
		System.out.println("Quantidade de numeros impares" +  qtdimpares);

	}

}
