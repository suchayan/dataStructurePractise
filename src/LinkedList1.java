public class LinkedList1 {
    static Node head;
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            next = null;
        }
    }
        void insertNode(int data){
            Node new_node = new Node(data);
            if(head==null){
                head=new_node;
            }
            else{
                new_node.next=head;
                head=new_node;
            }
        }

        void travesal(){
            Node current =head;
            while(current!=null){
                System.out.print(current.data+" ");
                current=current.next;

            }
        }


        int nthNodefromLast(int position){
            Node current=head;
            int count=0,i;
            if (position ==0){
                return -1;
            }

            if(head==null){
                return -1;
            }
            //Total length of Node got
            while(current!=null){
                count++;
                current=current.next;
            }

            System.out.println(count+"-----");
//            if (position-count==0){
//                return head.data;
//            }
            if(position>count){
                return -1;
            }
            System.out.println("\n"+count+"---"+position+"------"+(count-position));
            current=head;
            for(i = 1;i<=count-position;i++){

                System.out.println(current.data +"--inhere---"+i);
                if(current.next!=null) {
                    current = current.next;
                }
            }
//            System.out.println("Req data: "+current.data);
            return current.data;
        }

        public static void main(String[] args) {
            LinkedList1 l1= new LinkedList1();
            //39->37->35->34->32
            l1.insertNode(32);
            l1.insertNode(34);
            l1.insertNode(35);
            l1.insertNode(37);
            l1.insertNode(39);
            l1.travesal();
            System.out.println("\nReq data: "+l1.nthNodefromLast(5));
        }



}
