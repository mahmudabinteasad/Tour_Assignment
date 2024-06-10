class TourItinerary {
    String day;
    String time;
    String activity;
    TourItinerary(String day, String time, String activity) {
        this.day = day;
        this.time = time;
        this.activity = activity;
    }
}
public class Main {
    public static void main(String[] args) {
        TourItinerary[] itinerary = {
                new TourItinerary("Monday", "09:00 AM", "Beach volleyball"),
                new TourItinerary("Tuesday", "10:00 AM", "Snorkeling"),
                new TourItinerary("Wednesday", "11:00 AM", "Hiking"),
                new TourItinerary("Thursday", "01:00 PM", "Surfing"),
                new TourItinerary("Friday", "03:00 PM", "Beach cleanup")
        };
        for (TourItinerary t : itinerary) {
            System.out.println(t.day + " at " + t.time + ": " + t.activity);
        }
    }
}