public abstract class Item {
    private int id;
    private String address;
    private String name;

    private ItemType itemType;

    public Item(int id, String address, String name, ItemType itemType) {
        this.id = id;
        this.address = address;
        this.name = name;
        this.itemType = itemType;
    }

    public void printAddress(){
        System.out.println(address);
    }
    public void organisationName(){
        System.out.println(name);
    }

    public ItemType getItemType() {
        return itemType;
    }

    public void setItemType(ItemType itemType) {
        this.itemType = itemType;
    }
}
