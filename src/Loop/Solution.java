// package Loop;

// import java.util.Scanner;

// public class ArraySearching {
//     //Declear a array: search the element in the search: present or not!!
//     public static void main(String[] args) {
//         int[] myValue = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
//         Scanner input = new Scanner(System.in);
//         System.out.println("Enter element to search : ");
//         int num = input.nextInt();
//         int i = 0;
//         while ( i <= myValue.length ) {
//             if ( myValue[i] == num ) {
//                 System.out.println(num + " is Present!!"); 
//                 break;
//             }  
//             i++;
//         }
        
//         System.out.println(num + " is not present in the Array!!");
                

//         }
    
// }

    

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();

        System.out.println(A.length + B.length);
        if (  A.length >  B.length ){
            System.out.println("YES");
        } else{
            System.out.println("No");
        }
        
    }
}
