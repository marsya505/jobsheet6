import java.util.Scanner;
/**
 * Selection2Exp111
 */
public class Selection2Exp111 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Input year = "  );
        int year = input11.nextInt();
        if (year%4 == 0) 
            if(year%100 != 0)
                System.out.println("Leap year");
        else
            System.out.println("Not a leap year");        
}
}
