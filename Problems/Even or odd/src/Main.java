import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int a;
        while ((a = scanner.nextInt()) != 0) {
            System.out.println(a % 2 == 0 ? "even" : "odd");
        }
    }
}
