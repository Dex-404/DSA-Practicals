package Week3.HW;

// Q | HW : Find the maximum element in an array

class ex1 {
    public static void main(String arg[]){
        int mark[] = {5,10,32,70,54,27};
        int max = mark[0];
        for(int i=0; i<mark.length; i++){
            if(mark[i] > max){
                max = mark[i];
            }
        }
        System.out.println("Maximum element in the array : " + max );
    }
}
