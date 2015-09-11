
/**
 * @author Marius Claassen
 * 2015-09-10
 */
public class SalesTaxes {

    public static void main(String[] args) {
        SalesTaxes salesTaxes = new SalesTaxes();
        salesTaxes.runApplication();
    }

    public void runApplication(){
        System.out.println("SALES TAXES");
        System.out.println("\nRunning shopping basket 1:");
        shoppingBasket1();
        System.out.println("\nRunning shopping basket 2:");
        shoppingBasket2();
        System.out.println("\nRunning shopping basket 3:");
        shoppingBasket3();
    }

    private void shoppingBasket1(){
        System.out.println("1 book: " + 12.49);
        System.out.println("1 music CD: " + 14.99);
        System.out.println("1 chocolate bar: " + 0.85);
        System.out.printf("Sales Taxes: %.2f\n", (10 * 14.99 / 100));
        System.out.printf("Total: %.2f\n", (14.99 * 1.1 + 12.49 + 0.85) );
    }

    private void shoppingBasket2(){
        System.out.println("1 imported box of chocolates: " + 10.0);
        System.out.println("1 imported bottle of perfume: " + 47.5);
        System.out.printf("Sales Taxes: %.2f\n", ((5 * 10.5 / 100) + (15 * 47.5 / 100)));
        System.out.printf("Total: %.2f\n", ((10.0 * 1.05) + (47.5 * 1.15)));
    }
    private void shoppingBasket3(){
        System.out.println("1 imported bottle of perfume: " + 27.99);
        System.out.println("1 bottle of perfume: " + 18.99);
        System.out.println("1 packet of headache pills: " + 9.75);
        System.out.println("1 box of imported chocolates: " + 11.25);
        System.out.printf("Sales Taxes: %.2f\n", ((15 * 27.99 / 100) + ( 10 * 18.99 / 100) + (5 * 11.25 / 100)));
        System.out.printf("Total: %.2f\n", ((27.* 1.15) + (18.99 * 1.1) + 9.75 + (11.25 * 1.05)));
    }
}