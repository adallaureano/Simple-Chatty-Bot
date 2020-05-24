import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number;
        int a = 0;
        int b = 0;
        int c = 0;
        int d = 0;
        int e = 0;
        boolean result = false;

        while ((number = sc.nextInt()) != 0) {
            e = d;
            d = c;
            c = b;
            b = a;
            a = number;
            if (number >= a && number >= b && number >= c && number >= d  && number >= e ) { // ascending
                result = true;
            }
            if (number <= a && number <= b  && number <= c && number <= d && number <= e ) { // descending
                result = true;
            }
            if (number <= a && number <= b  && number <= c && number <= d && number >= e ) { // false
                result = false;
            }
            if (number <= a && number <= b  && number <= c && number >= d && number >= e ) { // false
                result = false;
            }
        }
        System.out.println(result);
    }
}
