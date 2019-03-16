import java.util.Scanner;;

public class Ex18 {
	public static void main(String[] args) {

		Scanner leia;
		int vet[] = new int[10];

		leia = new Scanner(System.in);

		System.out.println("Digite 10 numeros para armazenar no vetSor");
		for (int x = 0; x < 10; x++) {
			vet[x] = leia.nextInt();
		}

		for (int i = 0; i < 10; i++) {
			for (int y = 0; y < 10; y++) {
				if (vet[y] > vet[i]) {
					int aux = vet[y];
					vet[y] = vet[i];
					vet[i] = aux;
				}
			}
		}

		System.out.println("Vetor ordenado");
		for (int a = 0; a < 10; a++) {
			System.out.println(vet[a]);
		}

	}

}
