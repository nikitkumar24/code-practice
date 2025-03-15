import java.util.Arrays;
public class SortingElementsinArray {
    public static void main(String[] args) {
        //int a[] = {300,200,600,400,100,500};
        char a[] = {'M','G','R','T','K'};
        System.out.println("Before Sorting.");
        System.out.println(Arrays.toString(a));

        Arrays.sort(a);

        System.out.println("After Sorting.");
        System.out.println(Arrays.toString(a));
    }
}
