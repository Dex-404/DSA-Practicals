package Week4;

// Q2 : Print common values for following arrays

class ex2 {
    public static void main(String arg[]){
        int mark1[] = {74,10,2,80,34,59,20};
        int mark2[] = {100,25,59,60,10,4,2,900};

        for(int i=0; i < mark1.length; i++){

            for(int j=0; j < mark2.length; j++){
                if(mark1[i] == mark2[j]){
                    System.out.println(mark1[i]);
                }
            }

        }

    }
}
