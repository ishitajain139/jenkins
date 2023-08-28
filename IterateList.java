import java.util.List;
import java.util.ArrayList;

public class IterateList {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        System.out.println("Iterating through the list:");
        for (int num : numbers) {
            System.out.println(num);
        }
    }
}
