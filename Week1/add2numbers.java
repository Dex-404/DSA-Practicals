import java.util.Scanner;

class Numbers{
    public static void main (String args[]){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter the first Number:");
        int n1 = scn.nextInt();
        System.out.println("Enter the Second Number:");
        int n2 = scn.nextInt();
        int tot = n1+n2;
        System.out.println("The total is: " + tot);
    }
}