import java.util.Scanner;

public class Relational {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your age! ");
        int age = input.nextInt();
        if ( age >= 18) {
            System.out.println("You're voter!");
        } else {
            System.out.println("You're not a voter!");
        }
    }
}
