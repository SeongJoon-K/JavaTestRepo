import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Problem5 {
    public static void main(String[] args) {
        List<Integer> answer = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int money = sc.nextInt();
        List<Integer> CURRENCY = new ArrayList<>(Arrays.asList(50000,10000,5000,1000,500,100,50,10,1));
        for (int i = 0; i < CURRENCY.size(); i++) {
            answer.add(money/CURRENCY.get(i));
            money = money - (money/CURRENCY.get(i)) * CURRENCY.get(i);
        }
        System.out.println(answer);
    }
}
