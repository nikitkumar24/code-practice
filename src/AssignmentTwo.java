import java.util.Scanner;

public class AssignmentTwo {
    public static void main(String[] args) {
        //Question 1:

        /*  Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = sc.nextInt();

        Scanner bc = new Scanner(System.in);
        System.out.println("Enter the value of b");
        int b = bc.nextInt();

        String val = (a>b)? "A is greater": "B is greater";
        System.out.println(val);*/

        // Question 2: Smallest of three numbers

       /* Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x = sc.nextInt();

        Scanner dc = new Scanner(System.in);
        System.out.println("Enter the value of y");
        int y = dc.nextInt();

        Scanner ac = new Scanner(System.in);
        System.out.println("Enter the value of z");
        int z = ac.nextInt();

        if (x < y && x < z) {
            System.out.println(x +" X is the smallest number");
        } else if (y < x && y < z) {
            System.out.println(y +" Y is the smallest number");
        } else {
            System.out.println(z+" Z is the smallest number");
        }*/

        //Question 3: Print week number based on week name

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Week name");
        String var = sc.nextLine();

        switch(var){
            case "Sunday": System.out.println("Day number is "+1); break;
            case "Monday": System.out.println("Day number is "+2); break;
            case "Tuesday": System.out.println("Day number is "+3); break;
            case "Wednesday": System.out.println("Day number is "+4); break;
            case "Thursday": System.out.println("Day number is "+5); break;
            case "Friday": System.out.println("Day number is "+6); break;
            case "Saturday": System.out.println("Day number is "+7); break;
            default: System.out.println("Invalid week name");
        }
    }
}
