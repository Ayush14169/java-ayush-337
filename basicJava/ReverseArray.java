import java.util.Scanner;

public class ReverseArray {
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = input.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        reverseArray(arr);
        System.out.println("The reversed array is:");
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        input.close();
    }
    public static void reverseArray(int arr[]){
        int i = 0;
        while(i < arr.length/2){
            int swap = arr[i];
            arr[i] = arr[(arr.length - 1) - i];
            arr[(arr.length - 1) - i] = swap;
            i++;
        }

    }
    
}
