import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> happy = new HashMap<String, Integer>();
        happy.put("a", 10);
        happy.put("b", 3);
        happy.put("c", 88);

        System.out.println(happy);
        System.out.println(happy.get("c"));
;    }
}
