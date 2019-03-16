import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner entrada;
		int num1;
		int num2;

		entrada = new Scanner(System.in);

		System.out.println("Digite primeiro numero:");
		num1 = entrada.nextInt();
		System.out.println("Digite segundo numero:");
		num2 = entrada.nextInt();

		if (num1 > num2) {
			System.out.println("O maior numero é o " + num1);
		} else
			System.out.println("O maior numero é o " + num2);
	}

}
