package Week3; // Ignore this line

// Q7 : Print the odd numbers in an array

class ex7 {
    public static void main(String arg[]){                
        int mark[] = {5,10,32,70,54,27};
        for(int i=0; i<mark.length; i++){
            if(mark[i] % 2 != 0){
                System.out.println(mark[i]);
            }
        }      
    }
}
