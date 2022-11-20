import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main {
    public static void main(String[] args) {

        String str = "123";
        str.chars().forEach(i-> System.out.println(i));
    }
    public static void checkDuplicatedNumber (String userInput) {
        Set<String> userInputList = new HashSet<>(List.of(userInput.split("")));
        System.out.println(userInputList);
        if (userInputList.size() != 3) {
            throw new IllegalArgumentException("INPUT_ERROR");
        }
    }
}

