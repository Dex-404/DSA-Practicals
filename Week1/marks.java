import java.util.Scanner;

class Example{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the Marks for the first Subject");
        float n1 = scn.nextFloat();
        System.out.println("Enter the Marks for the second Subject");
        float n2 = scn.nextFloat();

        float avg = (n1+n2) / 2;

        char result;

        if(avg>75){
            result = 'A';

        } else if(avg>65){
            result = 'B';

        } else if(avg>55){
            result = 'C';

        } else if(avg>45){
            result = 'D';

        } else {
            result = 'F';
        }
        System.out.println("The result is: " + result);
    }
}