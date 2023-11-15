import java.util.Scanner;

public class OlaMundo2 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		final int TAM = 10;
		
		int tab;
		
		do {
			System.out.print("Informe um número de 1 a 10: ");
			tab = entrada.nextInt();
		} while(tab < 1 || tab > 10);
		
		/* Ou
		while(tab < 1 || tab > 10) {
			System.out.print("Informe um número de 1 a 10: ");
			tab = entrada.nextInt();
		}
		*/
		
		/*
		for(int x = 0; x <= TAM; x++)
			System.out.println(x);
		*/
		
		System.out.println("\nTabuada do " + tab + ":");
		for(int x = 0; x <= TAM; x++)
			System.out.println(tab + " x " + x + " = " + (tab * x));
		
		entrada.close();
	}
}