import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number whose factorial you want");
        int n = input.nextInt();
        int fact = 1;
        for (int i=1; i<=n; i++){
            fact = fact*i;
        input.close();
        }
        System.out.println("The factorial is" + fact);

        
    }
    
}
