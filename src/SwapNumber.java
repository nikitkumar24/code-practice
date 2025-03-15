import java.util.Scanner;

public class SwapNumber {
    public static void main(String[] args) {
        int a, b;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of a" );
        a = s.nextInt();
        System.out.println("Enter the value of b" );
        b = s.nextInt();
        a = a+b;
        b = a-b;
        a = a-b;
        System.out.println("Value of a is " +a);
        System.out.println("Value of b is " +b);
    }
}
