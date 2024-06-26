package Extra1;

import java.util.Scanner;

public class Switch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the day : ");
        int day = input.nextInt();

        //old switch method

        // switch (day) {
        //     case 1: System.out.println("Monday");
        //         break;
        //     case 2: System.out.println("Tuesday");
        //         break;
        //     case 3: System.out.println("Wednesday");
        //         break;
        //     case 4: System.out.println("Thursday");
        //         break;
        //     case 5: System.out.println("Friday");
        //         break;
        //     case 6: System.out.println("Saturday");
        //         break;
        //     case 7: System.out.println("Sunday");
        //         break;
        //     default: System.out.println("Invalid");
        //         break;
        //}

        //new switch method:
        String dayStr = switch(day){
            case 1 -> "Mon";
            case 2 -> "Tues";
            case 3 -> "Wednes";
            case 4 -> "Thurs";
            case 5 -> "Fri";
            case 6 -> "Satur";
            case 7 -> "Sun";
            default -> "Invalid";
        
        };
        System.out.println(dayStr);
    }
    
}
