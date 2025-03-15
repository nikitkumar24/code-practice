import java.util.Scanner;

public class WeekNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week number");
        int a = sc.nextInt();
        if(a==1){
            System.out.println("Day is Sunday");
        }
        else if (a==2) {
            System.out.println("Day is Monday");
        }
        else if (a==3) {
            System.out.println("Day is Tuesday");
        }
        else if (a==4) {
            System.out.println("Day is Wednesday");
        }
        else if (a==5) {
            System.out.println("Day is Thursday");
        }
        else if (a==6) {
            System.out.println("Day is Friday");
        }
        else if (a==7) {
            System.out.println("Day is Saturday");
        }
        else{
            System.out.println("Invalid week number");
        }
    }
}
