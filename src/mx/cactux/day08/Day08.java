package mx.cactux.day08;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Day08 {


    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String... args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        Map<String, Integer> mapTelefonico = new HashMap<String, Integer>();
        for (int i = 0; i < n; i++) {
            String name = in.next();
            int phone = in.nextInt();
            // Write code here
            mapTelefonico.put(name, phone);
        }
        while (in.hasNext()) {
            String s = in.next();
            // Write code here
            if (mapTelefonico.containsKey(s)) {
                System.out.println(s + "=" + mapTelefonico.get(s));
            } else {
                System.out.println("Not found");
            }
        }
        in.close();


    }
}
