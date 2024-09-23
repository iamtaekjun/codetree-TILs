import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        double oneFt = 30.48;

        Scanner scanner = new Scanner(System.in);
        double ft = scanner.nextDouble();

        System.out.printf("%.1f", ft * oneFt);
    }
}