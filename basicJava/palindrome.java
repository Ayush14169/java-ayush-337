import java.util.Scanner;

public class palindrome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check for palindrome:");
        int n = input.nextInt();
        isPalindrome(n);
        if(isPalindrome(n)){
            System.out.println("The number ins palindrome.");
        }
        else{
            System.out.println("The number is not palindrome.");
        }
        input.close();
    }
    public static boolean isPalindrome(int n){
        int original = n;
        int reverse = 0;
        while(n > 0){
            int digit = n % 10;
            reverse = reverse * 10 + digit;
            n = n/10;
        }
        return reverse == original;

    }
}
