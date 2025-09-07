import java.util.Scanner;

public class looppatterns{

     public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of rows for pattern:");
        int rows = input.nextInt();
        System.out.println("The pattern is:");
        decRightHalfPyramid(rows);
        input.close();
        
    }
    public static void decRightHalfPyramid(int rows){

        while(rows > 0){
            int i = 1;
            while(i <= rows){
                System.out.print("* ");
                i++;
            }
            System.out.println();
            rows--;
        }

    }
}
