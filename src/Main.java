//Gabby Alabre * @version 4.0 Include the Honor Pledge at the top of each program. You can write this in your own // words or use the standard UMW Pledge I pledge that I wrote this code on my own without cheating
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // create a donation tracker object
        DonationTracker tracker = new DonationTracker();
        Scanner scanner = new Scanner(System.in);
        String input;

        System.out.println("Welcome to the UMW Clothing Donation Tracker!");
        System.out.println("Type an item to donate ( Shirt, Pants, Jacket, Skirt, or Shoes) or type 'exit' to quit.");

        // loop to accept user donations
        while (true) {
            System.out.print("enter an item to donate: ");
            input = scanner.nextLine();

            if (input.equalsIgnoreCase("exit")) {
                break; // exit the loop if user types 'exit'
            }

            try {
                tracker.addDonation(input); // try to add the donation
            } catch (IllegalArgumentException e) {
                System.out.println("Sorry " + e.getMessage()); // will take in an invalid input
            }
        }

        // display the total count of donations
        tracker.displayDonations();
        scanner.close();
    }
}
