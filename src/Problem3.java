import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {

        /*
        조건 요구사항
        - 3,6,9가 들어갈 때마다 박수 한 번 씩 추가된다.
        - 33의 경우 2번임
        1. 1 ~ 10000 이하인 number를 입력한다.
        2. 해당 수를 number 까지 반복한다.
        3. 해당 number를 자릿수마다 나누어 나머지를 통해서 3,6,9의 갯수를 확인한다/
         */
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0; // 손뼉을 쳐야하는 횟수
        for (int i = 1; i <= number; i++) {
            char[] numCharArr= Integer.toString(i).toCharArray(); // i를 String으로 바꾼 다음 이를 char배열로 다시 바꿈
            for (int j = 0; j < numCharArr.length; j++) {
                if (numCharArr[j] == '3' || numCharArr[j] == '6' || numCharArr[j] == '9' ) {
                    result ++;
                }
            }
        }
        System.out.println("손뼉 횟수 = " + result);

    }
}
