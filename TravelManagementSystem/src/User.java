import java.util.ArrayList;

public class User {
    private int user_id;
    private String name;

    Location user_location;
    ArrayList<Itinerary> itineraries;

    void addItinerary(Itinerary itinerary) {
        itineraries.add(itinerary);
    }
}
