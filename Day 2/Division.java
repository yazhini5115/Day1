import java.util.Scanner;

public class Division {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int dividend = sc.nextInt();
        int divisor = sc.nextInt();

        System.out.println(dividend % divisor);
    }
}