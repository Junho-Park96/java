
import java.util.Scanner;

import java.util.*;

public class NewDiamond { // * 로 다이아 몬드 모양 찍기
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, c, d, e;

		System.out.print("n의 값을 입력하시오 : ");
		
		int n = scan.nextInt();
		System.out.println();
		
		for (a = 0; a < n; a++) { // 윗부분 for문
		
			for (d = 0; d < n - a; d++) { // 감소하는 공백
				System.out.print(" ");
			}
			for (c = 0; c < a; c++) { // 증가하는 별
				System.out.print("*");
			}

			for (b = 0; b < a + 1; b++) { // 증가하는 별
				System.out.print("*");
			}
			for (e = 0; e < n - a; e++) { // 감소하는 공백
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		for (a = 0; a < n + 1; a++) { // 밑부분 for문
			
			for (b = 0; b < a; b++) { // 증가하는 공백
				System.out.print(" ");
			}
			for (c = n + 1; c > a; c--) {// 감소하는 별
				System.out.print("*");
			}
			for (d = a; d < n; d++) {// 감소하는 별
				System.out.print("*");
			}
			for (e = 0; e < a; e++) { // 증가하는 공백
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}

