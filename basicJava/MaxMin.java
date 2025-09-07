import java.util.Scanner;

public class MaxMin {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = input.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        if(n == 0){
            System.out.println("No elemtents to compare.");
        }
        int Max = max(arr);
        System.out.println("The maximum element is:" + Max);
        int Min = min(arr);
        System.out.print("The minimum element is:" + Min);
        input.close();
    }
    public static int max(int arr[]){
        int max =  arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i] > max){
                max = arr[i];
            }
        }
        return max;
    }
    public static int min(int arr[]){
        int min =  arr[0];
        for(int i = 1; i<arr.length; i++){
            if(arr[i]<min){
                min = arr[i];
            }
        }
        return min;
    }
    
}
