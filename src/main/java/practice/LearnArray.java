package practice;

import java.util.Arrays;
import java.util.Collections;

//while loop:executes a target statement as long as the given statement is true
public class LearnArray {

    public void WhileLoop() {
        int x = 10;  //loop control variable
        while (x < 20) {

            System.out.println("value of x :" + x);
            x++;
        }


    }   //for loop

    public void ForLoop() {
        for (int x = 10; x < 20; x++) {
            System.out.println("value of x is" + x);
        }

    }

    public void DoWhileLoop() {    //do while loop
        int x = 10;
        do {
            System.out.println("Value of x is " + x);
            x++;
        } while (x < 20);

    }

    public void StringArray() {
        // String List1="florida";
        // String List2 = "California";
        // String List3 = "georgia";
        // String List4 = "texas";
        String[] myList = {"florida", "california", "georgia", "texas"};
        // System.out.println(myList[1]);// this used to get one of the component but if we want to get
        //all the components we use loops
        for (int i = 0; i < myList.length; i++) {

            System.out.println("State name is" + myList[i]);
        }
//sort elements in  arrays
    }


    public void sortArray() {
        String[] states = {"florida", "california", "georgia", "texas"};
        Arrays.sort(states);
        System.out.println(Arrays.toString(states));
    }

//sort elements in an array in descending order
       public void sortArrayInDescendingOrder(){
        String[] states={"florida","california","georgia","texas"};
        Arrays.sort(states, Collections.reverseOrder());
        System.out.println(Arrays.toString(states));


    }
}


