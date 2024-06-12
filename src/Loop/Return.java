package Loop;

import java.util.Scanner;

public class Return {
    public static void main(String[] args) {
       greet();
       int num1 = readNumber();
       int num2 = readNumber();

       int sum = num1 + num2;

       System.out.println("Sum = " + sum);
}

public static void greet(){
    System.out.println("Welcome to my calc!!");
}

public static int readNumber(){
    Scanner input = new Scanner(System.in);
    System.out.println("Please enter the number : ");
    int number = input.nextInt();
    return number;
}
}