package lista3;

import java.util.Scanner;

public class quest�o5 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		int anos=0;
		double chico=1.5, juca=1.1; 
		
		while (juca<=chico) {
			chico = chico+0.02;
			juca = juca+0.03;
			anos = anos +1; 
		}
		
		System.out.println("Ser�o necess�rios " +anos+" anos para Juca ficar maior que Chico");
		
		

	}

}
