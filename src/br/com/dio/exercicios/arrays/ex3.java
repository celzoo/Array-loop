package br.com.dio.exercicios.arrays;
import java.util.Random;
public class ex3 {

	public static void main(String[] args) {
		Random rand = new Random();
		int[] vet = new int[20];
		int i;
		System.out.println("Os valores aleatorios são:");
		System.out.println();
		for(i=0;i<vet.length;i++) {
			vet[i]=rand.nextInt(100);
			System.out.println(vet[i]);
		}
		System.out.println("Sucessores dos numeros aleatorios\n");
		for(int aleatorio : vet) {
			System.out.println(aleatorio+1);
		}
		System.out.println("Antecessores dos numeros aleatorios\n");
		for(int aleatorio : vet) {
			System.out.println(aleatorio-1);
		}
		
	}

}
