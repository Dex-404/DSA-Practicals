import java.util.Scanner;
class Template{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double r, ar, pi;
        pi = 3.14;
        System.out.println("Enter the Radius of the Circle: ");
        r = scn.nextDouble();
        ar = pi * (r * r);
        System.out.println("The area is: " + ar);
        scn.close();
    }
}