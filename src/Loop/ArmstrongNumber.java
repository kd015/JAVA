package Loop;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int temp = num;
        int sum = 0;
        while ( temp > 0 ){
            int digit = temp % 10;
            sum = sum + ( digit * digit * digit);
            temp = Math.floorDiv(temp, 10);
            
        }
        if ( sum == num){
            System.out.println("Armstrong number!!");
        } else{
            System.out.println("Not a armstrong number!!");
        }
    }
}
