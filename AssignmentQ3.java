import java.util.Scanner;
/**
 * AssignmentQ3
 */
public class AssignmentQ3 {
    public static void main(String[] args) {
        Scanner input11 = new Scanner(System.in);
        System.out.print("Brand of Shoe: ");
        String brand = input11.next().toLowerCase();
        System.out.print("Category of Shoe: ");
        String category = input11.next().toLowerCase();
        System.out.print("Size of Shoe: ");
        int size = input11.nextInt();
        int price = 0;

        if (brand.equals("converse")) 
            if (category.equals("slipon")) 
                if (size <= 40) price = 800000;
            if (category.equals("hightop")) 
                if (size >= 40) price = 1200000;
        if (brand.equals("skecher")) 
            if (category.equals("woman")) 
                if (size <= 41) price = 1000000;
            if (category.equals("man")) 
                if (size >= 41) price = 1800000;
        if (brand.equals("nike")) 
            if (category.equals("kids")) 
                if (size <= 40) price = 750000;
            if (category.equals("adult"))
                if (size >= 40) price = 1500000;
        if (price > 0)
            System.out.println("The price of the shoe is: " + price);
        else
            System.out.println("No matching shoe found for the given inputs.");
    }
}