public class SingleDimensionArray {
     /*1. Declaring an Array
     2. Add values into Array
     3. Find Length of an Array
     4. Read single value from an array
     5. Read multiple values from an array.*/
    public static void main(String[] args) {
        // Declaring an Array
        // Approach 1 : Used when we have static values
        /*int a[] = new int[6];
        a[0] = 100;
        a[1] = 200;
        a[2] = 300;
        a[3] = 400;
        a[4] = 500;*/

        //Approach 2
        int a[]= {100,200,300,400,500}; // Used when dynamic values have to be declared.

        //Find length of an array
        System.out.println("Length of an array:"+a.length);

        //Read single value from an array
       /* System.out.println(a[2]);
        //Reading all values from array
        for(int i = 0;i<a.length;i++){
            System.out.println(a[i]);
        }*/
        //Enhanced for loop / for...each loop
        for(int x:a){
            System.out.println(x);
        }
    }
}
