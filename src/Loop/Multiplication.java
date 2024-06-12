package Loop;

import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        System.out.println("Enter the table to print :");
        Scanner input = new Scanner(System.in);
        int table = input.nextInt();
        int i = 1;
        while( i <= 10 ){
            int res = table * i ;
            System.out.println(table + " * " + i + " = " + res);
            i++;
        }
    }
}
