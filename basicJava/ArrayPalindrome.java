import java.util.Scanner;

public class ArrayPalindrome {
   public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = input.nextInt();
        
        int arr[] = new int[n];
        System.out.println("Enter the elements:");
        for (int i=0; i<n; i++){
            arr[i] = input.nextInt();
        }
        boolean isPalin = isPalindrome(arr);
        if(isPalin){
            System.out.println("The array is palindrome.");
        }
        else{
            System.out.println("The array is not palindrome.");
        }
        input.close();
   }
        public static boolean isPalindrome(int arr[]){
            int i = 0;
            while(i < arr.length/2){
                if(arr[i] != arr[(arr.length - 1) - i]){
                    return false;
                }
                i++;
            }
            return true;
 }
}
