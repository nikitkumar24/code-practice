import java.util.Scanner;

public class Revnum {
    public static void main(String[] args) {
        int rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number value");
        int num = sc.nextInt();
        while(num>0){
            int digi = num%10;
            rev=rev*10+digi;
            num/=10;
        }
        System.out.println(rev);
    }
}
