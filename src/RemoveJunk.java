public class RemoveJunk {
    public static void main(String[] args) {
        String s = "@!@#*(!*@#&$())_)*(Welcome*(#@&#$ @*(&#$@#$To &@(*#&$@#$(*! Java";
        String s1 = "_)*(@#&$*(&(*Programe*(@#*$(@ *(@#&$(!#Code *()@&*#$(@#using*(@#$&* Java";
        s = s.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s);
        s1 = s1.replaceAll("[^a-zA-Z0-9]","");
        System.out.println(s1);
    }
}
