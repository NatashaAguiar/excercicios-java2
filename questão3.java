package lista3;

import java.util.Scanner;

public class quest�o3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int num, i=1;

		System.out.println("Digite um n�mero e verifique se ele � triangular!");
		num = scan.nextInt();
		
		while (num>i*(i+2)*(i+3)) {
			i += 1;
		}
		if (num ==i*(i+2)*(i+3) ){
			System.out.println("O n�mero � tringular");
		}	
		 else  {
			System.out.println("O n�mero n�o � triangular");
		}

		
	}

}
