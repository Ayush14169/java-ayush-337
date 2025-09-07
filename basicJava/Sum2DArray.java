import java.util.Scanner;

public class Sum2DArray {
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
        
        int totalSum = sum(arr);
        System.out.println("The sum of all elements in the 2D array is: " + totalSum);
        double average = CalculateAvg(arr);
        System.out.println("The average of all the elements in the 2D array is: " + average);
    }
    public static int sum(int[][] arr){
        int sum = 0;
        for (int i=0; i<arr.length; i++){
            for (int j=0; j<arr.length; j++){
                sum = sum +arr[i][j];
            }
        }
        return sum;
    }
    public static double CalculateAvg(int[][]arr){
        if (arr.length == 0){
            return 0;
        }
        int rows = arr.length;
        int cols = arr[0].length;
        double sum = sum(arr);
        double size = rows*cols;
        return (sum / size);
    }    
}
