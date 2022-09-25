import java.util.Scanner;

class Time{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        double time;
        System.out.println("Enter the time");
        time = scn.nextDouble();
        if (time >= 18){
            System.out.println("It is Night Time!");
        }else{
            System.out.println("It is Day Time!");
        }
    }
}