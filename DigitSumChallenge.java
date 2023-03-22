public class DigitSumChallenge {
    public static void main(String[] args) {
        System.out.println(sumDigits(123456789));
    }

    public static int sumDigits(int number){
        int sumOfDigits = 0;
        if(number < 0){
            return -1;
        }
        while(number >= 1){
            sumOfDigits += (number % 10);
            number = number / 10;
        }
        return sumOfDigits;
    }
}
