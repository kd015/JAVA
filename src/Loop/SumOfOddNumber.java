package Loop;

import java.util.Scanner;

public class SumOfOddNumber {
    public static void main(String[] args) {
        System.out.println("Enter the value of n :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int i = 1;
        int sum = 0;
        while ( i <= num ){
            if ( i % 2 != 0 ){
                System.out.println(i);
                sum = sum + i;
            }
            i++;
        }
        System.out.println("Sum of odd number = " + sum);
    }
}
