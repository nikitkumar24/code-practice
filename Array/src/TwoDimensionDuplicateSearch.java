import java.util.Scanner;

public class TwoDimensionDuplicateSearch {
    public static void main(String[] args) {
        int a[][] = {{230, 390,
                      390, 500,
                      600, 390}};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int num = sc.nextInt();
        int count = 0;
        for(int r = 0; r<2; r++){
            for(int c = 0; c<1; c++ ){
                if(a[r][c] == num) {
                    count++;
                }
            }
            System.out.println("Number of times a variable got duplicated is "+count);
        }
    }
}

