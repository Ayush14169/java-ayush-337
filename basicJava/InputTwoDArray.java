import java.util.Scanner;

public class InputTwoDArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns:");
        int cols = input.nextInt();

        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        System.out.println("The 2D array is:");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                System.out.print(" " + arr[i][j]);
            }
            System.out.println();
        }
    }
    
}
