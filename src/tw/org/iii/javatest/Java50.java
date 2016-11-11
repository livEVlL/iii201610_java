package tw.org.iii.javatest;

import java.util.HashMap;
import java.util.HashSet;
import java.util.TreeSet;

public class Java50 {
    public static void main(String[] args){
        HashMap<String,Object> map = new HashMap<>();
        map.put("name","Brad");
        map.put("gender",false);
        map.put("weight",80);
        map.put("height",180);

        System.out.println(map.get("name"));
        System.out.println(map.get("gender"));
        System.out.println(map.get("weight"));
        System.out.println(map.get("height"));

    }

}
