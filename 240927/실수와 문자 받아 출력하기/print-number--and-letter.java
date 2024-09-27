import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);

        String c = scanner.nextLine();

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();

        System.out.printf("%s\n%.2f\n%.2f", c, a, b);
    }
}