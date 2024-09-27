import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.

        Scanner scanner = new Scanner(System.in);


        scanner.useDelimiter(":");
        int h = scanner.nextInt();
        int m = scanner.nextInt();

        System.out.println((h+1) + ":" + m);

    }
}