import java.util.Scanner;

public class Stringlength {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String str = sc.nextLine();
        str = str+" ";
        String word = "", lword = "";
        int len = str.length();
        for(int i = 0; i<len; i++){
            char ch = str.charAt(i);
            if(ch!=' '){
                word+=ch;
            }
            else{
                if(word.length()>lword.length()){
                    lword = word;
                }
                word = "";
            }
        }
        System.out.println("Lengthiest string in a sentence is "+lword);
        System.out.println("Length of the lengthiest string is "+lword.length());
    }
}