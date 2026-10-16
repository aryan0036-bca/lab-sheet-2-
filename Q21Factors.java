import java.util.Scanner;

public class Q21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a positive integer: ");
        int n = sc.nextInt();

        if (n <= 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            int i = 1;

            System.out.println("Factors of " + n + ":");

            do {
                if (n % i == 0) {
                    System.out.print(i + " ");
                }
                i++;
            } while (i <= n);
        }

        sc.close();
    }
}
