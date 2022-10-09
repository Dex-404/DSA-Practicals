package Week3; // Ignore this line


// Q4 : Print all the elements of an array

class ex4 {
    public static void main(String arg[]){
        
        int mark[] = {5,10,32,70,54,27};

        // Method 1 : Using for loop
        for(int i=0; i<mark.length; i++){
            System.out.println(mark[i]);
        }

        // Method 2 : Using while loop
        int i = 0;
        while(i<mark.length){
            System.out.println(mark[i]);
            i++;
        }

    }
}
