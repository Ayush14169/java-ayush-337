import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number upto which you want to print the fibonacci series:");
        int n = input.nextInt();
        System.out.print("The fibonacci series is:");
        printFibonacci(n);
        input.close();
    }
    public static void printFibonacci(int n){

        int a = 0, b = 1;
        if(n<0) return;
        System.out.print(" 0");
        if(n == 0) return;
        System.out.print(" 1 ");

        while(a + b <= n){
            int c=a+b;
            System.out.print( c + " ");
            a = b;
            b = c;

        }
    }
    
}
