package br.com.treinaweb.algoritmos;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] numeros = new int[5];
		Scanner leitor = new Scanner (System.in);
		for (int i = 0; i < numeros.length; i++) {
			System.out.println("Digite um numero: ");
			int numero = leitor.nextInt();
			numeros[i] =numero;
		}
		//**Busca Linear
		System.out.println("**Busca Linear**");
		System.out.println("Digite o n�mero a ser pesquisado: ");
		int alvo = leitor.nextInt();
		int posicaoResultado = -1;
		for (int i = 0; i < numeros.length; i++) {
			if (numeros[i] == alvo) {
				posicaoResultado = i;
			}
		}
		if (posicaoResultado < 0) {
			System.out.println("Elemento n�o foi encontrado");
		}else {
			System.out.println(String.format("O numero %d foi encontrado na posi��o %d", alvo, posicaoResultado));
		}
		//**FIM Busca Linear
		System.out.println("Vetor: ");
		imprimirArray(numeros);
		leitor.close();
	}
	
	private static void imprimirArray(int [] array ) {
		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
