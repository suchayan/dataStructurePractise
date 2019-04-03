import java.util.LinkedList;
class Node{
    int data;
    Node next;
    Node(int data){
        this.data=data;
        next=null;
    }
}

public class SingleLinkedList {
    void deleteNode(Node head){

    }

    static int countNodes(Node head){
        int count=0;
        Node current=head;
        while(current!=null) {
            System.out.println(current.data);
            current=current.next;
            count++;
        }
        return count;
    }

    public static void main(String[] args) {
        Node head=new Node(11);
        Node nodeB=new Node(211);
        Node nodeC=new Node(321);
        Node nodeD=new Node(434);
        //link setup
        head.next=nodeB;
        nodeB.next=nodeC;
        nodeC.next=nodeD;

        System.out.println(countNodes(head));


   LinkedList l1=new LinkedList();
        l1.push(1);



    }
}
