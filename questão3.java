package lista3;

import java.util.Scanner;

public class questão3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, i=1;

		System.out.println("Digite um número e verifique se ele é triangular!");
		num = scan.nextInt();
		
		while (num>i*(i+2)*(i+3)) {
			i += 1;
		}
		if (num ==i*(i+2)*(i+3) ){
			System.out.println("O número é tringular");
		}	
		 else  {
			System.out.println("O número não é triangular");
		}

		
	}

}
