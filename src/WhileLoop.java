public class WhileLoop {
    public static void main(String[] args) {
        //Example 1: While Loop
        /*int i = 1;
        while(i<=10){
            System.out.println(i);
            i++;
        }*/

        //Example 2: Print "Hello" message 10 times
        /*int i=1;
        while(i<=10){
            System.out.println("Hello");
            i++;
        }*/

        //Example 3: Print even number between 1 to 10
        //Approach 1
     /*   int i=2;
        while(i<=10){
            System.out.println(i);
            i+=2;                 // i=i+2;
        }*/

        //Approach 2
       /* int i=1;
        while(i<=10){
            if(i%2==0){
                System.out.println(i);
            }
            i++;
        }*/

        //Example 4: Print 1 to 10 number and print each number even or odd
      /*  int i=1;
        while(i<=10){
            if(i%2==0){
                System.out.println(i+" Even");
            }
            else{
                System.out.println(i+ " Odd");
            }
            i++;
        }*/

        //Example 5: Print numbers 10 to 1 in descending order

        int i = 10;
        while(i>0){
            System.out.println(i);
            i--;
        }
    }

}
