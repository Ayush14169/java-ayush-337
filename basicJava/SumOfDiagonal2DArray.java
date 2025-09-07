import java.util.Scanner;

public class SumOfDiagonal2DArray {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows:");
        int rows = input.nextInt();
        System.out.print("Enter the number of columns:");
        int cols = input.nextInt();

        if (rows != cols) {
            System.out.println("The number of rows and columns must be equal for a diagonal sum.");
        }
        int[][] arr = new int[rows][cols];
        System.out.println("Enter the elements of the 2D array:");
        for (int i=0; i<rows; i++){
            for (int j=0; j<cols; j++){
                arr[i][j] = input.nextInt();
            }
        }
        input.close();
        long sum = sumDiagonal(arr);
        System.out.println("The sum of the diagonal elemets is: " + sum);
    }
    public static long sumDiagonal(int arr[][]){
        long leftSum = sumLeftDiagonal(arr);
        long rightSum = sumRightDiagonal(arr);
        long sum = leftSum + rightSum;
        if(arr.length % 2 != 0) {
            int midIndex = arr.length / 2;
            sum -= arr[midIndex][midIndex];  //subtract the middle element if the array size is odd
        }
        return sum;
    }
    public static long sumLeftDiagonal(int arr[][]){
        long sum = 0;
        for (int i=0; i<arr.length; i++){
            sum += arr[i][i];
        }
        return sum;
    }
    public static long sumRightDiagonal(int arr[][]){
        long sum = 0;
        for (int i=0; i<arr.length; i++){
            int col = arr.length - 1 - i;
            sum += arr[i][col];
        }
        return sum;
    }
    
}
