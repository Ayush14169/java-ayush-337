import java.util.Scanner;

public class Search2DArray {
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
        System.out.print("Enter the element you want to search:");
        int num = input.nextInt();
        input.close();
        boolean found = search(arr,num);
        if(found){
            System.out.println("Element found in the array.");
        }
        else {
            System.out.println("Element not found in the array.");
        }
    }


    public static boolean search(int[][] arr, int num) {
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                if (arr[i][j] == num){
                    System.out.println("Element found at position: (" + i + ", " + j + ")");
                    return true;
                }

            }
        }
         return false;   
    }
}
