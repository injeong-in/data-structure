package list2;

public class LinkedList {

  public class Node {
     Node next;
     Object data;

     public Node(Object data) {
         this.data = data;
         this.next = null;
     }

     void append(Object data) {
         Node end = new Node(data); //새로생성해서 넣어줄 end노드
         Node n = this;
         while(n.next != null) {
             n = n.next;
         }
        n.next = end; //마지막 노드에 새로생성한 노드를 넣어준다
     }

     void delete(Object data) {
         Node n = this;
         while(n.next != null) {
             if(n.next.data == data) {
                 n.next = n.next.next;
             } else {
                 n = n.next;
             }
         }
     }

     void retrieve(){
         Node n = this;
         while(n.next != null) {
             System.out.print(n.data+"->");
             n = n.next;
         }
         System.out.println(n.data);
     }

 }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        Node head = list.new Node(1);
        head.append(2);
        head.append(3);
        head.append(4);
        head.retrieve();
        head.delete(2);
        head.retrieve();




    }

}