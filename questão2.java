package lista3;

import java.util.Scanner;

public class quest�o2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Encontre o quinto n�mero maior que 1000 cujo o resto � 5");

		int n = 1001, i=0;
		
		while (true) {
			if (n % 11 == 5)
				i++;
			if (n == 5) {
				System.out.println("O n�mero que deseja �: " +n);
				break;
			}
		}
		n++;
		
	}
}
