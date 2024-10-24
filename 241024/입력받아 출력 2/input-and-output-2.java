import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        Scanner scanner = new Scanner(System.in);
        scanner.useDelimiter("-");

        int number1 = scanner.nextInt();
        int number2 = scanner.nextInt();

        System.out.print(number1);
        System.out.print(number2);
    }
}