import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.Scanner;

public class TestFitnessTracker {
    public static void main(String[] args) {
        // Create a fitnessTracker object with default constructor
        FitnessTracker tracker1 = new FitnessTracker();
        // Create a fitness tracker object with user input
        FitnessTracker tracker2 = getFitnessData();
        // Display values for both FitnessTracker objects
        showValues(tracker1);
        showValues(tracker2);
    }

    // Method to prompt user for FitnessTracker data and return a FitnessTracker object
    public static FitnessTracker getFitnessData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter activity: ");
        String activity = input.nextLine();

        System.out.print("Enter minutes: ");
        int minutes = input.nextInt();
        input.nextLine(); // Consume newline left-over

        System.out.print("Enter date (YYYY-MM-DD): ");
        String dateStr = input.nextLine();

        LocalDate date = null;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Try parsing the date and handle any errors
        try {
            date = LocalDate.parse(dateStr, formatter);
        } catch (DateTimeParseException e) {
            System.out.println("Invalid date format. Please use YYYY-MM-DD.");
            return null;
        }

        return new FitnessTracker(activity, minutes, date);
    }

    // Method to display FitnessTracker values
    public static void showValues(FitnessTracker tracker){
        if (tracker != null) {
            System.out.println("Activity: " + tracker.getActivity());
            System.out.println("Minutes: " + tracker.getMinutes());
            System.out.println("Date: " + tracker.getDate());
            System.out.println();
        } else {
            System.out.println("No valid tracker data to display.");
        }
    }
}
