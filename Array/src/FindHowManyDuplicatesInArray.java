public class FindHowManyDuplicatesInArray {
    public static void main(String[] args) {
        int a[] = {100,100,300,100,400,100};
        int num=100;
        int count=0;
        // for(int value:a){
        //     if (value == num){
        //     count++
        for(int i=0;i<a.length;i++){
            if(a[i]==num){
                count++;
            }
        }
        System.out.println("Number of times 100 appears in array is "+count);
    }
}
