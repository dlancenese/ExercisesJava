public class SumOdd {
    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
    }
    public static boolean isOdd(int number){
        if(number < 0){
            return false;
        }
        else return number % 2 != 0;
    }

    public static int sumOdd(int start, int end){
        int sum = 0;

        if(start > end || start < 0){
            return -1;
        }
        for(int number = start; number <= end; number++){
            if(isOdd(number)){
                sum += number;
            }

        }
        return sum;
    }
}
