import java.util.*;
import java.util.stream.Stream;

public class Problem6 {
    /*
    1. 두 글자 이상의 문자가 연속적으로 포함되있는 경우 중복으로 간주함
    2. 10000명 이하임
    3. 이메일 전체 길이는 11자 이상 19자 이하
    4. email.com 필수적으로 들어가야함
    5. 닉네임은 무조건 한글만 가능하고 19자 이하임
    6. result는 이메일에 해당하는 부분의 문자열을 오름차순으로 정렬하고 중복은 제거함.
     */
    static List<List<String>> forms = new ArrayList<>();
    static Set<String> setResult = new HashSet<>();
    public static void main(String[] args) {
        // 예외 사항 처리
//        try {
//            for (int i = 0; i < forms.size(); i++) {
//                if (!forms.get(i).get(0).contains("email.com") &&
//                        !(forms.get(i).get(0).length() >= 11) &&
//                        !(forms.get(i).get(0).length() <= 19) &&
//                        !(forms.get(i).get(1).length() <= 19)) {
//                    throw new Exception();
//                }
//            }
//        } catch (Exception e) {
//            System.out.println("제한사항 위배되었습니다.");
//        }
        for (int i = 0; i < forms.size() -1; i++) {
            for (int j = i+1; j < forms.size(); j++) {
                if (nameCheck(forms.get(i).get(1), forms.get(j).get(1))) {
                    setResult.add(forms.get(i).get(0));
                    setResult.add(forms.get(j).get(0));
                };
            }
        }
        List<String> result = new ArrayList<>(setResult);
        Collections.sort(result);

    }
     static boolean nameCheck(String name1, String name2) {
        outLoop :
        for (int i = 0; i < name1.length()-1 ; i++) {
            String subStr1 = name1.substring(i, i+2);
            for (int j = 0; j < name2.length()-1; j++) {
                String subStr2 = name2.substring(j, j+2);
                if (subStr1.equals(subStr2)) {
                    return true;
                }
            }
        }
         return false;
     }
    static List<String> info(String email, String name) {
        List<String> user = new ArrayList<>();
        user.add(email);
        user.add(name);
        return user;
    }

}
