import java.util.NoSuchElementException;

public class Queue {
    private ListNode front;
    private ListNode rear;
    private int length;
    private class ListNode{
        private int data;
        private ListNode next;
        public ListNode(int data){
            this.data=data;
            this.next=null;

        }
    }
    public Queue(){
        front=null;
        rear=null;
        length=0;
    }
    public int length(){
        return length;
    }
    public boolean isEmpty(){
        return length==0;
    }

    public void enqueue(int data){
        ListNode temp=new ListNode(data);
        if(isEmpty()){
            front=temp;
        }else{
            rear.next=temp;
        }
        rear=temp;
        length++;

    }


    public int dequeue(){
        if(isEmpty()){
            throw new NoSuchElementException("Queue is Already EMPTY");
        }
        int result=front.data;
        front=front.next;
        if(front==rear){
            rear=null;
        }
        length--;
        return result;
    }

    public void print(){
        if(isEmpty()){
            System.out.println("QUEUE is EMPTY");
        }else{
            for(ListNode i= front; i!=rear;front=front.next){
                System.out.println(i.data+" ");
            }
        }
    }



    public static void main(String [] args){
        Queue queue=new Queue();
        queue.enqueue(101);
        queue.enqueue(102);
        queue.enqueue(103);

        queue.print();

        queue.dequeue();
        queue.dequeue();

    }


}
