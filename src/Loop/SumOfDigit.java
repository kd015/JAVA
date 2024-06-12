package Loop;

import java.util.Scanner;

public class SumOfDigit {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int sum = 0;
        while ( num > 0 ){
            int digit = num % 10;
            sum = sum + digit;
            num = Math.floorDiv(num,10);
        }
        System.out.println("Sum of digit = " + sum);
    }
}
