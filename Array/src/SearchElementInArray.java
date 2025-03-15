import java.util.Scanner;

public class SearchElementInArray {
    public static void main(String[] args) {
        int a[] = {89, 40, 59, 84, 60};
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number to search");
        int se = sc.nextInt();
        boolean status = false;
        //Normal For loop
        /*for(int i=0;i<a.length;i++){
            if(a[i] == se) {
                System.out.println("Element found");
                status = true;
                break;
            }*/
        //Enhanced for loop
        for(int x:a){
            if(x==se){
                System.out.println("Element found");
                status = true;
                break;
            }
        }
        if (status == false){
            System.out.println("Element not found");
        }
    }
}
