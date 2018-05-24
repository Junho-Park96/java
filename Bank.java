/*
 * 파일명: Bank.java
 * 작성일: 2018.5.4
 * 작성자: 박준호
 */

public class Bank {
	// (1) 2개의 private 필드 :
	//    500원 개수(정수형)와 100원 개수(정수형)
	private int n500;
	private int n100;

	// (2) 500원 개수, 100원 개수를 매개변수로 받아
	//    초기화 하는 생성자

	public Bank(int n500, int n100) {
		this.n500 = n500;
		this.n100 = n100;
	}
	// (3) add() - 500원 개수, 100원 개수를 매개변수로 받아
	//     저금하는 메소드
	public void add (int n500, int n100) {
		this.n500 += n500;
		this.n100 += n100;	
	}
	// (4) open() -돼지저금통을 열어 저금액을 리턴하는 메소드
	//     저금통을 열고 나면 동전 개수는 모두 0이 된다.
	public int open() {
		int sum = n500 * 500 + n100 * 100;
		n500=0;
		n100=0;
		return sum;
	}

}

