public class LearningIf {
    public static void main(String[] args) {
        /*
        boolean isMale = false;
        String name = "Krishna";

        System.out.println("Before if ");
        if (isMale) {
            System.out.println("Mr."+ name);

        } else {
            System.out.println("Ms. " + name);
        }
        System.out.println("After if ");
        */

        boolean isSeniorCitizen = false;
        boolean isAnAdult = false;
        /*
        if ( isSeniorCitizen) {
            System.out.println("Hello Senior Citizen!!");
        } else {
            if ( isAnAdult ){
                System.out.println("Hello An Adult!!");
            } else{
                System.out.println("Hello child!!");
            }
        }
        */
        if ( isSeniorCitizen) {
            System.out.println("Hello Senior Citizen!!");
        } else if ( isAnAdult ){
            System.out.println("Hello An Adult!!");
        } else{
            System.out.println("Hello child!!");
            }
        
    }
}
