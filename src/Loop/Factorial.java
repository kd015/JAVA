package Loop;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int fact = 1;
        while ( num > 0 ){
            fact = fact * num;
            num--;
        }
        System.out.println("Factorial = " + fact);
    }
}
