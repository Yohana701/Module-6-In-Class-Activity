public class Lease {
    // Fields
    private String tenantName;
    private int apartmentNumber;
    private int monthlyRent;
    private int leaseTerm;

    // Default Constructor
    public Lease(){
        this.tenantName = "XXX";
        this.apartmentNumber = 0;
        this.monthlyRent = 1000;
        this.leaseTerm = 12;
    }
    // Parameterized constructor
    public Lease(String tenantName, int apartmentNumber, int monthlyRent, int leaseTerm) {
        this.tenantName = tenantName;
        this.apartmentNumber = apartmentNumber;
        this.monthlyRent = monthlyRent;
        this.leaseTerm = leaseTerm;
    }
    // Getter and Setter methods
    public String getTenantName(){
        return tenantName;
    }
    public void setTenantName(String tenantName){
        this.tenantName = tenantName;
    }
    public int getApartmentNumber(){
        return apartmentNumber;
    }
    public void setApartmentNumber(int apartmentNumber) {
        this.apartmentNumber = apartmentNumber;
    }
    public int getMonthlyRent(){
        return monthlyRent;
    }
    public void setMonthlyRent(int monthlyRent){
        this.monthlyRent = monthlyRent;
    }
    public int getLeaseTerm(){
        return leaseTerm;
    }
    public void setLeaseTerm(int leaseTerm){
        this.leaseTerm = leaseTerm;
    }

    // Method to add pet fee
    public void addPetFee(){
        this.monthlyRent += 10;
        explainPetPolicy();
    }

    // Static method to explain pet policy
    public static void explainPetPolicy(){
        System.out.println("Adding a pet fee of $10 to the monthly rent. Pets are allowed.");
    }
}
