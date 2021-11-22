import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 'n' and 'm':");
        foo(scanner.nextInt(), scanner.nextInt());
    }

    public static void foo(int n, int m) {
        StringBuilder stringBuilder = new StringBuilder();
        int startNumber = 1;
        boolean isEnd = false;
        while (!isEnd) {
            stringBuilder.append(startNumber);
            startNumber = (startNumber + m - 1) % n;
            if (startNumber == 0) {
                startNumber = n;
            }
            if (startNumber == 1) {
                isEnd = true;
            }
        }
        System.out.println(stringBuilder);
    }
}