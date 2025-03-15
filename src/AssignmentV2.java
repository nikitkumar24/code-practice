import java.util.Scanner;

public class AssignmentV2 {
    public static void main(String[] args) {

        //int temp = num;
        // Q1 Reverse a number
       /* while(num>0){          // (1 2 3 > 0), (1 2 > 0) (1 > 0) (0 > 0) False
            int digi = num%10;
            rev = rev*10+digi; // 4 3 2 1
            num/=10;           // (1 2 3), (1 2) (1) (0)
        }
        System.out.println("Reverse number is "+rev);*/

        //Q2: Palindrome number
       /* while(num>0){
            int digi = num%10;
            rev = rev*10+digi;
            num/=10;
        }
        if(temp == rev){
            System.out.println(temp+" is a Palindrome number");
        }
        else{
            System.out.println(temp+" is not a Palindrome number");*/

        //Q3: Count of the numbers
        /*Scanner sc = new Scanner(System.in);    // 1 2 3 4
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int rev = 0, total=0;
        while(num>0){
            int digi = num%10; // 12345%10 = 5
            rev=rev*10+digi;   // 0+5=5
            num/=10;           // 12345/10 = 1234
            total++;           // Number of iteration count and increase value. 
        }
        System.out.println("The number of digits are "+total);*/

        //Q4: Count number of even and odd digit in a number
       /* Scanner sc = new Scanner(System.in);    // 2 3 4 5 6
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int even = 0, odd = 0;
        while (num > 0) {
            int digi = num % 10;      // 6
            num /= 10;                // 2 3 4 5
            if (digi % 2 == 0) {
                even++;
            } else {
                odd++;
            }
        }
        System.out.println("Number of even counts are "+even);
        System.out.println("Number of odd counts are "+odd);*/

        //Q5: Find sum of digits in a number
        Scanner sc = new Scanner(System.in);    // 2 3 4 5 6
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int sum = 0;
        while(num>0){
            int digi = num%10;
            sum = sum + digi;
            num/=10;
        }
        System.out.println("Sum of all digits are "+sum);
    }
}