public class ArrayEx1 {
    public static void main(String[] args) {
        int numArr[] = new int[10];

        for (int i = 0; i < numArr.length; i++) {
            System.out.print(numArr[i] = (int)(Math.random()*10));
        }
        System.out.println();

    }
}
