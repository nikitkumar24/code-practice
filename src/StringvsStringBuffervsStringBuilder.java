public class StringvsStringBuffervsStringBuilder {
    public static void main(String[] args) {

        //String - immutable
        /*String s = "Welcome";
        s.concat("to java");
        System.out.println(s); //Welcome //immutable, cannot change original value of s
         */



        //StringBuffer - Mutable

        /*StringBuffer s = new StringBuffer("Learning ");
        s.append("Java Language");
        System.out.println(s); //Mutable we can change original value of s*/

        //StringBuilder - mutable

        StringBuilder s = new StringBuilder("What is ");
        s.append("wrong with this language");
        System.out.println(s); //Mutable we can change original value of s
    }
}
