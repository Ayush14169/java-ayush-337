import java.util.Scanner;

public class MergeTwoSortedArray {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        //input array 1
        System.out.println("Enter the number of elements for 1st array:");
        int n = input.nextInt();
        
        int arr1[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0; i<n; i++){
            arr1[i] = input.nextInt();
        }
        //input array 2
        System.out.println("Enter the number of elements for 2nd array:");
        int m = input.nextInt();
        
        int arr2[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0; i<m; i++){
            arr2[i] = input.nextInt();
        }
        int mergedArray[] = merge(arr1, arr2);
        System.out.println("The merged array is:");
        for(int i = 0; i<mergedArray.length; i++) {
            System.out.print(mergedArray[i] + " ");
        }
        System.out.println();
        input.close();
    }
    public static int[] merge(int arr1[], int arr2[]){
        int newSize = arr1.length + arr2.length;
        int newArray[] = new int[newSize];
        int i = 0, j = 0, k = 0;
        while(i < arr1.length || j < arr2.length){
            if(j == arr2.length || (i < arr1.length && arr1[i] < arr2[j])){
                newArray[k] = arr1[i];
                i++;
                k++;
            }
            else{
                newArray[k] = arr2[j];
                k++;
                j++;
            }
        }
        return newArray;

    }
}
