package practice;

import java.util.HashMap;
import java.util.Map;

public class LearnHashMap {
    HashMap<String,String>map=new HashMap<>();
    public void AddHashMapValue(){

        map.put("IE", "Internet Explorer");
        map.put("Chrome", "Chrome Browser" );
        map.put("Firefox", "Mozilla Firefox");
        map.put("safari", " MacBook");
        map.put("opera", "linux browser");
        System.out.println("size of the map is :"+ map.size());
        System.out.println(map);



    if (map.containsKey("Internet Explorer")){
        String a= map.get("Internet Explorer");
        System.out.println("value for key"  + a);
    }






    }
        public static void main(String[] args){
        LearnHashMap objHash=new LearnHashMap();
        objHash.AddHashMapValue();

        }
}
