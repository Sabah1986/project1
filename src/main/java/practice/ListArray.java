package practice;

import java.util.ArrayList;
import java.util.List;

public class ListArray {
    List<String>lists=new ArrayList<String>();
    public void addValueToTheList(){
        lists.add("One");
        lists.add("two");
        lists.add("three");

    }

    public void readValueFromTheList(){
        System.out.println(lists);
        for(String list:lists) {
            System.out.println("print value using for loops" + list);

        }

        for (int i=0; i<lists.size(); i++){
            System.out.println("print value for loop indexing:" + lists.get(1));




        }




    }




}
