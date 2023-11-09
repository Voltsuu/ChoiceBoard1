import java.util.Scanner;
import java.lang.Math;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num;

        System.out.println("Input a number (Integers only).");
        num = scan.nextInt();
        System.out.println(" ");

        int rootNum = (int)Math.sqrt(num);

        if (num == rootNum*rootNum) {
            System.out.println(+ num "is a perfect square."));
        } else {
            System.out.println("Your number is not a perfect square.");
        }
    }
}