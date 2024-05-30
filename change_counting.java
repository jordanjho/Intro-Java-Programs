import java.util.Scanner;
public class change_counting {
    public static void main(String[] args) {
        count_change();
    }

    public static void count_change() {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("What was the purchase price? (currency form, exclude dollar sign)");
        double price = keyboard.nextDouble();

        System.out.println("How much money did you pay? (currency form, exclude dollar sign)");
        double pay = keyboard.nextDouble();
      
        System.out.printf("The purchase price was " + "$%.2f\n", price);
        System.out.printf("You paid " + "$%.2f\n", pay);

        double change = (pay - price);

        System.out.print("You received ");
        System.out.printf("$%.2f", change);
        System.out.println(" in change.");

        System.out.println((int)change / 100  + " one hundred dollar bills(s)");
        double hundreds = (change % 100);

        System.out.println((int)hundreds / 50 + " fifty dollar bill(s)");
        double fifties = (hundreds % 50);

        System.out.println((int)fifties / 20 + " twenty dollar bill(s)");
        double twenties = (fifties % 20);        

        System.out.println((int)twenties / 10 + " ten dollar bill(s)");
        double tens = (twenties % 10);

        System.out.println((int)tens / 5 + " five dollar bill(s)");
        double fives = (tens % 5);

        System.out.println((int)fives / 1 + " one dollar bill(s)");
        double ones = (fives % 1);

        System.out.println((int)(ones * 4) + " quarter(s)");
        double quarters = (ones % 0.25);

        System.out.println((int)(quarters * 10) + " dime(s)");
        double dimes = (quarters % 0.10);

        System.out.println((int)(dimes * 20) + " nickel(s)");
        double nickels = (dimes % 0.05);

        System.out.println((int)(nickels * 100)  + " penny/pennies");
        //double pennies = (nickels % 0.01);
        
        keyboard.close();
    }
/*
Asks the user for a price and their payment
Gives the user back change efficiently from greatest to least value (dollars -> quarters, etc.)
Change is given using the least amount of bills or coins
*/
}
