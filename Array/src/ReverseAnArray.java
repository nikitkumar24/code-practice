import java.util.Arrays;

public class ReverseAnArray {
    public static void main(String[] args) {
        int a[] = {400,200,300,100,600};
        System.out.println("Before Reversing Array values "+ Arrays.toString(a));
        for(int i = a.length-1; i>=0; i--){
            System.out.println(a[i]);
        }
    }
}
