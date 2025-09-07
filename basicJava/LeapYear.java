import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a year: ");
        int year = input.nextInt();
        boolean isLeap = isLeapYear(year);
        input.close();
        if(isLeap){
            System.out.println(year + " is a leap year.");
        }
        else{
            System.out.println(year + " is not a leap year.");
        }
    }
    public static boolean isLeapYear(int year){
        if((year%4 == 0 && year%100 != 0) || (year%400 == 0)){
            return true;
        }
        else{
            return false;
        }
    }

}
