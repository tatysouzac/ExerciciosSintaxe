import java.util.Scanner;

public class Ex17 {
	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		int vet[] = new int[10];
		int y = 0;

		for (int x = 0; x < 10; x++) {
			int num = leia.nextInt();
			do {
				if (num == vet[x]) {
					System.out.println("Esse numero ja existe no vetor, digite novamente");
				} else
					vet[x] = num;
				y++;
			} while (y < x);
		}
	}
}
