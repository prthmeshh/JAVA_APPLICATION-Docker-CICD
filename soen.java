import java.util.Scanner;

public class soen {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;

        System.out.println("Enter 6 numbers:");
        for (int i = 0; i < 6; i++) {
            int num = scanner.nextInt();
            if (num % 2 == 0) {
                sum += num;
            }
        }

        System.out.println("Sum of even numbers: " + sum);
    }
}
