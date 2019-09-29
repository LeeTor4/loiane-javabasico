package com.loiane.javabasico.aula19;

import java.util.Scanner;

/*
 * Criar um vetor A com 15 elementos inteiros. Construir um vetor B de
   mesmo tipo e tamanho, sendo que cada elemento do vetor B dever�
   ser o quadrado do respectivo elemento de A, ou seja:
   B[i] = A[i] * A[I].
 * 
 * 
 * **/
public class Exerc03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int[] vetorA = new int[8];
		int[] vetorB = new int[vetorA.length];
		
		for(int i=0; i < vetorA.length ;i++) {
			System.out.println("Entre com o valor da posi��o : " + i);
			vetorA[i] = scan.nextInt();
			vetorB[i] = vetorA[i]* vetorA[i] ;
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
