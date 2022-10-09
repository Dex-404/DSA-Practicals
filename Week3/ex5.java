package Week3; // Ignore this line

// Q5 : Find the sum of all the elements of an array

class ex5 {
    public static void main(String arg[]){
            
            int mark[] = {5,10,32,70,54,27};
            int sum = 0;
            for(int i=0; i<mark.length; i++){
                sum = sum + mark[i];
            }
            System.out.println("Sum of all the elements of the array : " + sum );
    
    }
}
