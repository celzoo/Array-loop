package br.com.dio.exercicios.arrays;
import java.util.Random;
public class Ex4 {

	public static void main(String[] args) {
		int [][] matriz = new int [4][4];
		Random rand = new Random();
		int i,j;
		for(i=0;i<matriz.length;i++) {
			for(j=0;j<matriz[i].length;j++) {
				matriz[i][j]= rand.nextInt(9);
				
			}
			
		}
		System.out.println("Os elementos da matriz sao");
		for(int[] linha : matriz) {
			for(int coluna : linha) {
				System.out.println(coluna);
			}
			
		}
		
	}

}
