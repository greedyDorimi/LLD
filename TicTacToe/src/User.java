public class User {

    private Integer user_id;
    private String name;

    private String symbol;

    public User(Integer user_id, String name, String symbol) {
        this.user_id = user_id;
        this.name = name;
        this.symbol = symbol;
    }

    public Integer getUser_id() {
        return user_id;
    }

    public void setUser_id(Integer user_id) {
        this.user_id = user_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSymbol() {
        return symbol;
    }

    public void setSymbol(String symbol) {
        this.symbol = symbol;
    }

}
