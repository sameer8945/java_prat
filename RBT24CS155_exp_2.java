import java.util.*;

public class RBT24CS155_exp_2 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();

        list.add(40);
        list.add(10);
        list.add(30);
        list.add(20);
        list.add(50);

        System.out.println("Original List: " + list);

        Collections.sort(list);
        System.out.println("Sorted List: " + list);

        Collections.reverse(list);
        System.out.println("Reversed List: " + list);
    }
}