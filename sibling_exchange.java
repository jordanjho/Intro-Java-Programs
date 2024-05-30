//
public class sibling_exchange
{
   //Provide the implementation inside the empty braces { }
   static public class bank
   {
      private static final double PENNY_VALUE = 0.01;
      private static final double NICKEL_VALUE = 0.05;
      private static final double DIME_VALUE = 0.10;
      private static final double QUARTER_VALUE = 0.25;

      private int pennies;
      private int nickels;
      private int dimes;
      private int quarters;
      private String piggyBankName;
      
      /**
      *   Constructs an empty PiggyBank.
      */
      public bank(int pennies, int nickels, int dimes, int quarters)
      {
         pennies = 0;
         nickels = 0;
         dimes = 0;
         quarters = 0;

      }
   
      /**
      *   Constructs a PiggyBank with given coins and given name (example "piggybank1"
      */
      public bank(int penniesInIt, int nickelsInIt, int dimesInIt, int quartersInIt, String piggyBankNameInIt) {
         pennies = penniesInIt;
         nickels = nickelsInIt;
         dimes = dimesInIt;
         quarters = quartersInIt;
         piggyBankName = piggyBankNameInIt;
      }

      //access methods:
      public int getPennies() {
         return pennies;
      }
      
      public int getNickels() {
         return nickels;
      }
      
      public int getDimes() {
         return dimes;
      }
      
      public int getQuarters() {
      return quarters;
      }
      
      //setter methods
      public void setPennies(int pennies) {
         this.pennies = pennies;
      }
      
      public void setNickels(int nickels) {
         this.nickels = nickels;
      }
      
      public void setDimes(int dimes) {
         this.dimes = dimes;
      }
      public void setQuarters(int quarters) {
         this.quarters = quarters;
      }

      //adding methods
      public void addPennies(int count) {
         pennies += count;
      }
      
      public void addNickels(int count)
      {
         nickels += count;
      }

      public void addDimes(int count)
      {
         dimes += count;
      }

      public void addQuarters(int count)
      {
         quarters += count;
      }
      
      //subtracting methods
      public void takePennies(int count)
      {
         pennies -= count;
      }
      
      public void takeNickles(int count)
      {
         nickels -= count;
      }
      
      public void takeDimes(int count)
      {
      dimes -= count;
      }

      public void takeQuarters(int count)
      {
         quarters -= count;
      }

      //subtracting multiple types of coins at once
      public void removeCoins(int pennies, int nickels, int dimes, int quarters) {
         this.pennies -= pennies;
         this.nickels -= nickels;
         this.dimes -= dimes;
         this.quarters -= quarters;
      }
      
      //adding multiple types of coins at once
      public  void addCoins(int pennies, int nickels, int dimes, int quarters) {
      this.pennies += pennies;
      this.nickels += nickels;
      this.dimes += dimes;
      this.quarters += quarters;
      }
      
      //total value of coins in piggy bank
      public double getTotal()
      {
         double total = ((pennies * PENNY_VALUE) + (nickels * NICKEL_VALUE) + (dimes * DIME_VALUE) + (quarters * QUARTER_VALUE));
         double roundedTotal = Math.round(total * 100.0) / 100.0;

         return roundedTotal;
      }
      
      // getDollars which returns the value in the bank in whole dollar(s).
      public int getDollars() {
         return (int) (getTotal());
      }
      
      //converts current coins to coins that take up least amount of space (same monetary value)
      public void fewestCoins() {
      double total = getTotal();
      this.quarters = (int) (total / QUARTER_VALUE);
      this.dimes = (int) ((float)((total - (this.quarters * QUARTER_VALUE)) / DIME_VALUE));
      this.nickels = (int) ((float)((total - (this.quarters * QUARTER_VALUE) - (this.dimes * DIME_VALUE)) / NICKEL_VALUE));
      this.pennies = (int) ((float)((total - (this.quarters * QUARTER_VALUE) - (this.dimes * DIME_VALUE) - (this.nickels * NICKEL_VALUE)) / PENNY_VALUE));
      }
   
      public String toString() {
         return piggyBankName +": " + "Pennies: " + pennies + ", Nickels: " + nickels + ", Dimes: " + dimes + ", Quarters: " + quarters;
      }
   }

   public static void main(String[] args)
   {//create PiggyBank object using parameterized constructor for each sibling
      bank sibling1 = new bank(2, 9, 4, 0, "piggy1");
      bank sibling2 = new bank(12, 3, 4, 2, "piggy2");
    
      //print the content of both siblings' bank (attributes)
      System.out.println(sibling1);
      System.out.println(sibling2);

      sneakySwap(sibling1, sibling2);
      System.out.println("\nAfter the sneakySwap:");
      
      //and print the content of each sibling's bank after the swap
      System.out.println(sibling1);
      System.out.println(sibling2);

      // sibling1 adds all the coins from sibling2's PiggyBank (all coins are now in piggy bank 1)
      // and both siblings point (have access) to the same PiggyBank sibling1's bank (aliasing / two objects pointing at one)
      accruePiggyBankFunds(sibling1, sibling2);
      sibling2 = sibling1;

      System.out.println("\nAfter the accrueBankFunds:");
      System.out.println("Sibling1's Bank:");
      System.out.println(sibling1);
      System.out.println("Sibling2's Bank:");
      System.out.println(sibling2);

      //print sibling1's total
       System.out.println("\nsibling1's total $" + sibling1.getTotal());

      //print sibling2's fewestCoins (technically sibling1's piggy bank)
       System.out.println("\nsibling2's PiggyBank(after the fewestCoins method is performed):");
       sibling2.fewestCoins();
       System.out.println(sibling2);
   }
   
   
   // swaps the values of the piggy banks
   public static void sneakySwap(bank b1, bank b2) {
       int tempPennies = b1.getPennies();
       b1.setPennies(b2.getPennies());
       b2.setPennies(tempPennies);

       int tempNickels = b1.getNickels();
       b1.setNickels(b2.getNickels());
       b2.setNickels(tempNickels);

       int tempDimes = b1.getDimes();
       b1.setDimes(b2.getDimes());
       b2.setDimes(tempDimes);

       int tempQuarters = b1.getQuarters();
       b1.setQuarters(b2.getQuarters());
       b2.setQuarters(tempQuarters);
   }

   //combines the coins
   public static void accruePiggyBankFunds(bank pb1, bank pb2) {
	  pb1.setPennies(pb1.getPennies() + pb2.getPennies());
      pb1.setNickels(pb1.getNickels() + pb2.getNickels());
      pb1.setDimes(pb1.getDimes() + pb2.getDimes());
      pb1.setQuarters(pb1.getQuarters() + pb2.getQuarters());
   }
/*
Two siblings with a piggy bank each with four types of coins (pennies, nickels, dimes, quarters).
Users can add, subtract, set, and see the amount of coins for each piggy bank object.
Also, piggy bank objects can combine funds or swap monetary value (1 having 2's value, 2 having 1's value)
 */
}