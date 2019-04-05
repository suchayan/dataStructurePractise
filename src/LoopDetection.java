/*Implementation of Floyd’s Cycle-Finding Algorithm:
* Need to check this too*/

import java.util.ArrayList;

public class LoopDetection {
    static Node head;
    static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    Node loop(){
        ArrayList<Node> nodelist= new ArrayList<Node>();
        Node current=head;
        while(current!=null){
            if(!nodelist.contains(current)){
                nodelist.add(current);
            }
            else{
                System.out.println("------"+current.data);
                return current;
            }
            current=current.next;
        }
    return null;
    }


//    void push(){
//
//    }
    void traverse(){

        Node current=head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;

        }


    }

    public static void main(String[] args) {
        LoopDetection l1= new LoopDetection();
//        l1.push();
//        l1.push();
//        l1.push();
//        l1.push();
//        l1.push();
        Node nodeA = new Node(1);
        Node nodeB = new Node(2);
        Node nodeC = new Node(3);
        Node nodeD = new Node(4);
//        A-->B-->C-->D-->B
        nodeA.next= nodeB;
        nodeB.next=nodeC;
        nodeC.next=nodeD;
        nodeD.next=nodeB;
        head=nodeA;
        //l1.traverse();
        System.out.println(l1.loop().data);




    }

}
