import java.util.Scanner;

public class LibrarySystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String bookName;
        int choice, days;
        double fine;

        boolean borrowed = false;

        System.out.println("=== Library Management System ===");

        System.out.print("Enter book name: ");
        bookName = sc.nextLine();

        do {
            System.out.println("\n1. Borrow Book");
            System.out.println("2. Return Book");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    if (!borrowed) {
                        borrowed = true;
                        System.out.println("Book borrowed successfully!");
                    } else {
                        System.out.println("Book is already borrowed.");
                    }
                    break;

                case 2:
                    if (borrowed) {
                        System.out.print("Enter number of days kept: ");
                        days = sc.nextInt();

                        if (days > 7) {
                            fine = (days - 7) * 5;
                        } else {
                            fine = 0;
                        }

                        System.out.println("Book returned successfully!");
                        System.out.println("Fine amount: Rs. " + fine);
                        borrowed = false;
                    } else {
                        System.out.println("Please borrow the book first.");
                    }
                    break;

                case 3:
                    System.out.println("Thank you for using the library system.");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 3);

        sc.close();
    }
}