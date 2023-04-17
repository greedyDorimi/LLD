import java.util.Map;

public class ExpenseManager {
    private Map<Integer, User> users;
    private static Integer total_users;

    public ExpenseManager() {
        ExpenseManager.total_users = 1;
    }

    public void addUser(String name) {
        User user = new User(ExpenseManager.total_users, name);
        ExpenseManager.total_users++;
    }


}
