import java.text.DecimalFormat;
import java.util.Scanner;
public class ShoppingSpree {
    public static Scanner scnr = new Scanner(System.in);

    public static void main (String [] args)
    {
        Shopper aShopper = createAShopper();
        Item item1 = buyAnItem();
        Item item2 = buyAnItem();
        Item item3 = buyAnItem();

        printReceipt(aShopper, item1, item2, item3);
    }
    public static void printReceipt(Shopper aShopper, Item anItem1, Item anItem2, Item anItem3)
    {
       DecimalFormat df = new DecimalFormat("##,###.00");
        double grandTotal = 0;   grandTotal = anItem1.getExtendedPrice() +
                                              anItem2.getExtendedPrice() +
                                              anItem3.getExtendedPrice();
        System.out.println("Thank you for shopping at Target today.");
        System.out.println(aShopper);
        System.out.println("\nToday, you purchased the following items: ");
        System.out.println(anItem1);
        System.out.println(anItem2);
        System.out.println(anItem3);
        System.out.println("***************************************************\n");
        System.out.println("\n Your grand total is: $" + df.format(grandTotal));

    }

    public static Item buyAnItem()
    {
        String name;
        double price;
        int quantity;

        System.out.println("What is the name of the item you wish to buy?");
        name = scnr.nextLine();
        System.out.println("How much does the " + name + " cost?");
        price = scnr.nextDouble();
        System.out.println("How many " + name + " do you wish to buy? ");
        quantity = scnr.nextInt();
        Item anItem = new Item(name, price, quantity);
        return anItem;
    }
    public static Shopper createAShopper()
    {
        String name, creditCardName, creditCardNum;
        System.out.println("What is your name?");
        name = scnr.nextLine();
        System.out.println("What credit card are you using?");
        creditCardName = scnr.nextLine();
        System.out.println("What is your credit card number?");
        creditCardNum = scnr.nextLine();

        Shopper aShopper = new Shopper(name, creditCardName, creditCardNum);
        return aShopper;
    }

}
