public class SumArray {
    public static void main(String[] args) {
        //Question 1: Find sum of array numbers
        /*int a[] = {1,2,3,4,5};
        int sum =0;
        for(int i=0;i<a.length;i++){
            sum=sum+a[i];
        }
        System.out.println("Sum of array is "+sum);
    }*/

        //Q2: Print even and odd number from array
        int a[]={1,2,3,4,5,6};
        int even=0, odd=0;
        int num =0;
        for(int i =0;i<a.length;i++) {
            if(a[i]%2==0){
                even++;
            }
            else{
                odd++;
            }
        }
            System.out.println("Number of even numbers in an array is "+even);
            System.out.println("Number of odd numbers in an array is "+odd);
    }
}
