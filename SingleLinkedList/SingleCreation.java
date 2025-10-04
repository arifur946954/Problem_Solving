package SingleLinkedList;

import java.util.Scanner;

public class SingleCreation {
    Node head=null;
    static  class Node{
       int head;
       Node next;
       Node(int data){
          this.head=data;
          this.next=null;
       }
    }




    public void creation(){
    int data,n;

        Scanner sc=new Scanner(System.in);
        do {
            System.out.println("Please inter data");
            data= sc.nextInt();
            Node new_node=new Node(data);


            System.out.println("New_node is"+new_node.head);
            if (head==null){
                head=new_node;
            }
            else {
                new_node.next=head;
                head=new_node;

            }
            System.out.println("Do you want to add more data if yes press 1 ");
            n=sc.nextInt();
        }
        while (n==1);


    }
    public void traverser(){
        Node temp=head;
        if (head==null){
            System.out.println("no data exist ");
        }
        else {
            while (temp !=null){
                System.out.print(" "+ temp.head);
                temp=temp.next;
            }
        }

    }

    public static void main(String[] args) {
        SingleCreation ll=new SingleCreation();
        ll.creation();
        ll.traverser();

    }
}
