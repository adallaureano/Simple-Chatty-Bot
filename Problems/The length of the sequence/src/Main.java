import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int value;
        int count = 0;
        do {
            value = scanner.nextInt();
            if (value != 0) {
                count++;
            }
        } while (value != 0);
        System.out.println(count);
    }
}
