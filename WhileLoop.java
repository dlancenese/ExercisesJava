public class WhileLoop {
    //While loop and DoWhile loop examples
    //While loop runs until false or never if it is false
    //Do while loop always runs through at least once

    public static void main(String[] args) {
        //basic for loop
        /*for(int i = 1; i <= 5; i++){
            System.out.println(i);
        }

        //while loop in comparison
        int j = 1;
        int x = 1;
        while(true){
            if(j > 5){
                break;
            }
            System.out.println(j);
            j++;
        }

        //Do While statement
        boolean isReady = false;
        do{
            if(x > 5){
                break;
            }
            System.out.println(x);
            x++;
            isReady = (x > 0);
        }while(isReady);*/


        //continue use to skip during certain iterations
        int number = 0;
        while(number < 50){
            number += 5;
            if(number % 25 == 0){
                continue;
            }
            System.out.print(number + "_");
        }

    }
}
