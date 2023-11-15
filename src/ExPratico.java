import java.util.Scanner;

public class ExPratico {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		int quant = 0;
		int soma = 0;
		
		do {
			System.out.print("Insira um valor (ou zero, caso queira encerrar): ");
			num = entrada.nextInt();
			if(num != 0)
				quant++;
				soma = soma + num;
		} while(num != 0);
		
		if(quant > 0) {
			float media = (float) soma / quant;
			System.out.print("\nQuantidade de números inseridos: " + quant + "\n"
							+ "Soma: " + soma + "\n"
							+ "Média: " + media);
		} else
			System.out.print("\nNenhum valor foi informado.");
			
		entrada.close();
	}
}