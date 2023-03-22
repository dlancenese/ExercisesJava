public class Sum3and5Challenge {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;
        for(int i = 1; i <= 1000; i++){
            if(i % 3 == 0 && i % 5 == 0) {
                count++;
                sum += i;
                System.out.println(i + " can be divided by both 3 and 5");
            }
            if(count == 5){
                break;
            }
        }
        System.out.println(sum + " is the sum of the first 5 numbers that can be divided by 3 and 5!");
    }
}
