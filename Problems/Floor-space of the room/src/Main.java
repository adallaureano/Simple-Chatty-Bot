import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a;
        double b;
        double c;
        double r;
        double area;

        String str = sc.nextLine();
        switch (str) {
            case "triangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                c = sc.nextDouble();
                double s = (a + b + c) / 2;
                area = Math.sqrt(s * (s - a) * (s - b) * (s - c));
                System.out.println(area);
                break;
            case "rectangle":
                a = sc.nextDouble();
                b = sc.nextDouble();
                area = a * b;
                System.out.println(area);
                break;
            case "circle":
                r = sc.nextDouble();
                area = 3.14 * r * r;
                System.out.println(area);
                break;

            default:
                System.out.println("Choice is not available!");
        }
    }
}
