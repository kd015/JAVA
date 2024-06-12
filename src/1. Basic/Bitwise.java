import java.util.Scanner;

public class Bitwise {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // System.out.println("Enter the first number");
        // int num1 = input.nextInt();
        // System.out.println("Enter the second number");
        // int num2 = input.nextInt();

        // int res = num1 & num2;
        // System.out.println("Bitwaise Add result = " + res);

        // int res1 = num1 | num2;
        // System.out.println("Bitwaise Or result = " + res1);
        
        // int res3 = num1 ^ num2;
        // System.out.println("Bitwaise XOR result = " + res3);
        
        // For compliment: use '~'

        // System.out.println("Enter the number : ");
        // int num5 = input.nextInt();
        // int res4 = num5 << 1;
        // int res5 = num5 >> 1;
        // System.out.println("Left shift = " + res4);
        // System.out.println("Right shift = " + res5);
        //left and right shift!


        //Even or not using bitwise operator!!

        System.out.println("Enter the number : ");
        int number = input.nextInt();
        if ( ( number & 1 ) == 1){
            System.out.println("Odd Number");
        }
        else{
            System.out.println("Even number");
        }
        


    }
}
