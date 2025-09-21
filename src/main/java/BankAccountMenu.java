import java.util.Scanner;

public class BankAccountMenu {
    public static void main(String[] args) {
        // TODO: Implement the bank account menu
        Scanner sc = new Scanner(System.in);

        // 1. Create a double variable for balance
        boolean run = true;
        double account = 0.00;

        // 2. Create a while loop for the menu
        while (run)
        {
            // Display menu
            System.out.println("\n\n--- Bank Account Menu ---");

            // 3. Display the menu options
            System.out.println("1. Add Money");
            System.out.println("2. Withdraw Money");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            // 4. Use Scanner to read user input
            System.out.print("Enter your choice:  ");;
            int choice = sc.nextInt();

            // 5. Use switch statement to handle menu choices
            switch (choice)
            {
                // 6. Implement add money, withdraw money, check balance, and exit functionality
                case 1:
                    System.out.print("Enter amount to add:  ");
                    double amoney = sc.nextDouble();
                    account += amoney;
                    System.out.printf("New balance:  $%.2f\n", account);
                    if (amoney <= 0)
                    {
                        System.out.println("Error: Give an amount greater than zero.");
                    }
                    break;

                case 2:
                    System.out.print("Enter amount to withdraw:  ");
                    double wmoney = sc.nextDouble();
                    if (wmoney <= 0)
                    {
                        System.out.println("Error: Give an amount greater than zero.");
                    }
                    else if (wmoney > account)
                    {
                        System.out.println("Insufficient Funds");
                    }
                    else
                    {
                        account -= wmoney;
                        System.out.printf("New balance:  $%.2f\n", account);
                    }
                    break;

                case 3:
                    System.out.printf("Current Balance:  $%.2f\n", account);
                    break;

                case 4:
                    System.out.print("Goodbye!");
                    run = false;
                    break;
            }
        }
    }
}