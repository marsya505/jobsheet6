import java.util.Scanner;
/**
 * AssignmentQ1
 */
public class AssignmentQ1 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = input11.nextInt();
        System.out.print("Enter num2: ");
        int num2 = input11.nextInt();
        System.out.print("Enter num3: ");
        int num3 = input11.nextInt();
        int maxnumber;
        if (num1 > num2) 
            if (num1 > num3)
                maxnumber = num1;
            else
                maxnumber = num3; 
        else
            if (num2 > num3) 
                maxnumber = num2; 
            else
                maxnumber = num3; 
        System.out.println("The maximum number is: " + maxnumber);
    }
}