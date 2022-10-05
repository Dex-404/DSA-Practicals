package Week2;// Ignore this just VS code stuff
import java.util.Scanner;

class ex2 {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of terms: ");
        int num = sc.nextInt();
        int a =2;
        System.out.println("-------------------");

        for(int y=0; y<=num; y++){
            if(y != num){
                System.out.println(a);
                a = a*2;
            }
        }
        sc.close();
    }
}
