package lista3;

import java.util.Scanner;

public class questão1 {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int numCarteira = 0, numMultas, maiorCarteira = 0, maiorNumMulta = 0, resposta;
		double valorMultas, somaMultas = 0, totalMultas = 0;

		while (true) {
			System.out.println("Digite o número da carteira de motorista?");
			numCarteira = scan.nextInt();
			if (numCarteira < 1 || numCarteira > 4327) {
				System.out.println("NÚMERO INVÁLIDO");

			} else {

				somaMultas = 0;
				System.out.println("Digite o número de multas.");
				numMultas = scan.nextInt();
				for (int i = 1; i <= numMultas; i++) {
					System.out.print("Digite o valor da multa " + (i) + " ");
					valorMultas = scan.nextDouble();
					somaMultas += valorMultas;

					totalMultas += valorMultas;

				}

				if (numMultas > maiorNumMulta) {
					maiorNumMulta = numMultas;
					maiorCarteira = numCarteira;
				}
				System.out.println("Carteira de motorista: " + numCarteira);
				System.out.println("Valor total a pagar: " + somaMultas);
				System.out.println("Deseja continuar? Digite 1 para nao ou 2 para sim");
				resposta = scan.nextInt();

				if (resposta == 1) {
					System.out.println("A carteira que teve o maior número de multas foi: " + maiorCarteira);
					System.out.println("Total de recursos arrecadados: " + totalMultas);
					System.exit(1);

				}

			}

		}

	}
}
