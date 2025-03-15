import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        int a=200, b=100;
        //var = exp ? result1: result2;
        //Example 1

        /*int x = (a>b)? b: a;
        System.out.println(x);*/

        //Example 2
        /*int x = (1==1)? 250: 150;
        System.out.println(x);
    */
        /*int x = (1==2)? 250: 150;
        System.out.println(x);*/

        //Example 3
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the person age");
        int person_age = sc.nextInt();
        String res = (person_age>18)? "Eligible": "NotEligible";
        System.out.println(res);
    }
}
