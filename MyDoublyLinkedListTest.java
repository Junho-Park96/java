//***************************
 // ���ϸ�: MyDoublyLinkedListTest.java
 // �ۼ���: ������
 // �ۼ���: 2018.10.09
 // ����:���� ���Ḯ��Ʈ ������ �����Ѵ�.
 //***************************
package hw6_2;

import java.util.Scanner;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_2:������");
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		Scanner input = new Scanner(System.in);
		int menu;
		int element;
		do {
			System.out.println("1:��ü��ȸ 2:������ȸ 3:�Ǿջ��� 4:�ǵڻ��� 5:�Ǿջ��� 6:�ǵڻ��� 7:���� 8:�պ���� 9:����");
			menu = input.nextInt();
			switch (menu) {
			case 1:
				System.out.println("����Ʈ ��ü�� ��ȸ�մϴ�.");
				System.out.println(list.toString());
				break;

			case 2:
				System.out.println("����Ʈ ���̸� ��ȸ�մϴ�.");
				System.out.println(list.size());
				break;

			case 3:
				System.out.println("���Ҹ� ����Ʈ�� �� �տ� �����մϴ�.");
				System.out.print("������ �Է�: ");
				element = input.nextInt();
				list.addFirst(element);
				break;

			case 4:
				System.out.println("���Ҹ� ����Ʈ�� �� �ڿ� �����մϴ�.");
				System.out.println("������ �Է�:");
				element = input.nextInt();
				list.addLast(element);
				break;

			case 5:
				System.out.println("����Ʈ�� �� �� ���Ҹ� �����մϴ�.");
				System.out.println(list.removeFirst());
				break;

			case 6:
				System.out.println("����Ʈ�� �� �� ���Ҹ� �����մϴ�.");
				System.out.println(list.removeLast());
				break;
				
			case 7:
				System.out.println("����Ʈ�� ���� �޾� �����մϴ�.");
				System.out.println("������ �Է�:");
				element = input.nextInt();
				System.out.println(list.remove(element));
				break;

			case 8:
				System.out.println("����Ʈ ��ü�� �պ� ��ȸ�մϴ�.");
				list.printList();
				break;
				
			default:
				System.out.println("�޴� ���� ����: �ٽ� �����ϼ���.");

			}
		} while (menu != 9);
	}
}
