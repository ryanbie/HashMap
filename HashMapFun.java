import java.util.HashMap;

public class HashMapFun {

    public static void main(String[] args) {

        HashMap<String, String> fun = new HashMap<String, String>(); //Users and Passwords
        fun.put("bobbyJoe1996", "FluffyP0nies!");
        fun.put("HelloKittyFan21", "AloeVera?");
        fun.put("coolguyswag", "password123");

        fun.remove("HelloKittyFan21"); // removes user from the hashmap

        System.out.println(fun);
        System.out.println(fun.containsValue("password123")); //output displays true because it is in there
        System.out.println(fun.containsValue("coolguyswag")); //doesnt display because coolguyswag is a key not a value
        System.out.println(fun.containsKey("coolguyswag"));

        System.out.println(fun.replace("bobbyJoe1996", "b3tt3rp@assword"));
        System.out.println(fun);

        System.out.println(fun.size()); // how many keys are in hashmap
        System.out.println(fun.keySet()); //left
        System.out.println(fun.values()); //right

        /*
        Hashmaps don't have order unlike an array.
         */

    }
}
