
//Q1 | HW : Calculate the sum of the 2 numbers inside a function and return the result and Display


import java.util.Scanner;

class ex1 {

    public int sum(){
        Scanner scn = new Scanner(System.in);
        System.out.print("Enter the 1st number: ");
        int num1 = scn.nextInt();
        System.out.print("Enter the 2nd number: ");
        int num2 = scn.nextInt();
        int sum = num1 + num2;
        return sum;
    }

    public static void main(String arg[]){
        ex1 obj = new ex1();
        int sum = obj.sum();
        System.out.println("Sum of the two numbers is : " + sum);
    }

    
}
