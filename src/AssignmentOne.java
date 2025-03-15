import java.util.Scanner;

public class AssignmentOne {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();


        Scanner bc = new Scanner(System.in);
        System.out.println("Enter the value of b");
        int b = bc.nextInt();

        // Swap two numbers value
        a += b;
        b = a-b;
        a -= b;
        System.out.println("Value of a is "+a);
        System.out.println("Value of b is "+b);
    }
}
