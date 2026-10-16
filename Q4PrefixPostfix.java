import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int visitors = 0;

        System.out.print("Number of entering visitors: ");
        int entering = sc.nextInt();

        for (int i = 0; i < entering; i++) {
            System.out.println("Visitor entered: " + (++visitors));
        }

        System.out.print("Number of leaving visitors: ");
        int leaving = sc.nextInt();

        for (int i = 0; i < leaving; i++) {
            System.out.println("Visitor leaving: " + (visitors--));
        }

        System.out.println("Visitors remaining: " + visitors);
        sc.close();
    }
}
