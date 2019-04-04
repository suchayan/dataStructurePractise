public class NumerofRepeats {
    Node head;
    class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }

    void push(int data){
        Node new_node=new Node(data);
        if (head==null){
            head=new_node;
        }
        else{
            new_node.next=head;
            head=new_node;
        }
    }

    void traverse(){
        Node current= head;
        while(current!=null){
            System.out.print(current.data+"-->");
            current=current.next;
        }
        System.out.print("null");
    }

    int reapeatcalc(int value){

        Node current=head;
        Node ptr1=head;
//        System.out.println(current.data);
        int count=1,times=0;
        while(current!=null){
            count++;
            current=current.next;
        }

        for(int i=1;i<count;i++){
            if(ptr1.data==value){

                times++;
            }
            ptr1=ptr1.next;
        }


        return times;
    }


        public static void main(String[] args) {
            NumerofRepeats l1=new NumerofRepeats();
            l1.push(1);
            l1.push(2);
            l1.push(3);
            l1.push(2);
            l1.push(3);
            l1.push(3);
            l1.push(3);
            l1.push(3);
            l1.traverse();
            System.out.println("\nOccurance is "+l1.reapeatcalc(3));


        }
}
