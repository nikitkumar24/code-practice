import java.util.Scanner;

public class PrintEvenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the n value");
        int n = sc.nextInt();
        for(int i = n; i>=0; i--){
            if(i%2==0){
                System.out.println("Even numbers are "+i);
            }
        }
    }
}
