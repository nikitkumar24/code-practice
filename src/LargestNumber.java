public class LargestNumber {
    public static void main(String[] args) {
        int a =8, b = 32, c=9;
        if(a>b && a>c){
            System.out.println("A is the largest number "+a);
        }
        else if (b>a && b>c){
            System.out.println("B is the largest number "+b);
        }
        else {
            System.out.println("C is the largest number "+c);
        }
    }
}
