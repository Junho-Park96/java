
import java.util.Scanner;

import java.util.*;

public class NewDiamond { // * �� ���̾� ��� ��� ���
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int a, b, c, d, e;

		System.out.print("n�� ���� �Է��Ͻÿ� : ");
		
		int n = scan.nextInt();
		System.out.println();
		
		for (a = 0; a < n; a++) { // ���κ� for��
		
			for (d = 0; d < n - a; d++) { // �����ϴ� ����
				System.out.print(" ");
			}
			for (c = 0; c < a; c++) { // �����ϴ� ��
				System.out.print("*");
			}

			for (b = 0; b < a + 1; b++) { // �����ϴ� ��
				System.out.print("*");
			}
			for (e = 0; e < n - a; e++) { // �����ϴ� ����
				System.out.print(" ");
			}
			
			System.out.println();
		}
		
		for (a = 0; a < n + 1; a++) { // �غκ� for��
			
			for (b = 0; b < a; b++) { // �����ϴ� ����
				System.out.print(" ");
			}
			for (c = n + 1; c > a; c--) {// �����ϴ� ��
				System.out.print("*");
			}
			for (d = a; d < n; d++) {// �����ϴ� ��
				System.out.print("*");
			}
			for (e = 0; e < a; e++) { // �����ϴ� ����
				System.out.print(" ");
			}
			System.out.println();
		}
		
		
	}

}

