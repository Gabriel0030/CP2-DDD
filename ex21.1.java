package lista4;
import java.util.Scanner;

public class Ex21.1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int num;
		
		System.out.printf("Digite um número positivo: ");
		num=ler.nextInt();
		
		while(num<=0) {
			System.out.printf("Este número é negativo, por favor digite um"
				+ " número positivo: ");
			num=ler.nextInt();
		}
		System.out.printf("Fim");
ler.close();
	}

}
