import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String s = sc.nextLine();
        String rev = "";
        /*for (int i = s.length()-1; i>=0; i-- ){
            rev = rev+s.charAt(i);
        }
        System.out.println("Reverse String is: "+ rev);*/
        //Approach 2: Without using String method or converting a string into an Array
        /*char a[]= s.toCharArray();
        for(int i =a.length-1;i>=0;i--){
            rev = rev + a[i];
        }
        System.out.println("Reverse String is: "+ rev);*/

        //Approach 3: Using StringBuffer Class
        StringBuffer sb = new StringBuffer(s);
        System.out.println("Reverse String is: "+sb.reverse());
    }
}
