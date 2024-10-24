import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        int width = scanner.nextInt();
        int height = scanner.nextInt();

        width += 8;
        height *= 3;

        System.out.println(width);
        System.out.println(height);
        System.out.println(width * height);

    }
}