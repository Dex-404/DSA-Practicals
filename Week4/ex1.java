package Week4;

// Q1 : swap two elements in an array

class ex1 {
    public static void main(String arg[]){
        int mark[] = {5,10,32,70,54,27};

        for(int i=0; i<mark.length; i++){
            System.out.println(mark[i]);
        }

        System.out.println("----------------");
        int temp = mark[0];
        mark[0] = mark[5];
        mark[5] = temp;
        for(int i=0; i<mark.length; i++){
            System.out.println(mark[i]);
        }
    }
}
