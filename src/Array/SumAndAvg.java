package Array;

import java.util.Scanner;

public class SumAndAvg {
    public static void main(String[] args) {
        System.out.println("Enter length of the array :");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] myarr = new int[size];
        int j = 0;
        while ( j < size ){
            System.out.println("Enter the array element :" + ( j + 1) + (":"));
            myarr[j] = input.nextInt();
            j++;
        }
        
        int i = 0;
        int sum = 0;
        double avg = 0;
        while ( i < myarr.length){
            sum = sum + myarr[i];
            i++;
        }
        System.out.println("Sum of array element = " + sum);
        avg = sum / (myarr.length);
        System.out.println("Average of array element = " + avg);

    
}
}    

    // public static int MyArray( int[] myarr, int len){
    //     System.out.println("Enter length of an Array :");
    //     Scanner input = new Scanner(System.in);
    //     len = input.nextInt();
    //     myarr = new int[len];
    //     return MyArray(myarr, len);
    // }

    
