package lista3;

import java.util.Scanner;

public class quest�o8 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int num, maior=0; 
		
		System.out.println("Digite um n�mmero inteiro positivo");
		num=scan.nextInt();
		while(num!=-1) {
			System.out.println("Para dar continuidade digite um n�mmero inteiro positivo, para encerrar digite -1");
			num=scan.nextInt();
			if(num>maior) {
				maior=num;
				System.out.println("O maior valor � "+maior);
			}
		}
		
		

	}

}
