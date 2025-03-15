public class CountOccurance {
    public static void main(String[] args) {
        String s = "Java Programming with Java Selenium";
        int totallenght = s.length();
        int countafterremoving=s.replace("a","").length();
        int count = totallenght - countafterremoving;
        System.out.println("Occurance of character a is "+count);
    }
}
