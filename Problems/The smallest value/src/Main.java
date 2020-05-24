import java.util.Scanner;

class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Long b = 1L;
        Long a = scanner.nextLong();
        while (b <= a) {
            a = a / b;
            b++;
        }
        System.out.println(b);
    }
}
