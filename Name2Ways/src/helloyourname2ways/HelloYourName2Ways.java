package helloyourname2ways;

import java.util.Scanner;

/**
 *
 * @author mafudge
 */
public class HelloYourName2Ways {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        String firstName, lastName;
        System.out.print("Enter your first name: ");
        firstName = input.nextLine();
        System.out.print("Enter your last name: ");
        lastName = input.nextLine();
        
        System.out.printf("Hello %s %s!\n", firstName, lastName);
        System.out.printf("Or should I say: %s, %s!\n", lastName, firstName);
    }
    
}
