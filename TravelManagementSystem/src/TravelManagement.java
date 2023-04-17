import java.util.ArrayList;

public class TravelManagement {
    private ArrayList<Item> items;
    public ArrayList<Item> filter(ItemType query) {
        ArrayList<Item> results = new ArrayList<>();
        for(Item item: items) {
            if(item.getItemType() == query) {
                results.add(item);
            }
        }
        return results;
    }

    public Double computeDistance(int user_id) {
        User user = getUser(user_id);
        Location start_location = user.getLocation();
        for()
    }
}
