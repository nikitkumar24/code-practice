public class MissingElement {
    public static void main(String[] args) {
        int a[] = {5,3,1,4};
        int sum1=0;
        for(int i=0;i<a.length;i++){
            sum1=sum1+a[i];
        }
        System.out.println("Sum of elements in an array "+sum1);
        int sum2=0;
        for(int i=1;i<=5;i++){
            sum2=sum2+i;
        }
        System.out.println("Sum of elements in an array "+sum2);
        System.out.println("Missing number is: "+(sum2-sum1));
    }
}
