import java.util.*;

class LinkedList {

    static class Node {

        int data;
        Node next;

        public Node(int a) {
            data = a;
            next = null;
        }
	
    }
	
	Node head;
		
		public LinkedList(){
			head=null;
		}
	
	public void addNode(int val){
		
		Node newNode = new Node(val);
		newNode.next=head;
		head=newNode;
		
	}
	
	public void reverse(Node trav){
		if(trav.next==null){
			head=trav;
			return;
		}
		reverse(trav.next);
		trav.next.next=trav;
		trav.next=null;
	}
	public void display(){
		
		System.out.println("List ;");
		Node trav=head;
		while(trav!=null){
			
			System.out.print(trav.data+", ");
			trav=trav.next;
		}
		System.out.println();
	}
    public static void main(String args[]) {
		
		LinkedList l1=new LinkedList();
		
		l1.addNode(10);
		l1.addNode(20);
		l1.addNode(30);
		l1.addNode(40);
		l1.addNode(50);
		l1.addNode(60);
		l1.display();
		l1.reverse(l1.head);
		System.out.println("reverse   : ");
		l1.display();
		
	}
}