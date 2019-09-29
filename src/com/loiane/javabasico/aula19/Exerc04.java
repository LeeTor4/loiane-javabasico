package com.loiane.javabasico.aula19;

import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
   mesmo tamanho, sendo que cada elemento do vetor B dever� ser a
   raiz quadrada do respectivo elemento de A, ou seja:
   B[i] = sqrt(A[i]).
 * **/
public class Exerc04 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[15];
		double[] vetorB = new double[vetorA.length];
		
		for(int i=0; i < vetorA.length ;i++) {
			System.out.println("Entre com o valor da posi��o : " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = Math.sqrt(vetorA[i]) ;
		}
		
		System.out.println("Valores do vetor A");
		for(int i =0; i < vetorA.length ;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		
		DecimalFormat df = new DecimalFormat("###,###.###");
		
		System.out.println("Valores do vetor B");
		for(int i =0; i < vetorB.length ;i++) {
			System.out.print(df.format((vetorB[i])) + " ");
		}

	}

}
