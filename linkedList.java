import java.io.EOFException;

public class linkedList {

    class Node{
        int data;
        Node next;
    
        //constructor
        Node(int val){
            this.data = val;
            this.next = null;
        }
    }
    private Node head;
    private Node tail;
    private int size;

    public void addFirst(int val){
        Node nn=new Node(val);

        if(size==0){
            head=nn;
            tail=nn;
            size++;

        }else{
            nn.next=head;
            head=nn;
            size++;
        }
    }
    public void addLast(int val){

        Node nn=new Node(val);
        if(size==0){
            addFirst(val);
        }else{
            tail.next=nn;
            tail=nn;
            size++;
        }
    }
    public void removeFirst(){
        if(size==1){
            head=null;
            tail=null;
            size=0;

        }else{
            head=head.next;
            size--;
        }

    }
    public Node getNodeAt(int idx)throws Exception{
        if(idx>size){
            throw new Exception("invalid index");
        }
        Node temp=head;
        for(int i=1;i<idx;i++){
            temp=temp.next;
        }
        return temp;
    }
    public void removeLast() throws Exception{
        if(size==0){
            throw new Exception("linkedlist khali hai");
        }else if(size==1){
            head=null;
            tail=null;
            size=0;
        }else{
          Node temp=getNodeAt(size-1);
          temp.next=null;
          tail=temp;
          size--;

        }
    }

    //traverse;
    public void traverse(){
        traverse(head);
    }
        private void traverse(Node head){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.data+"->");
            temp = temp.next;
        }
        System.out.println("");
    }
}