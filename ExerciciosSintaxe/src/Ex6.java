import java.util.Scanner;

public class Ex6 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner leia;
		int n1;
		int n2;
		int cod;
		int result;

		leia = new Scanner(System.in);

		System.out.println("Calculadora");
		System.out.println("Digite primeiro numero");
		n1 = leia.nextInt();
		System.out.println("Digite segundo numero");
		n2 = leia.nextInt();
		System.out.println("O c�digo da opera��o desejada");
		System.out.println("1- Soma");
		System.out.println("2- Subtra��o");
		System.out.println("3- Multiplica��o");
		System.out.println("4- Divis�o");
		cod = leia.nextInt();

		switch (cod) {
		case 1:
			result = n1 + n2;
			System.out.println("O resultado � " + result);
			break;
		case 2:
			result = n1 - n2;
			System.out.println("O resultado � " + result);
			break;
		case 3:
			result = n1 * n2;
			System.out.println("O resultado � " + result);
			break;
		case 4:
			if (n2 == 0) {
				System.out.println("N�o � possivel dividir por zero ");
				break;
			} else
				result = n1 / n2;
			System.out.println("O resultado � " + result);
			break;
		}

	}

}
