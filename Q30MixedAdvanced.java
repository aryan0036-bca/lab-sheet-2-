import java.util.Scanner;

public class Q30 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        // Check whether the number is a power of 4
        int temp = n;

        while (temp > 1 && temp % 4 == 0) {
            temp = temp >> 2;
        }

        if (n > 0 && temp == 1) {
            System.out.println(n + " is a power of 4");
        } else {
            System.out.println(n + " is not a power of 4");
        }

        // Toggle the third bit (bit position 2)
        int toggled = n ^ (1 << 2);
        System.out.println("After toggling third bit: " + toggled);

        // Multiplication table
        System.out.println("Multiplication table:");

        for (int i = 1; i <= 10; i++) {
            int result = n * i;

            if (result % 48 == 0) {
                System.out.println("Multiple of 48 reached: " + result);
                break;
            }

            if (result % 6 == 0) {
                continue;
            }

            System.out.println(n + " x " + i + " = " + result);
        }

        sc.close();
    }
}
