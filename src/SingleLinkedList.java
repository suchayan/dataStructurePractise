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

    void insertNodeAfter(int data){
        Node tail=head;
        Node new_node=new Node(data);
        if(head==null) {
            head = new_node;
            return;
        }

//        new_node.next=null;
        if(head!=null){
            while(tail.next!=null){
                tail=tail.next;

            }

        }
        tail.next=new_node;

    }

    void inserNodeMiddle(int data,int position){
        Node new_node=new Node(data);
        int count=1;
        Node post,current=head;
        while(current.next!=null){
            System.out.println("Head "+current.data+"-----"+current .next.data);
            if(count==position-1){
                post=current.next;
                current.next=new_node;
//                new_node=head;
                new_node.next=post;
                return;
            }
            count++;
            current=head.next;

        }
    }
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

    static ArrayList<Integer>TraversalNode(Node head){
        ArrayList<Integer> l1= new ArrayList<Integer>();
        Node current=head;
            while(current!=null){
//                System.out.println(head.data);
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
        System.out.println("Total items in LinkedList: "+l1.countNodes(head));
        l1.insertNodeAfter(100);
        System.out.println("New LinkedList contents: "+l1.TraversalNode(head));
        l1.inserNodeMiddle(890,2);
        System.out.println("New LinkedList contents: "+l1.TraversalNode(head));


    }
}
