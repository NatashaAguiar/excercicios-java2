package lista3;

import java.util.Scanner;

public class quest�o7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int i, total;
		
		total=1;
		
		for(i=2; i<=64; i++) {
			total=total+(2*i);
		}
		System.out.println("A rainha pagar� "+total+ " de gr�os ao monge.");

	}

}
