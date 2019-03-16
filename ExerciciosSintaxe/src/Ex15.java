import java.util.Scanner;

public class Ex15 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia;
		int x, i;
		int vetor[] = new int[5];

		leia = new Scanner(System.in);

		System.out.println("Digite 5 numeros para colocar no vetor");
		for (x = 0; x < 5; x++) {

			vetor[x] = leia.nextInt();

		}
		System.out.println("Valores guardados no vetor");
		for (i = 0; i < 5; i++) {
			System.out.println(vetor[i]);
		}

	}
}
