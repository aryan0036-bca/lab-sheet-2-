import java.util.Scanner;

public class Q23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        int n = sc.nextInt();

        if (n < 0) {
            System.out.println("Not a palindrome");
        } else {
            int original = n;
            int reverse = 0;

            while (n > 0) {
                reverse = reverse * 10 + n % 10;
                n /= 10;
            }

            if (original == reverse) {
                System.out.println("Palindrome number");
            } else {
                System.out.println("Not a palindrome");
            }
        }

        sc.close();
    }
}
