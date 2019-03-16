import java.util.Scanner;

public class Ex16 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia;
		int x, i;
		int vetor[] = new int[10];

		leia = new Scanner(System.in);

		System.out.println("Digite 5 numeros para colocar no vetor");
		for (x = 0; x < 10; x++) {

			vetor[x] = leia.nextInt();

		}
		System.out.println("Valores guardados no vetor");
		for (i = 9; i >= 0; i--) {
			System.out.println(vetor[i]);
		}

	}
}
