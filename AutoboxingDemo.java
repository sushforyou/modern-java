
import java.util.ArrayList;
import java.util.List;

public class AutoboxingDemo {
    public static void main(String args[]) {
        Integer wrapped = 10; // autoboxing
        int primitive = wrapped; // unboxing
        System.out.print("wrapped is " + wrapped + " and primitive is " + primitive + "\n");
        List<Integer> list = new ArrayList<>();
        list.add(20); // autoboxing
        int first = list.get(0); // unboxing
        System.out.println("first is " + first);

    }
}
