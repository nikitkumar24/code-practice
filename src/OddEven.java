import java.util.Scanner;

public class OddEven {
    public static void main(String[] args) {
        int n;
        Scanner s = new Scanner(System.in);
        System.out.println("Enter a number");
        n = s.nextInt();
        if (n%2==0){
            System.out.println("Its an even number");
        }
        else{
            System.out.println("Its an odd number");
        }
    }
}
