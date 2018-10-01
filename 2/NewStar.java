import java.util.Scanner;

public class NewStar {

	public static void main(String[] args) {

		int num;

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력하시오 (2이상입력): ");

		num = sc.nextInt(); //type을 받는 변수

		//윗삼각형

		for (int x = 0; x < num; x++ ) {
			for (int y = 0; y < num - x + 2 ; y++ ) {

				System.out.print(" ");

			}

			for (int y = 0; y < 2 * (x + 1) -1 ; y++ ) {

				System.out.print("*");

			}


			System.out.println(" ");

		}


		//두팔부터 몸통까지

		for (int x = num - 1; x >= 0; x-- ) {



			for (int y = 0; y < num -  x ; y++ ) {

				System.out.print(" ");

			}

			for (int y = 0; y <  2*x + 5 ; y++ ) {

				System.out.print("*");

			}

			System.out.println();
		}


		//두다리

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






