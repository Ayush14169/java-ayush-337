import java.util.*;

public class sumofdigits {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = input.nextInt();
        sum(n);
        input.close();
    }
    public static void sum(int n){
        int sum = 0;
        while(n > 0){
            int digit = n % 10;    //slicing
            sum = sum + digit;
            n = n / 10;
        }
         System.out.println("The sum of digits is " + sum);

    }
    
}
