import java.util.Scanner;

public class NewStar {

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.print("���ڸ� �Է��Ͻÿ� (2�̻��Է�): ");

		num = sc.nextInt(); //type�� �޴� ����

		//���ﰢ��

		for (int x = 0; x < num; x++ ) {
			for (int y = 0; y < num - x + 2 ; y++ ) {

				System.out.print(" ");

			}

			for (int y = 0; y < 2 * (x + 1) -1 ; y++ ) {

				System.out.print("*");

			}


			System.out.println(" ");

		}


		//���Ⱥ��� �������

		for (int x = num - 1; x >= 0; x-- ) {



			for (int y = 0; y < num -  x ; y++ ) {

				System.out.print(" ");

			}

			for (int y = 0; y <  2*x + 5 ; y++ ) {

				System.out.print("*");

			}

			System.out.println();
		}


		//�δٸ�

		for (int x = 0; x < num; x++ ) {

			for (int y = 0; y < x; y++ ) {

				System.out.print("*");

			}


			for (int y = 0; y <  x  ; y++ ) {

				System.out.print(" ");

			}


			for (int y = 0; y < x; y++ ) {

				System.out.print("*");

			}

			System.out.println();
		}

	}

}






