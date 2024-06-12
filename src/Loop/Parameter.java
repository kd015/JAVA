package Loop;

public class Parameter {
    public static void main(String[] args) {
        int result = SumToNumber(12, 20);
        System.out.println(result);
        System.out.println(SumToNumber(2,3));
    }

    public static int SumToNumber(int num1, int num2){
        int sum = num1 + num2;
        return sum;
    }

}
