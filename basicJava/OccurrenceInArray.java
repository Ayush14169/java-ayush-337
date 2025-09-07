import java.util.Scanner;

public class OccurrenceInArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = input.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the number to find:");
        int num = input.nextInt();
        int occurrences = noOfOccurrences(arr, num);
        System.out.println("The element occurred " + occurrences +" times.");
        input.close();
    }
    public static int noOfOccurrences(int arr[], int num){
        int count = 0;
        for(int i = 0; i<arr.length;i++){
            if(arr[i] == num){
                count++;
            }
        }
        return count;
    }
    
}
