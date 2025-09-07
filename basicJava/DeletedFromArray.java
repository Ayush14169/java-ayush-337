import java.util.Scanner;

public class DeletedFromArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = input.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        System.out.print("Enter the number to delete:");
        int num = input.nextInt();
        int newArr[] = deleteElement(arr, num);
        System.out.println("The new array after deletion is:");
        displayArray(newArr);
        input.close();
    }
    public static void displayArray(int arr[]){
        for(int i = 0; i<arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println(); //for new line after displaying the array
    }
    public static int[] deleteElement(int arr[], int num){
        int occ = OccurrenceInArray.noOfOccurrences(arr, num);
        if(occ == 0){
            System.out.println("Element not found in the array.");
            return arr;
        }
        int newSize = arr.length - occ;
        int newArr[] = new int[newSize];

        int i = 0,j = 0;
        while(i < arr.length){
            if(arr[i] != num){
                newArr[j] = arr[i];
                j++;
            }
            i++;
        }
        return newArr;

    }
}
