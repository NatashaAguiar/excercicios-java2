package lista3;

import java.util.Scanner;

public class questão2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Encontre o quinto nímero maior que 1000 cujo o resto é 5");

		int n = 1001, i=0;
		
		while (true) {
			if (n % 11 == 5)
				i++;
			if (n == 5) {
				System.out.println("O número que deseja é: " +n);
				break;
			}
		}
		n++;
		
	}
}
