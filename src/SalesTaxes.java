import java.util.IllegalFormatCodePointException;
import java.util.IllegalFormatConversionException;

/**
 * @author Marius Claassen
 * 2015-09-10
 */
public class SalesTaxes {

    public static void main(String[] args) throws IllegalFormatConversionException {
        SalesTaxes salesTaxes = new SalesTaxes();
        salesTaxes.runApplication();
    }

    public void runApplication(){
        System.out.println("SALES TAXES");
        System.out.println("\nRunning output 1 ...");
        output1();
        System.out.println("\nRunning output 2 ...");
        output2();
        System.out.println("\nRunning output 3 ...");
        output3();
    }

    private void output1(){
        System.out.println("1 book: " + 12.49);
        System.out.println("1 music CD: " + 14.99);
        System.out.println("1 chocolate bar: " + 0.85);
        System.out.println("Sales Taxes: " + 10 * 14.99 / 100);
        System.out.println("Total: " + (14.99 * 1.1 + 12.49 + 0.85) );
    }

    private void output2(){
        System.out.println("1 imported box of chocolates: " + 10.0);
        System.out.println("1 imported bottle of perfume: " + 47.5);
        System.out.println("Sales Taxes: " + ((5 * 10.5 / 100) + (15 * 47.5 / 100)));
        System.out.println("Total: " + ((10.5 * 1.05) + (47.5 * 1.15)));
    }
    private void output3(){
        System.out.println("1 imported bottle of perfume: " + 27.99);
        System.out.println("1 bottle of perfume: " + 18.99);
        System.out.println("1 packet of headache pills: " + 9.75);
        System.out.println("1 box of imported chocolates: " + 11.25);
        System.out.println("Sales Taxes: " + ((15*27.99/100) + (10*18.99/100) + (5*9.75/100) + (5*11.25/100)));
        System.out.println("Total: " + ((27.99*1.15) + (18.99*1.05) + (9.75 + 11.25)*1.05));
    }
}