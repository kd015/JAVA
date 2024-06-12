package Loop;

public class FactorialFunction {
    public static void main(String[] args) {
        System.out.println(Factorial(5));
        
    }
    public static int Factorial(int num){
        int fact = 1;
        while ( num > 0 ){
            fact = fact * num;
            num--;
        }
        return fact;
    }
}
