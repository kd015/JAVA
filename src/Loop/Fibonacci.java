package Loop;

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        System.out.println("Enter the number :");
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
        int x = 0;
        int y = 1;
        int z = 0;
        System.out.println("Fibonacci Series : " + x);
        while ( num > 0){
            x = y;
            y = z;
            z = x + y;
            System.out.println(z);
            num--;
        }
    }
}
