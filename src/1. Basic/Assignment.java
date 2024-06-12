import java.util.Scanner;

public class Assignment {
    public static void main(String[] args) {
        /*
        int myInt = 9;
        int newInt = myInt;
        System.out.println(myInt);
        System.out.println(newInt);
        */

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first no: ");
        int num1 = input.nextInt();
        System.out.println("Please enter the second no: ");
        int num2 = input.nextInt();
        int num3 = num1;
        num1 = num2;
        num2 = num3;
        System.out.println("Swap numbers are: ");
        System.out.println("First no: "+ num1);
        System.out.println("Second no: "+ num2);
    }
}
