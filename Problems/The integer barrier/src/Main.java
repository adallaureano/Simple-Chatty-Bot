import java.util.Scanner;

class Main {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int sum = 0;
       int n = sc.nextInt();

       while (n != 0) {
           sum += n;
           n = sc.nextInt();
           if (sum >= 1000) {
               sum -= 1000;
               break;
           }
       }
        System.out.println(sum);
    }
}