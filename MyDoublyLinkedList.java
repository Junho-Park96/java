package hw6_2;

public class MyDoublyLinkedList {
	private class DblNode {
		int data;
		DblNode rlink;
		DblNode llink;

		DblNode(int data) {
			this.data = data;
		}
	}

	private DblNode head = null;

	public void addFirst(int data) {
		DblNode n = new DblNode(data);
		if (head != null) {
			n.rlink = head;
			head.llink = n;
			head = n;
		} else {
			head = n;
		}
	}

	public void addLast(int data) {
		DblNode n = new DblNode(data);
		DblNode temp = head;
		if (head != null) {
			while (temp.rlink != null) {
				temp = temp.rlink;
			}
			temp.rlink = n;
			n.llink = temp;
		} else {
			head = n;
		}

	}

	public int removeFirst() {
		int del = head.data;
		if (head != null) {
			head = head.rlink;
			head.llink = null;
		}
		return del;
	}

	public int removeLast() {
		int del = 0;
		DblNode temp = head;
		if (head.rlink == null) {
			del = head.data;
			head = null;
		} else {
			while (temp.rlink.rlink != null) {
				temp = temp.rlink;
			}
			del = temp.rlink.data;
			temp.rlink = null;
		}
		return del;
	}

	public boolean remove(int i) {
		DblNode temp = head;
		while (temp != null) {
			if (temp.data == i) {
				if (temp.rlink == null) {
					temp.llink.rlink = null;
				} else if (temp.llink == null) {
					head = temp.rlink;
					temp.rlink.llink = null;
				} else {
					temp.rlink.llink = temp.llink;
					temp.llink.rlink = temp.rlink;
				}
				temp = temp.rlink;
				return true;
			}
			temp = temp.rlink;
		}
		return false;
	}

	@Override
	public String toString() {
		DblNode n = head;
		String str = "";
		while (n != null) {
			str += n.data + " ";
			n = n.rlink;
		}
		return "list=" + str;
	}

	public void printList() {
		if (head == null) {
			System.out.println("( )( )");
		} else {
			System.out.print("(");
			DblNode temp = head;

			while (temp.rlink != null) {
				System.out.print(temp.data + " ");
				temp = temp.rlink;
			}
			System.out.print(temp.data);
			System.out.print(") (");
			while (temp != null) {
				System.out.print(temp.data + " ");
				temp = temp.llink;
			}
			System.out.println(")");
			// ......... 완성하세요.

		}
	}

	public int size() {
		int result = 0;
		DblNode temp = head;
		while (temp != null) {
			result++;
			temp = temp.rlink;

		}
		return result;
	}

}
