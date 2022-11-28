class stack{
    private int SP;
    public void init(){
        SP = -1;
    }

    public void push(int T[], int val){
        SP++;
        if(SP>T.length-1){
            System.out.println("Stack Overflow");
        }else{
            T[SP] = val;
        }
    }

    public int pop(int T[]){
        if(SP == -1){
            System.out.println("Stack is Empty");
            return -1;
        }else{
            int item = T[SP];
            SP--;
            return item;
        }
    }

    public void Display(int T[]){
        for(int i=0; i<=SP; i++){
            System.out.print(T[i]+" ");

        }
        System.out.println("\nStack Pointer : "+SP);
    }

    public static void main(String args[]){
        int ST[] = new int[5];

        stack obj = new stack();
        obj.init();
        obj.push(ST, 100);
        obj.push(ST, 25);
        obj.push(ST, 12);
        obj.push(ST, 96);
        obj.push(ST, 158);

        obj.Display(ST);

        System.out.println("---------------------------------------");

        int x = obj.pop(ST);

        System.out.println(x + " - Item Popped");

        obj.Display(ST);

    }
}