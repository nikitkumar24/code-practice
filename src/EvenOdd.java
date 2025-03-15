import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int even = 0, odd = 0;
        while(num>0) {
            int digi = num % 10;
            if (digi % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            num/=10;
        }
        System.out.println("The number of even digits are "+even);
        System.out.println("The number of odd digits are "+odd);
    }
}
