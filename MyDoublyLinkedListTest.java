//***************************
 // 파일명: MyDoublyLinkedListTest.java
 // 작성자: 김지희
 // 작성일: 2018.10.09
 // 설명:이중 연결리스트 연산을 구현한다.
 //***************************
package hw6_2;

import java.util.Scanner;

public class MyDoublyLinkedListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("hw6_2:김지희");
		MyDoublyLinkedList list = new MyDoublyLinkedList();
		Scanner input = new Scanner(System.in);
		int menu;
		int element;
		do {
			System.out.println("1:전체조회 2:길이조회 3:맨앞삽입 4:맨뒤삽입 5:맨앞삭제 6:맨뒤삭제 7:삭제 8:왕복출력 9:종료");
			menu = input.nextInt();
			switch (menu) {
			case 1:
				System.out.println("리스트 전체를 조회합니다.");
				System.out.println(list.toString());
				break;

			case 2:
				System.out.println("리스트 길이를 조회합니다.");
				System.out.println(list.size());
				break;

			case 3:
				System.out.println("원소를 리스트의 맨 앞에 삽입합니다.");
				System.out.print("정수값 입력: ");
				element = input.nextInt();
				list.addFirst(element);
				break;

			case 4:
				System.out.println("원소를 리스트의 맨 뒤에 삽입합니다.");
				System.out.println("정수값 입렵:");
				element = input.nextInt();
				list.addLast(element);
				break;

			case 5:
				System.out.println("리스트의 맨 앞 원소를 삭제합니다.");
				System.out.println(list.removeFirst());
				break;

			case 6:
				System.out.println("리스트의 맨 뒤 원소를 삭제합니다.");
				System.out.println(list.removeLast());
				break;
				
			case 7:
				System.out.println("리스트의 값을 받아 삭제합니다.");
				System.out.println("정수값 입렵:");
				element = input.nextInt();
				System.out.println(list.remove(element));
				break;

			case 8:
				System.out.println("리스트 전체를 왕복 조회합니다.");
				list.printList();
				break;
				
			default:
				System.out.println("메뉴 선택 오류: 다시 선택하세요.");

			}
		} while (menu != 9);
	}
}
