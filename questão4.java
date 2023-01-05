package lista3;

import java.util.Scanner;

public class questão4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, cont = 0;

		System.out.println("Digite um número");
		num = scan.nextInt();

		while (num > 0) {
			if (num >= 100 && num <= 200) {
				cont += 1;
			} else if (num == 0) {
				System.exit(0);
			}

		}
		System.out.println("Foram digitados " + cont + " entre 100 e 200!");

	}

}
