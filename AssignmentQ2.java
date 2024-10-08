import java.util.Scanner;
/**
 * AssignmentQ2
 */
public class AssignmentQ2 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Original price of the books: ");
        double originalPrice = input11.nextDouble();
        System.out.print("Book category: ");
        String bookCategory = input11.next().toLowerCase();
        System.out.print("Total books: ");
        int totalBooks = input11.nextInt();
        double discount = 0;

        if (bookCategory.equals("dictionary")) 
            discount = 10; 
            if (totalBooks > 2) 
                discount += 2; 
        else if (bookCategory.equals("novel"))
            discount = 7; 
            if (totalBooks > 3) 
                discount += 2; 
            else if (totalBooks <= 3)
                discount += 1; 
        else if (bookCategory.equals("other") && totalBooks > 3)
            discount = 5; 
        double totalPayment = originalPrice - (originalPrice * discount / 100);
        System.out.println("Total payment: " + totalPayment);
    }
}