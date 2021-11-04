package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int numero[] = null;
		numero = new int [10];
		int i,cont=0;
		int maior=0;
		
		System.out.println("Digite o numero");
		for(i=0;i<4;i++) {
			numero[i]=sc.nextInt();
			cont += numero[i];
			if(numero[i]>maior) maior=numero[i];
			
		}
		
		System.out.println("Maior:" + maior);
		System.out.println("Media:" + cont/4);
	}

}
