import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = input.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        input.close();
        long sum = sumArray(arr);
        double avg = average(arr);
        System.out.println("The sum of the elemnts is:" + sum);
        System.out.println("The average of the elements is:" + avg);

    }
    public static long sumArray(int arr[]){
        long sum = 0;
        for (int i=0; i<arr.length; i++){
            sum = sum + arr[i];
        }
        return sum;

    }
    public static double average(int arr[]){
        
        double sum = sumArray(arr);
        return (sum/arr.length);
    }
    
}