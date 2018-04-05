package Collections;

import java.util.HashMap;
import java.util.Map;

public class MapDebug {

    public static void main(String[] args){

        String s1 = "FB";
        String s2 = "Ea";

        char value[] = s1.toCharArray();
        int chartoint1 = 0 + value[0];
        int chartoint2 = 0+ value[1];

        char value2[] = s2.toCharArray();
        int chartoint3 = 0 + value2[0];
        int chartoint4 = 0+ value2[1];

        System.out.println("s1 value1 is: " + chartoint1);
        System.out.println("s2 value2 is: " + chartoint2);

        System.out.println("s2 value1 is: " + chartoint3);
        System.out.println("s2 value2 is: " + chartoint4);

        Map<String,Integer> map = new HashMap<String,Integer>();
        map.put(s1,1);
        map.put(s2,2);

        System.out.println(s1.hashCode() + " " + s2.hashCode());


    }
}
