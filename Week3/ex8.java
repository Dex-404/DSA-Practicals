package Week3; // Ignore this line

// Q8 : Find the values between 30 and 70 in an array

class ex8 {
   public static void main(String arg[]){      
        int cnt = 0;       
        int mark[] = {5,10,32,70,54,27};
        for(int i=0; i<mark.length; i++){
            if(mark[i] > 30 && mark[i] < 70){
                cnt++;
            }
        }   
        System.out.println("Number of values between 30 and 70 : " + cnt );
   } 
}
