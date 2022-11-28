public class queues {
    private int head;
    private int tail;
    private int count;
    private int item;

    public void init(int T[]){
        head = 0;
        tail = T.length-1;
        count = 0;
    }

    public void enqueue(int T[],int val){
        if(count == T.length){
            System.out.println("Queue is Full");
        }else{
            tail ++;
            if(tail > T.length -1){
                tail = 0;
            }
            T[tail] = val;
            count++;
        }
    }

public int dequeue(int T[]){
    if(count == 0){
        System.out.println("Queue is Empty");
        return 0;
    }else{
        int item = T[head];
        T[head] = 0;
        head++;
        if(head > T.length -1){
            head = 0;
        }
        count--;
        if(count == 0){
            init(T);
        }
        return item;
    }
    
}

    public void Display(int T[]){
        for(int i=head; i<=tail; i++){
            System.out.print(T[i]+" ");
        }
        System.out.println("\nhead : "+head);
        System.out.println("tail : "+tail);
    }

    public static void main(String args[]){
        int Q[] = new int[5];
        queues obj = new queues();
        obj.init(Q);
        obj.enqueue(Q,100);
        obj.enqueue(Q,25);
        obj.enqueue(Q,12);
        obj.enqueue(Q,96);
        obj.enqueue(Q,158);

        obj.Display(Q);

        System.out.println("---------------------------------------");

        int x = obj.dequeue(Q);

        System.out.println(x + " - Item Dequeued");

        obj.Display(Q);

    }
}
