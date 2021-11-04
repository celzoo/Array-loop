package br.com.dio.exercicios.arrays;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String[] consoantes = new String[6];
		String letra;
		int count=0;
		int qtdCon=0,i;
		
		System.out.println("Digite 6 caracteres");
		do {
			letra = sc.next();
			if(!(letra.equalsIgnoreCase("a") | 
			   letra.equalsIgnoreCase("e") | 
			   letra.equalsIgnoreCase("i") | 
			   letra.equalsIgnoreCase("o") | 
			   letra.equalsIgnoreCase("u"))){
				   qtdCon++;
				   consoantes[count]=letra;
					
			   }
			
					
			
			count++;
		}while(count<consoantes.length);
		System.out.println("A quantidade de consoantes é "+qtdCon + " e as consoantes são" );
		for(String consoantes1 : consoantes) {
			if(consoantes1!=null) {
				System.out.println(consoantes1);
			}
			
			
		}
		
	}

}
