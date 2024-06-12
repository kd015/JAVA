import java.util.Scanner;

public class Practice3 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        /* 
        System.out.println("Enter the base of the triangle : ");
        double base = input.nextFloat();
        System.out.println("Enter the height of the triangle : ");
        double height = input.nextFloat();
        double area = 0.5 * ( base * height );
        System.out.println("Area of triangle = " + area);
        */

        System.out.println("Enter the principle : ");
        double principle = input.nextDouble();
        System.out.println("Enter the rate : ");
        double rate = input.nextDouble();
        System.out.println("Enter the time : ");
        double time = input.nextDouble();
        double SI = ( principle * rate * time ) * 0.01;
        double amount = principle * Math.pow(( 1 +  rate * 0.01), time) ;
        System.out.println("Simple interest = " + SI);
        System.out.println("Amount interest = " + ( amount - principle ));


    }
}
