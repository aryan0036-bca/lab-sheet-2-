import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter theory percentage: ");
        double theory = sc.nextDouble();

        System.out.print("Enter practical percentage: ");
        double practical = sc.nextDouble();

        double overall = (theory + practical) / 2.0;

        boolean pass = (theory >= 40 && practical >= 50)
                       || overall >= 50;

        System.out.println("Overall percentage = " + overall);

        if (pass) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }

        sc.close();
    }
}
