import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        System.out.print("Enter power of 2: ");
        int p = sc.nextInt();

        System.out.println("Multiplication = " + (n << p));
        System.out.println("Division = " + (n >> p));

        sc.close();
    }
}
