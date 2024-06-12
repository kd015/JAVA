package Loop;

import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        System.out.println("Enter the number : ");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int count = 0;
        int i = 1;
        while ( i <= num ){
            if ( num % i == 0 ){
                count = count + 1;
                //System.out.println(i);
            }
            i++;
        }
        if ( count == 2 ){
            System.out.println("Prime Number!!");
        } else{
            System.out.println("Not a prime");
        }
    }
}
