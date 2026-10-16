import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first string: ");
        String a = sc.nextLine();

        System.out.print("Enter second string: ");
        String b = sc.nextLine();

        int i = 0;
        int result = 0;

        while (i < a.length() && i < b.length()) {
            char c1 = a.charAt(i);
            char c2 = b.charAt(i);

            if (c1 < c2) {
                result = -1;
                break;
            } else if (c1 > c2) {
                result = 1;
                break;
            }
            i++;
        }

        if (result == 0) {
            if (a.length() < b.length()) {
                result = -1;
            } else if (a.length() > b.length()) {
                result = 1;
            }
        }

        if (result < 0) {
            System.out.println("First string comes before second");
        } else if (result > 0) {
            System.out.println("First string comes after second");
        } else {
            System.out.println("Both strings are equal");
        }

        sc.close();
    }
}
