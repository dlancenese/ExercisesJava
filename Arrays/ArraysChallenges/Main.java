package projects.dillon;

import java.util.Arrays;
import java.util.Random;

public class Main {
    //Create a program that sorts a list of integers in descending order.
    //50, 25, 80, 5, 15 ---> 80, 50, 25, 15, 5
    public static void main(String[] args) {
        int[] arr = getRandomArray(5);
        //unsorted array
        System.out.println(Arrays.toString(arr));
        //sorted ascending order
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        //sorted descending order
        int[] reverse = new int[arr.length];
        int j = arr.length;
        for(int i = 0; i <= arr.length - 1; i++){
            reverse[j - 1] = arr[i];
            j = j - 1;
        }
        System.out.println(Arrays.toString(reverse));
    }


    private static int[] getRandomArray(int len){
        Random random = new Random();
        int[] newInt = new int[len];
        for(int i = 0; i < len; i++){
            newInt[i] = random.nextInt(1000);
        }
        return newInt;
    }
}
