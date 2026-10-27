import java.util.*;

public class RBT24CS155_exp_1 {
    public static void main(String[] args) {
        TreeSet<Integer> set = new TreeSet<>();

        set.add(10);
        set.add(30);
        set.add(20);
        set.add(40);
        set.add(50);

        System.out.println("TreeSet: " + set);

        System.out.println("First element: " + set.first());
        System.out.println("Last element: " + set.last());

        set.remove(30);

        System.out.println("After removing 30: " + set);
    }
}

javac RBT24CS155_exp_1.java
java RBT24CS155_exp_1