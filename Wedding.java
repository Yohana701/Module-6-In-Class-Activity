import java.time.*;

public class Wedding {
    private Couple couple;
    private LocalDate weddingDate;
    private String location;

    // Constructor
    public Wedding(Couple c, LocalDate date, String loc) {
        couple = c;
        weddingDate = date;
        location = loc;
    }

    // Getter methods
    public Couple getCouple() {
        return couple;
    }

    public LocalDate getWeddingDate() {
        return weddingDate;
    }

    public String getLocation() {
        return location; // Updated method name
    }
}
