public class WhileLoopChallengee {

    public static void main(String[] args) {
        int x = 4;
        int count = 0;
        int oddCount = 0;
        while(x <= 20){
            x++;
            if(isEvenNumber(x)){
                count++;
                System.out.println(x);
                if(count >= 5){
                    break;
                }
            }else{
                oddCount++;
            }
        }
        System.out.println("The total number of odd numbers found is " + oddCount);
        System.out.println("The total number of even numbers found is " + count);
    }

    public static boolean isEvenNumber(int number){
        return number % 2 == 0;
    }
}
