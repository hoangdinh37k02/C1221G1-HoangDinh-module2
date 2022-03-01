package ss11_dsa_stack_queue.practice.queue;

public class MyLinkedListQueue {
    private Nope head;
    private Nope tail;

    public MyLinkedListQueue(){
        this.head=null;
        this.tail=null;
    }

    public void enqueue(int key){
        Nope temp= new Nope(key);
        if (this.tail==null){
            this.head=this.tail=temp;
            return;
        }
        this.tail.next=temp;
        this.tail=temp;
    }

    public Nope dequeue(){
        if (this.head==null){
            return null;
        }
        Nope temp = this.head;
        this.head=this.head.next;
        if (this.head==null){
            this.tail=null;
        }
        return temp;
    }
}
