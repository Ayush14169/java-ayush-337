import java.util.Scanner;

public class gcd {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = input.nextInt();
        System.out.print("Enter the second number:");
        int b = input.nextInt();
        int gcd = calculategcd(a ,b);
        System.out.println("The gcd of two numbers is:" + gcd);
        input.close();
        
        }
        public static int calculategcd(int a , int b){
            int gcd = 1;
            int i = 2;
            int least = least(a , b);
            while(i <= least){
                if(a%i == 0 && b%i == 0){
                    gcd = i;
                }
                i++;
            }
            return gcd;
        }
        public static int least(int num1, int num2){
            if(num1<num2){
                return num1;
            }
            else{
                return num2;
            }
        }


    }