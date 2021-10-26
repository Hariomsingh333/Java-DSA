import java.util.Scanner;


public class Array2d{
    public static void main(String[] args) {
        // 2D Array
        // 2d Array is very helpful for complex problem so this is important

        // 2d Array is like matrix so we have row and column

        // now first look to 1d array
        // int arr [] = new int[5];
        // arr[0]=4;
        // arr[1]= 5;
        // arr[2]=55;
        // arr[3] = 67;
        // arr[4] = 89;
        
        // print the 1d array
        // for (int i = 0; i < arr.length; i++) {
        //    System.out.println(arr[i]); 
        // }

        // rows = 3 || columns = 5 (3x5)

            Scanner in = new Scanner(System.in);
            int rows = in.nextInt();
            int columns = in.nextInt();


            // define 2D array
            int number [][] = new int[rows][columns];

            //input 
            //rows
            for (int i = 0; i < rows; i++) {
                //columns
                for (int j = 0; j < columns; j++) {
                   number[i][j] = in.nextInt(); 
                }
            }
            //output
            for (int i = 0; i < rows; i++) {
               for (int j = 0; j < columns; j++) {
                  System.out.print(number[i][j] + " "); 
               } 
               System.out.println();
            }
    }

}