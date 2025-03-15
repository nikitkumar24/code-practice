import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        int i=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        if (i == 1){
            System.out.println("Smallest prime number is 2");
        }
        for(i=2;i<num;i++){
            if(num%i==0){
                System.out.println("Number isn't a prime number");
                break;
            }
            if(num==i){
            System.out.println("Number is a prime number");
            }
        }
    }
}
