package com.loiane.javabasico.aula19;

import java.util.Scanner;

/*
 * Criar um vetor A com 8 elementos inteiros. Construir um vetor B de
   mesmo tipo e tamanho e com os elementos do vetor A multiplicados
   por 2, ou seja: B[i] = A[i] * 2.
   
 * **/
public class Exerc02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length ;i++) {
			System.out.println("Entre com o valor da posi��o : " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i]*2;
		}
		
		System.out.println("Valores do vetor A");
		for(int i =0; i < vetorA.length ;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
		System.out.println("Valores do vetor B");
		for(int i =0; i < vetorB.length ;i++) {
			System.out.print(vetorB[i] + " ");
		}
	}

}
