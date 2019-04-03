class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

public class LinkedList {

    static int countNodes(Node head){
        int count=1;
        Node current=head;
        while(current.next!=null) {
            System.out.println(current.data);
            current=current.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head=new Node(1);
        Node nodeB=new Node(2);
        Node nodeC=new Node(3);
        Node nodeD=new Node(4);
        //link setup
        head.next=nodeB;
        nodeB.next=nodeC;
        nodeC.next=nodeD;

        System.out.println(countNodes(head));

    }
}
