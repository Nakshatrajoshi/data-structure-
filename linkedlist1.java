

public class linkedlist1 {
    Node head;

    static class Node{
        int data;
        Node next ;
        Node(int d){
            data = d;
            next = null;
        }

    }
    public void printlist() {
        Node n =head ;
        while (n!=null) {
            System.out.print(n.data+" ");
            n=n.next;
        }
    }
    public static void main(String[] args) {
        linkedlist1 llist = new linkedlist1();
        llist.head = new Node(1);
        Node second = new Node(2);
        Node third = new Node(3);
        Node fourth = new Node(4);

        llist.head.next = second;
        second.next =third;
        third.next=fourth;
        llist.printlist();

    }
}
