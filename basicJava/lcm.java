import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = input.nextInt();
        System.out.print("Enter the second number:");
        int b = input .nextInt();
        int lcm = calculateLcm(a,b);
        System.out.println("The lcm of two numbers is: " + lcm);
        input.close();
    }
    public static int calculateLcm(int a, int b){
        int i = 1;
        while(true){
            int factor = a * i;
            if(factor % b == 0){
                return factor;
                
            }
            i++;
        }

    }

    
}
