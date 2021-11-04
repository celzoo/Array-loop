package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero;
		int cont=1;
		System.out.println("Qual numero deseja ver a tabuada");
		numero = sc.nextInt();
		while(cont<=10) {
			System.out.println("O numero " + numero + " vezes o numero "+ cont + " é : " + numero*cont);
			cont++;
		}
		
	}

}
