
import java.util.Scanner;

public class InputProblemSolve {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        /*
        System.out.println("Enter your name: ");
        String Name = input.nextLine();
        System.out.println("Welcome "+ Name + " to KG Coding");
        */
        System.out.println("Enter the first number: ");
        int num1 = input.nextInt();
        System.out.println("Enter the second number: ");
        int num2 = input.nextInt();
        int num3 = num1 + num2;
        System.out.println("Sum = " + num3);
    }
} 


