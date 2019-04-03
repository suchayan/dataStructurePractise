class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
    }
}

public class LinkedList {

    public static void main(String[] args) {
        Node head=new Node(1);
        Node nodeB=new Node(1);
        Node nodeC=new Node(1);
        Node nodeD=new Node(1);
        //link setup
        head.next=nodeB;
        nodeB.next=nodeC;
        nodeC.next=nodeD;

    }
}
