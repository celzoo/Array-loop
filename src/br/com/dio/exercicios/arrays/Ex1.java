package br.com.dio.exercicios.arrays;

public class Ex1 {

	public static void main(String[] args) {
		int [] vet = {1,2,3,4,5,6};
		
		int count=0;
		while(count<vet.length) {
			System.out.println(vet[count]);
			count++;
		}
		System.out.println("Inverso");
		
		for(count=(vet.length-1);count>=0;count--) {
			System.out.println(vet[count]);
			
		}
		
	}

}
