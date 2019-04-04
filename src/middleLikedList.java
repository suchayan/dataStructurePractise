import java.util.ArrayList;

public class middleLikedList{
    Node head;
    class Node{
        int data ;
        Node next;
        Node(int data){
            this.data=data;
            next=null;
        }
    }

    ArrayList<Integer> middleNode(){
        //total node length
        Node current=head;
        int count=0;
        ArrayList<Integer> midlist= new ArrayList<Integer>();
        while(current!=null){
            count++;
            current=current.next;
        }
        //check even or odd node count
        current=head;  //re-initializing current pointer to head
//        System.out.println(count/2+"---");
         if(count%2==0){

            for(int i=1;i<count/2;i++){

                current=current.next;
            }
//             System.out.print("\n-----------"+current.data);
            midlist.add(current.data);
            midlist.add(current.next.data);
            return midlist;
         }
         else{
             for(int i=1;i<=(count/2);i++){
                 current=current.next;
             }
             midlist.add(current.data);
             return midlist;
         }
//        System.out.println("Middle Element: "+current.data);
    }

    void push(int data){
        Node new_node=new Node(data);
        if (head==null){
            head=new_node;
        }
        else {
            new_node.next = head;
            head = new_node;
        }

    }

    void traversal(){
        Node current=head;
        while(current!=null) {
            System.out.print(current.data+" ");
            current = current.next;

        }
        }






    public static void main(String[] args) {
        middleLikedList l1= new middleLikedList();
        l1.push(1);
        l1.push(2);
        l1.push(3);
        l1.push(54);

        l1.push(5);
        l1.traversal();
        System.out.println("\n"+l1.middleNode());

    }
}
