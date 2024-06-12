package Array;

import java.util.Scanner;

public class NumberOfOccur {
    public static void main(String[] args) {
        System.out.println("Enter length of the array :");
        Scanner input = new Scanner(System.in);
        int size = input.nextInt();
        int[] myarr = new int[size];
        int j = 0;
        while ( j < size ){
            System.out.println("Enter the array element" + ( j + 1) + (":"));
            myarr[j] = input.nextInt();
            j++;
        }
        System.out.println("Enter the element to find occurence : "); 
        int number = input.nextInt();   
        int i = 0;
        int count = 0;
        while ( i < myarr.length){
            if ( myarr[i] == number ){
                count = count + 1;
            }
            i = i + 1;
        }
        System.out.println("Occurence of " + number + " = " + count);
    }



}
