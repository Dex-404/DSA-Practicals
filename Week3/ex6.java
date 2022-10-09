package Week3; // Ignore this line

// Q6: Print values above 40 in an array

class ex6 {
    public static void main(String arg[]){
            
            int mark[] = {5,10,32,70,54,27};
            for(int i=0; i<mark.length; i++){
                if(mark[i] > 40){
                    System.out.println(mark[i]);
                }
            }
    
    }
}
