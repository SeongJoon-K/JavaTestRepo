import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Problem4 {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine(); // 문자열 입력
        // 예외처리
        String answer = "";
//        String word = sc.nextLine(); // 문자열 입력
        if (word.length() <= 1000) {
            List<Character> wordList = word.chars()
                    .mapToObj(e -> (char) e).collect(Collectors.toList());
            char UPPER_CASE = (char) 155;
            char LOWER_CASE = (char) 219;
            for (int i = 0; i < wordList.size(); i++) {
                char c = wordList.get(i);
                if (c == 32) { // 알파벳 일대
                    answer += " ";
                } else if (c >= 65 && c <= 90) {
                    c = (char) (UPPER_CASE - c);
                    answer += String.valueOf(c);
                } else if (c >= 97 && c <= 122) {
                    c = (char) (LOWER_CASE - c);
                    answer += String.valueOf(c);
                }
            }
        }
        System.out.print(answer);
        /*
        기능 요구사항
        1. 문자열을 입력받는다. 공백도 포함
        2. 해당 문자열을 charArr로 바꾼다. Collection 클래스 사용
        3. 해당 요소를 그와 반대인 요소로 체인지 한다. (for 사용)
        4. 바꾼 값을 다시 String으로 return
         */


    }
}
