package br.com.dio.exercicios.loops;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int nota;
		System.out.println("Digite a nota");
		nota = sc.nextInt();
        while(nota<0 | nota>10) {
        	System.out.println("Nota invalida digite novamente");
        	nota = sc.nextInt();
        }
        System.out.println("Digitou uma nota valida");
	}

}
