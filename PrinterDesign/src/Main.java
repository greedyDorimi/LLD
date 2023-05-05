import java.util.*;

public class Main {
    public static void main(String[] args) {
//        E s = E.TRUCK;
//        Map<String, Integer> m = new HashMap<>();
//        m.put("b", 1);
//        m.remove("b");
//        System.out.println(m.get("b"));
//        for(Map.Entry<String, Integer> entry: m.entrySet()) {
//            System.out.println(entry);
//        }
//        ArrayList<Integer> ar = new ArrayList<>();
//        ar.add(1);
//        ar.get(0);
//        for(int n: ar) {
//            System.out.println(n);
//        }
        Set<Integer> hs = new HashSet<>();
        hs.add(1);
        hs.add(2);
        System.out.println(hs.contains(1));
        for(Integer num: hs) {
            System.out.println(num);
        }
    }
}
