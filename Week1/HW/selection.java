import java.util.Scanner;

class Selection{
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        String gender;
        String color = "error";
        int age;
        System.out.println("Are you a girl or a boy?");
        gender = scn.nextLine();

        System.out.println("Enter your Age: ");
        age = scn.nextInt();

        if((gender).equals("boy")){

            if(age>15){
                color = "Blue";
            }else{
                color = "Orange";
            }
        }else{
            if(age>15){
                color = "Yellow";
            }else{
                color = "Red";
            }
        }

//sc.charAt(0)
        System.out.println("Your color is: " + color);
        scn.close();
    }
}