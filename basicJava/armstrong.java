import java.util.Scanner;

public class armstrong {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number you want to check for armstrong:");
        int n = input.nextInt();
        isArmstrong(n);
        if(isArmstrong(n)){
            System.out.println("The number is armstrong number.");
        }
        else{
            System.out.println("The number is not an armstrong number.");
        }
        input.close();
    }
    public static boolean isArmstrong(int n){
        int digits = noOfdigits(n);
        int sum = 0;
        int original = n;
        while(n>0){
            int digit = n%10;
            sum = sum + (int)Math.pow(digit, digits);
            n = n/10;

        }
        if(sum == original){
            return true;
        }
        else{
            return false;
        }

    }
    public static int noOfdigits(int n){
        int digits = 0;
        while(n>0){
            digits++;
            n = n/10;
        }
        return digits;
    }
}
