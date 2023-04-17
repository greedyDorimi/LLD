public class TouristActivity extends Item {

    private int fixed_price;
    public TouristActivity(int id, String address, String name, int fixed_price) {
        super(id, address, name, ItemType.TOURIST_ACTIVITY);
        this.fixed_price = fixed_price;
    }

    public int getFixed_price() {
        return fixed_price;
    }

    public void setFixed_price(int fixed_price) {
        this.fixed_price = fixed_price;
    }
}
