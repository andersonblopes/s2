package com.s2.avaliacao;

import java.util.Scanner;

public class Questao8 {

	private static Scanner entrada;

	public static void main(String[] args) {
		System.out.println("===============================");
		entrada = new Scanner(System.in);
		System.out.println("Digite A: ");
		Integer a = entrada.nextInt();
		System.out.println("Digite B: ");
		Integer b = entrada.nextInt();

		CalculaNovoNumero(a, b);
	}

	public static Integer Calcular(String a, String b) {
		StringBuilder novoNumero = new StringBuilder();
		int limite = Math.max(a.length(), b.length());
		for (int i = 0; i <= limite; i++) {
			if (i < a.length()) {
				novoNumero.append(a.charAt(i));
			}
			if (i < b.length()) {
				novoNumero.append(b.charAt(i));
			}
		}
		Integer novoNumeroGerado = Integer.valueOf(novoNumero.toString());

		// Se o novo número gerado for superior a 1000000, retornar -1
		return novoNumeroGerado <= 1000000 ? novoNumeroGerado : -1;
	}

	public static void CalculaNovoNumero(Integer primeiroNumero, Integer segundoNumero) {
		System.out.println("Número A: " + primeiroNumero);
		System.out.println("Número B: " + segundoNumero);

		// para geração do número A e B devem ser diferentes de null
		if (primeiroNumero == null || segundoNumero == null) {
			System.out.println("Nenhum parâmetro pode ser nulo: ");
		} else {
			Integer novoNumeroGerado = Calcular(Integer.toString(primeiroNumero), Integer.toString(segundoNumero));
			System.out.println("===============================");
			System.out.println("Número C: " + novoNumeroGerado);
		}

	}

}
