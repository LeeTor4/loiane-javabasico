package com.loiane.javabasico.aula19;

import java.util.Scanner;

/*
 * Criar um vetor A com 5 elementos inteiros. Construir um vetor B de
   mesmo tipo e tamanho e com os "mesmos" elementos do vetor A, ou
   seja, B[i] = A[i].
 * **/
public class Exerc01 {

	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[5];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length ;i++) {
			System.out.println("Entre com o valor da posi��o : " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i];
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
