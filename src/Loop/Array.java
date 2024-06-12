package Loop;

public class Array {
    public static void main(String[] args) {
        // int[] myArray = new int[5];
        // myArray[0] = 45;
        // myArray[2] = 59;
        // myArray[1] = 63;
        // myArray[3] = 3;
        // myArray[4] = 78;
       
        int[] myValue = {45,59,63,96,8};

        //System.out.println(myArray[0]);
        //System.out.println(myValue[4]);


        //Array Traversal!!
        int index = 0;
        //myarry.length = lenth batata hai!!
        while ( index < 5){  
            System.out.println(myValue[index]);
            index++;
        }
    }  
}
