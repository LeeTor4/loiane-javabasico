package com.loiane.javabasico.aula19;

import java.util.Scanner;

/*
 *Criar dois vetores A e B cada um com 10 elementos inteiros. Construir
  um vetor C, onde cada elemento de C � a multiplica��o dos
  respectivos elementos em A e B, ou seja:
  C[i] = A[i] * B[i].
 * 
 * **/
public class Exerc08 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int[] vetorA = new int[10];
		int[] vetorB = new int[vetorA.length];
		int[] vetorC = new int[vetorA.length];

		for(int i=0; i < vetorA.length ;i++) {
			System.out.println("Entre com o valor do vatorA da posi��o : " + i);
			vetorA[i] = scan.nextInt();
		}
		
		for(int i=0; i < vetorB.length ;i++) {
			System.out.println("Entre com o valor do vatorB da posi��o : " + i);
			vetorB[i] = scan.nextInt();
		}
		for(int i=0; i < vetorC.length ;i++) {
			
			vetorC[i] = vetorA[i] * vetorB[i];
		}
		
		System.out.println("Valores do vetor A");
		for(int i =0; i < vetorA.length ;i++) {
			System.out.print(vetorA[i] + " ");
		}
		System.out.println();
	
		
		System.out.println("Valores do vetor B");
		for(int i =0; i < vetorB.length ;i++) {
			System.out.print(vetorB[i]+ " ");
		}
		System.out.println();
		System.out.println("Valores do vetor C");
		for(int i =0; i < vetorC.length ;i++) {
			System.out.print(vetorC[i]+ " ");
		}
		
	}

}
