public class Main {
    public static void main(String[] args) {
        // 여기에 코드를 작성해주세요.
        int a = 5, b = 6, c = 7;
        int temp1 = a;
        int temp2 = b;
        a = c;
        b = temp1;
        c = temp2;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}