import java.util.Scanner;
public class string_comparison {

    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);

        System.out.println("Enter firstName and then lastName of individual1:");
        String individual1 = kb.nextLine();

        System.out.println("Enter firstName and then lastName of individual2:");
        String individual2 = kb.nextLine();

        int split1 = individual1.indexOf(" ");
        int split2 = individual2.indexOf(" ");

        String firstName1 = individual1.substring(0, split1);
        String firstName2 = individual2.substring(0, split2);

        String lastName1 = individual1.substring(split1 + 1);
        String lastName2 = individual2.substring(split2 + 1);

        if (lastName1.compareTo(lastName2) < 0) {
            System.out.println(lastName1 + ", " + firstName1);
            System.out.println(lastName2 + ", " + firstName2);
        }
        else if (lastName1.compareTo(lastName2) > 0) {
            System.out.println(lastName2 + ", " + firstName2);
            System.out.println(lastName1 + ", " + firstName1);
        }
        else if (lastName1.compareTo(lastName2) == 0) {
            if (firstName1.compareTo(firstName2) < 0) {
                System.out.println(lastName1 + ", " + firstName1);
                System.out.println(lastName2 + ", " + firstName2);
            }
            else if (firstName1.compareTo(firstName2) > 0) {
                System.out.println(lastName2 + ", " + firstName2);
                System.out.println(lastName1 + ", " + firstName1);
            }
            else {
                System.out.println(lastName1 + ", " + firstName1);
                System.out.println(lastName2 + ", " + firstName2);
            }
        }
        kb.close();
    }
/*
Asks the user for two first and last names
Prints the names in this format: Last name, First name
*/
}
