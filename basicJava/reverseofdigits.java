import java.util.Scanner;
public class reverseofdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to reverse the digits of:");
        int n = input.nextInt();
        reverse(n);
        input.close();
    }
    public static void reverse(int n){
        int reverse = 0;
        while(n > 0){
            int digit = n % 10;    //slicing
            reverse = reverse * 10 + digit;
            n = n / 10;
        }
         System.out.println("The reversed digits is " + reverse);

    }
    
    
    
}
