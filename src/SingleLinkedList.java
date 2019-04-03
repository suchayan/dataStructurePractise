import java.util.ArrayList;

public class SingleLinkedList {

    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    void insertNodeBefore(int data){
        Node new_node=new Node(data);
        if (head==null){
            head=new_node;
            return;
        }
        else {
            new_node.next = head;
            head = new_node;
        }

    }

    void deleteNode(int position){
        Node current =head;
        int count=1;
        Node post;
        while(current.next!=null){
            if(count==position-1){
                post =current.next.next;
                current.next=post;
                return;
            }
            count++;
            current=current.next;

        }

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

    static ArrayList<Integer>TraversalNode(Node head){
        ArrayList<Integer> l1= new ArrayList<Integer>();
        Node current=head;
            while(current!=null){
                l1.add(current.data);
                current=current.next;
            }
        return l1;
    }

    public static void main(String[] args) {

   SingleLinkedList l1=new SingleLinkedList();

        l1.insertNodeBefore(34);
        l1.insertNodeBefore(36);
        l1.insertNodeBefore(39);
        l1.insertNodeBefore(40);
//        System.out.println("Total items in LinkedList: "+l1.countNodes(head));
        System.out.println("New LinkedList contents: "+l1.TraversalNode(head));
        l1.deleteNode(2);

        System.out.println("New LinkedList contents: "+l1.TraversalNode(head));

    }
}
