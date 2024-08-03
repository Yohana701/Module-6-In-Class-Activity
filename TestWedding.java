import java.time.*;
import java.util.Scanner;
public class TestWedding {
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int mo, da, yr;
        String first, last, loc;
        System.out.print("Enter month of wedding: ");
        mo = kb.nextInt();
        System.out.print("Enter day of wedding: ");
        da = kb.nextInt();
        System.out.print("Enter year of wedding: ");
        yr = kb.nextInt();
        LocalDate date = LocalDate.of(yr, mo, da);
        kb.nextLine();
        System.out.print("Enter first name of the bride >> ");
        first = kb.nextLine();
        System.out.print("Enter last name of the bride >> ");
        last = kb.nextLine();
        Person bride = new Person(first, last);
        System.out.print("Enter first name of the groom >> ");
        first = kb.nextLine();
        System.out.print("Enter last name of the groom >> ");
        last = kb.nextLine();
        Person groom = new Person(first, last);
        Couple couple = new Couple(bride, groom);
        System.out.print("Enter the location of the wedding >>");
        loc = kb.nextLine();
        Wedding wedding = new Wedding(couple, date, loc);
        displayWeddingDetails(wedding);
    }
    public static void displayWeddingDetails(Wedding w){
        Couple couple = w.getCouple();
        LocalDate weddingDate = w.getWeddingDate();
        String location = w.getLocation();
        Person bride =couple.getBride();
        Person groom = couple.getGroom();
        String firstBride = bride.getFirstName();
        String lastBride = bride.getLastName();
        String firstGroom= groom.getFirstName();
        String lastGroom = groom.getLastName();
        System.out.println("\n" + lastBride + "/" + lastGroom + " Wedding");
        System.out.println("Date: " + weddingDate + " location: " + location);
        System.out.println("Bride: " + firstBride + " " + lastBride);
        System.out.println("Groom: " + firstGroom + " " + lastGroom);
    }
}

