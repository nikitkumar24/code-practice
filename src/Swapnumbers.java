import java.util.Scanner;

public class Swapnumbers {
    public static void main(String[] args) {
        int a, b, c;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a");
        a = s.nextInt();
        System.out.println("Enter the value of b");
        b = s.nextInt();
        c = a;
        a = b;
        b = c;
        System.out.println("Value of a " + a);
        System.out.println("Value of b " + b);
    }
}
