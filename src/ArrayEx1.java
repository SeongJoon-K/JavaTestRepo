import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ArrayEx1 {
    public static void main(String[] args) {
        final int SIZE = 10;
        int x = 0, y = 0;

        char[][] board = new char[SIZE][SIZE];
        byte[][] shipBoard = {
                //1  2  3  4  5  6  7  8  9
                { 0, 0, 0, 0, 0, 0, 0, 0, 0}, // 1
                { 0, 1, 1, 1, 0, 0, 0, 0, 0}, // 2
                { 0, 0, 0, 0, 1, 0, 0, 0, 0}, // 3
                { 0, 0, 0, 0, 1, 0, 0, 0, 0}, // 4
                { 0, 0, 0, 0, 1, 0, 0, 0, 0}, // 5
                { 1, 1, 0, 0, 0, 0, 0, 0, 0}, // 6
                { 0, 0, 0, 0, 0, 0, 0, 0, 0}, // 7
                { 0, 0, 0, 0, 0, 0, 0, 0, 0}, // 8
                { 0, 0, 0, 0, 0, 0, 0, 0, 0}, // 9
        };
        // 1행에 행 번호, 1열에 열번호 저장
        for(int i = 1; i < SIZE; i++) {
            board[0][i] = board[i][0] = (char)(i+'0');
        }
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.printf("좌표를 입력. 종료(00)");
            String input = sc.nextLine();
            if(input.length() == 2){
                x = input.charAt(0) - '0';
                y = input.charAt(1) - '0';

                if (x==0 && y==0) {
                    break;
                }

                if(input.length() !=2 || x<= 0 || x>= SIZE || y<=0 || y >= SIZE) {
                    System.out.println("잘못된 입력입니다.");
                    continue;
                }

                board[x][y] = shipBoard[x-1][y-1] == 1 ? 'O' : 'X';

                for (int  i= 0; i < SIZE; i++) {
                    System.out.println(board[i]);

                }
                System.out.println();
            }
        }


    }
    public void problem1(int) {
        // 1. 리스트 값을 선언하고, 랜덤으로 페이지를 뽑는다.
        List<Integer> pobi = new ArrayList<>();
        List<Integer> crong = new ArrayList<>();
        while (true) {
            int pobiNum = (int) (Math.random() * 400);
            int crongNum = (int) (Math.random() * 400);
            if (pobiNum % 2 == 1 && crongNum % 2 == 1) {
                pobi.add(pobiNum);
                pobi.add(pobiNum + 1);
                crong.add(crongNum);
                crong.add(crongNum + 1);
                break;
            }
        }
        List<Integer> pobiResult = new ArrayList<>(); // 포비가 펼친 페이지가 있음
        List<Integer> crongResult = new ArrayList<>(); // 크롱이 펼친 페이지가 있음
        // 2. 왼쪽 페이지의 자리수의 값과 오른쪽 페이지의 각 자리수의 합을 더하거나 곱한다.

        int num = 0;
        for (Object obj : pobi) { //
            String pobiBookNum = obj.toString(); // 우선적으로 String 으로 받고
            char[] pobiArr = pobiBookNum.toCharArray();
            int num = 0;
            for (int i = 0; i < pobiArr.length; i++) {
                num = pobiArr[i] - 48; // char 형에서 -48 해서 int 형으로 변환 시켰음
            }
            System.out.println();

        }
    }
}
