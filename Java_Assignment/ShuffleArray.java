package Java_Assignment;

import java.util.ArrayList;
import java.util.List;
import java.util.Collections;

// Q1 : Create an array with the values (1, 2, 3, 4, 5, 6, 7) and shuffle it.
public class ShuffleArray {
    public static void main(String[] args) {
        List<Integer> mylist = new ArrayList<>();
        mylist.add(1);
        mylist.add(2);
        mylist.add(3);
        mylist.add(4);
        mylist.add(5);
        mylist.add(6);
        mylist.add(7);

        Collections.shuffle(mylist);

        System.out.println("Shuffled Array : " + mylist);



    }
}