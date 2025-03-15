public class TwoDimensional {
    public static void main(String[] args) {
        /*1. Declaring an Array
          2. Add values into Array
          3. Find Length of an Array
          4. Read single value from an array
          5. Read multiple values from an array.*/

        //Declaring Array
        //Approach 1
       /* int a[][] = new int[3][2];
        a[0][0] = 100;
        a[0][1] = 200;

        a[1][0] = 300;
        a[1][1] = 400;

        a[2][0] = 500;
        a[2][1] = 600;*/

        //Approach 2
        int a[][] = {{100, 200, 400},
                     {400, 500, 600},
                     {700, 400, 400},
                     {1000, 1100, 1200}  };
        int num = 400;
        int count = 0;
        //Find size of an array
        System.out.println("Length of rows: " + a.length);
        System.out.println("Length of column: " + a[0].length);

        //Read single value from an array
        System.out.println(a[2][1]); //600

        //Normal For loop / Nested for loop to read all values

        /*for (int r = 0; r <= a.length-1; r++) {
            for (int c = 0; c <= a[r].length-1; c++) {
                System.out.print(a[r][c] + " "); //a[0][0] a[0][1], a[1][0] a[1][1], a[2][0] a[2][1]
            }
            System.out.println();*/
            //Enhanced for loop
        for(int arr[]:a){
            for(int x:arr){
                if(x == num){  //System.out.print(x+" ");
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
