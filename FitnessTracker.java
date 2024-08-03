import java.time.LocalDate;

public class FitnessTracker {
    // Fields
    private String activity;
    private int minutes;
    private LocalDate date;

    // Default Constructor
    public FitnessTracker(){
        this.activity = "running";
        this.minutes = 0;
        this.date = LocalDate.of(LocalDate.now().getYear(), 1, 1);
    }
    // Parameterized Constructor
    public FitnessTracker( String activity, int minutes, LocalDate date){
        this.activity = activity;
        this.minutes = minutes;
        this.date = date;
    }
    // Getter methods
    public String getActivity(){
        return activity;
    }
    public int getMinutes(){
        return minutes;
    }
    public LocalDate getDate(){
        return date;
    }
}
