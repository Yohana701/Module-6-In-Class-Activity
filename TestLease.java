import java.util.Scanner;

public class TestLease {
    public static void main(String[] args){
        // Declare lease objects
        Lease lease1, lease2, lease3, lease4;
        // Initialize lease objects using getData method
        lease1 = getData();
        lease2 = getData();
        lease3 = getData();
        // Initialize the fourth lease object with default values
        lease4 = new Lease();

        // display values for lease1
        showValues(lease1);
        // Add pet fee to lease1
        lease1.addPetFee();
        // Display values for lease1 after adding pet fee
        showValues(lease1);

        // Display values for lease2, lease3, and lease4
        showValues(lease2);
        showValues(lease3);
        showValues(lease4);
    }
    // Method to prompt user for lease data and return a lease object
    public static Lease getData(){
        Scanner input = new Scanner(System.in);
        System.out.print("Enter tenant name: ");
        String tenantName = input.nextLine();

        System.out.print("Enter apartment number: ");
        int apartmentNumber = input.nextInt();

        System.out.print("Enter monthly rent: ");
        int monthlyRent = input.nextInt();

        System.out.print("Enter lease term (in months): ");
        int leaseTerm = input.nextInt();
        input.nextLine(); // Consume new line left over
        return new Lease(tenantName, apartmentNumber, monthlyRent, leaseTerm);
    }
    // Method to display lease values
    public static void showValues(Lease lease) {
        System.out.println("Tenant Name: " + lease.getTenantName());
        System.out.println("Apartment Number: " + lease.getApartmentNumber());
        System.out.println("Monthly Rent: " + lease.getMonthlyRent());
        System.out.println("Lease Term: " + lease.getLeaseTerm());
        System.out.println();
    }
}
