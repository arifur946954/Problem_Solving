
public class SingleLinkedList {

    static  class Node{
     int head;
     Node next;
     Node(int data){
         this.head=data;
         this.next=null;
     }

    }

    public  void creation(){

    }

    public  void travers(){

    }

    public static void main(String[] args) {
        Node first=new Node(10);
        Node second=new Node(20);
        Node third=new Node(30);
        Node fourth=new Node(40);

        first.next=second;
        second.next=third;
        third.next=fourth;

        Node current=first;
        while (current!=null){
            System.out.println(current.head);

            current=current.next;
        }

    }
    }

