import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number who you want to check for primality:");
        int n = input.nextInt();
        boolean isprime = isprime(n);
        if(isprime){
            System.out.println("Your number is prime");
        }
        else{
            System.out.println("Your number is not prime");
        }
        input.close();
    }
    public static boolean isprime(int n){
        int i = 2;
        while(i < n){
            if(n%i == 0){
                return false; //not prime
            }
            i++;
        }
        return true; // prime
    }
}
