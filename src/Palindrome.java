import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        int rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int temp = num;
        while(num>0) {
            int digi = num % 10;
            rev = rev * 10 + digi;
            num/=10;
        }
        if(temp==rev){
            System.out.println(temp+" is a Palindrome number");
        }
        else{
            System.out.println(temp+" is not a Palindrome number");
        }
    }
}
