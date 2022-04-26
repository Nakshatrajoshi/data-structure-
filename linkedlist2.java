import java.util.List;
import javax.swing.JOptionPane;
import java.util.Scanner;

public class linkedlist2 {
static Scanner sc = new Scanner(System.in);
	Node head;

	class Node {
		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}
	void deleteNode(int key )
	{
		Node temp = head , prev = null ;
		if (temp != null && temp.data == key ){
			head  = temp.next;
			return ;
		}
		while (temp != null && temp.data != key){
			prev = temp ;
			temp = temp.next;
          
		}
		if(temp == null){
			return ;
		}
		prev.next = temp.next;
	}

	public void push(int new_data) {
		Node new_Node = new Node(new_data);

		new_Node.next = head;
		head = new_Node;
	}

	public void insertAfter(Node prev_Node, int new_data) {
		if (prev_Node == null) {
			System.out.println(" the given node cannot be null");
			return;

		}
		Node new_Node = new Node(new_data);

		new_Node.next = prev_Node.next;
		prev_Node.next = new_Node;
	}

	public void append(int new_data) {
		Node new_Node = new Node(new_data);

		if (head == null) {
			head = new Node(new_data);
			return;
		}
		new_Node.next = null;

		Node last = head;
		while (last.next != null)
			last = last.next;
		last.next = new_Node;
		return;
	}

	public void printlist() {
		Node tnode = head;
		while (tnode != null) {
			System.out.println(tnode.data + " ");
			tnode = tnode.next;
		}
	}

	public static void main(String[] args) {
		linkedlist2 llist = new linkedlist2();
		System.out.println("\nchoose the value 1 for insertion and 2 for deletion");
		int a = sc.nextInt(); 
		if (a == 1 ){
		llist.append(6);
		llist.push(7);
		llist.push(1);
		llist.append(4);
		llist.insertAfter(llist.head.next, 8);

		System.out.println("\n created linked list is :");
		llist.printlist();
		}
		else if (a == 2){
			llist.push(7);
			llist.push(1);
			llist.push(3);
			llist.push(2);

		llist.deleteNode(1);
		System.out.println("\n linked list after deletion of 1 :");
		llist.printlist();
		}
		else {
			JOptionPane.showMessageDialog(null,"error" );
		}
	}
}