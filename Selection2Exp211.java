import java.util.Scanner;
/**
 * Selection2Exp211
 */
public class Selection2Exp211 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Input angle 1 = " );
        int angle1 = input11.nextInt();
        System.out.print("Input angle 2 = "  );
        int angle2 = input11.nextInt();
        System.out.print("Input angle 3 = "  );
        int angle3 = input11.nextInt();
        int totalAngle = angle1+angle2+angle3;
        if(totalAngle == 180)
            if(angle1 == 90 || angle2 == 90 || angle3 == 90)
                System.out.println("Right triangle");
            else
                System.out.println("Not a right triangle");
        else
            System.out.println("Not a triangle");
    }
}
