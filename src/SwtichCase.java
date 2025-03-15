import java.sql.SQLOutput;
import java.util.Scanner;

public class SwtichCase {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the week number");
        int a = sc.nextInt();
        switch (a){
            case 1: System.out.println("Day is Sunday"); break;
            case 2: System.out.println("Day is Monday"); break;
            case 3: System.out.println("Day is Tuesday"); break;
            case 4: System.out.println("Day is Wednesday"); break;
            case 5: System.out.println("Day is Thursday"); break;
            case 6: System.out.println("Day is Friday"); break;
            case 7: System.out.println("Day is Saturday"); break;
            default: System.out.println("Invalid week number");
        }
    }
}
