package lista3;

import java.util.Scanner;

public class quest�o6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int i = 0, feminino = 0, masculino = 0;
		double maiorAltura = 0, menorAltura = 0, alturaMasculina = 0, alturaFeminina = 0, altura = 0, sexo,
				mediaMulheres, mediaPopula��o, porcentagemHomens;

		for (i = 1; i <= 50; i++) {
			System.out.println("Digite 0 para sexo masculino e 1 para sexo feminino.");
			sexo = scan.nextInt();
			System.out.println("Qual a altura?");
			altura = scan.nextDouble();
			if (sexo == 0) {
				masculino += 1;
				alturaMasculina = alturaMasculina + altura;
			} else if (sexo == 1) {
				feminino += 1;
				alturaFeminina = alturaFeminina + altura;
			}
			if (altura >= maiorAltura) {
				maiorAltura = altura;
			}
			if (altura < menorAltura) {
				menorAltura = altura;
			}
			mediaMulheres = alturaFeminina / feminino;
			mediaPopula��o = (alturaFeminina + alturaMasculina) / 50;
			porcentagemHomens = masculino * 0.5;

			System.out.println("A m�dia das mulheres �: " + mediaMulheres);
			System.out.println("A m�dia da popula��o �: " + mediaPopula��o);
			System.out.println("A percentual de homens da popula��o �: " + porcentagemHomens);

		}
	}

}
