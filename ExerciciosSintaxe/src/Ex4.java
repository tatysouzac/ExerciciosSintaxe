import java.util.Scanner;

public class Ex4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia;
		int num1;
		int num2;
		int num3;

		leia = new Scanner(System.in);

		System.out.println("Digite tres numeros");
		num1 = leia.nextInt();
		num2 = leia.nextInt();
		num3 = leia.nextInt();

		if (num1 < num2 && num2 < num3) {
			System.out.println(num1);
			System.out.println(num2);
			System.out.println(num3);
		}

		if (num1 < num3 && num3 < num2) {
			System.out.println(num1);
			System.out.println(num3);
			System.out.println(num2);
		}
		if (num3 < num1 && num1 < num2) {
			System.out.println(num3);
			System.out.println(num1);
			System.out.println(num2);
		}

		if (num2 < num1 && num1 < num3) {
			System.out.println(num2);
			System.out.println(num1);
			System.out.println(num3);
		}

		if (num2 < num3 && num3 < num1) {
			System.out.println(num2);
			System.out.println(num3);
			System.out.println(num1);
		}
		if (num3 < num2 && num2 < num1) {
			System.out.println(num3);
			System.out.println(num2);
			System.out.println(num1);
		}
	}

}
