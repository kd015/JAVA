package Loop;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;
        int rev = 0;
        while ( num > 0 ){
            int digit = num % 10;
            rev = rev * 10 + digit;
            num = Math.floorDiv(num, 10);
        }
        System.out.println("Reverse of number = " + rev);

        if ( rev == temp){
            System.out.println("Palindrome number!!");
        } else {
            System.out.println("Not a Palindrome number!!");
        }
    }
}
