package program;
import java.util.Scanner;
public class ATMProgram {
    public static void main(String[] args) {
        // Initialize user's bank account with an initial balance
        BankAccount userAccount = new BankAccount(1000.0);

        // Create an ATM instance connected to the user's account
        ATM atm = new ATM(userAccount);

        Scanner scanner = new Scanner(System.in);

        while (true) {
            // Display ATM menu
            atm.displayMenu();

            // Get user's choice
            System.out.println("Enter your choice (1-4):");
            int choice = scanner.nextInt();

            // Process user's choice
            atm.processOption(choice);
        }
    }
}