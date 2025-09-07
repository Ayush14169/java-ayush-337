import java.util.Scanner;

public class IsSortedArray {
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
        boolean isInc = isIncreasing(arr);
        boolean isDec = isDecreasing(arr);
        if(isInc || isDec){
            System.out.println("The array is sorted.");
        }
            else{
                System.out.println("The array is not sorted.");
            }
        System.out.println("The array is sorted in increasing order:" + isInc);
        System.out.println("The array is sorted in decreasing order:" + isDec);
    }
    public static boolean isIncreasing(int arr[]){
        for(int i = 1; i<arr.length; i++){
            if(arr[i] < arr[i-1]){
                return false;
            }
        }
        return true; //array is increasing

    }
    public static boolean isDecreasing(int arr[]){
        
for(int i = 1; i<arr.length; i++){
            if(arr[i] > arr[i-1]){
                return false;
            }
        }
        return true; //array is decreasing
    }
    
}
