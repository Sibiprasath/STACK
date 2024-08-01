import java.util.*;
class Linkedliststack{
  Node head;
  Node tail;
  class Node{
    int data;
    Node next;
    Node prev;
    
    Node(int val){
      data=val;
      next=null;
      prev=null;
      
    }
  }
  Linkedliststack(){
    head=null;
    tail=null;
  }
  public void insertend(int val){
    Node newnode=new Node(val);
    if(head==null)
    {
      head=newnode;    
      tail=newnode;
    }
    else
    {
      tail.next=newnode;
      newnode.prev=tail;
      tail=newnode;
    }
  }
   public void dltend(){
        Node temp=tail;
        tail=temp.prev;
        temp.prev=null;
        tail.next=null;
   }
   public void peak(){
        if(tail!=null){
            System.out.println("\npeak ="+tail.data);
        }
   }
 
  public void display(){
    Node temp=head;
    while(temp!=null){
      System.out.print(temp.data+" ");
      temp=temp.next;
    }
  }
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    Linkedliststack list=new Linkedliststack();
    int a=sc.nextInt();
    for(int i=0;i<a;i++){
        int s=sc.nextInt();
        list.insertend(s);
    }
    list.display();
    System.out.println("\n");
    list.dltend();
    list.display();
    list.peak();
  }
}