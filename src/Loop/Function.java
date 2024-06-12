package Loop;

public class Function {
    public static void main(String[] args) {
        //greeting();
        Pattern();
        
    }
    // public static void greeting(){
    //     System.out.println("Good Morning!");
    // }

    public static void Pattern(){
        int row = 0;
        while ( row < 5 ){
            System.out.print("*");
            int i = 0;
            while ( i < row ) {
                System.out.print(" *");
                i++;
            }
            System.out.println();
            row++;
        }
        
    }

}

