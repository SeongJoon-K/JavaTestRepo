import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class main {
    public static void main(String[] args) {


    }
    public static void checkDuplicatedNumber (String userInput) {
        Set<String> userInputList = new HashSet<>(List.of(userInput.split("")));
        System.out.println(userInputList);
        if (userInputList.size() != 3) {
            throw new IllegalArgumentException("INPUT_ERROR");
        }
    }
}

    public static boolean reGameMessage() {
        System.out.println(REGAME_SUGGESTION_MSG);
        String reGameInput = Console.readLine();
        if (reGameInput.equals("1")) {
            return true;
        }
        if (reGameInput.equals("2")) {
            return false;
        }
        throw new IllegalArgumentException(ERR_MSG);
    }


