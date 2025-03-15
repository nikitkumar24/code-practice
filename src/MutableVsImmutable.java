import java.util.Arrays;

public class MutableVsImmutable
{
    public static void main(String[] args) {

        //Mutable - We can change the values. If any method is able to change the original value of the variable that's called mutable
        /*int a[] = {30,10,50,20,40};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);  //Mutable
        System.out.println(Arrays.toString(a));*/

        //Immutable ----> If any method is not able to change the original value of the variable that's called immutable.
        String s= new String("Welcome");
        System.out.println(s); //welcome
        String concatstring = s.concat(" to java");
        System.out.println(s); //welcome ----> immutable - we cannot change/ Only Strings are immutable method in Java
    }
}
