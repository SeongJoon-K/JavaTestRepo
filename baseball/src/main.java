import java.util.*;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class main {
    public static Random random = new Random();
    public static void main(String[] args) {
        List<String> num = new ArrayList<>();
        int size = 10;
        IntStream.range(0,size)
                .mapToObj(i -> String.valueOf(random()))
                        .filter(Predicate.isEqual("1"))
                .forEach(num.add("U"));
        System.out.println(num);
    }
    public static int random() {
        return random.nextInt(2);
    }
}

