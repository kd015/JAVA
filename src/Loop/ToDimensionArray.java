package Loop;

public class ToDimensionArray {
    public static void main(String[] args) {
        //int[][] myTwoDimArray = new int[3][2];
        int[][] myvalue = {{1,2,3}, {4, 5}, {6, 7, 8}};
        //System.out.println(myvalue[1][0]);

        //Traversal:

        int i = 0;
        while ( i < myvalue.length){
            int j = 0;
            while ( j < myvalue[i].length ){
                System.out.print(myvalue[i][j] + " ");
                j++;
            }
            System.out.println();
            i++;
        }

    }
}
