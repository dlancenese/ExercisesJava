package projects.dillon;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        //int array with 10 spots
        int[] myIntArray = new int[10];
        myIntArray[0] = 45;
        myIntArray[1] = 1;
        myIntArray[6] = 50;
        //double array with 10 spots
        double[] myDoubleArray = new double[10];
        myDoubleArray[2] = 3.5;
        System.out.println(myDoubleArray[2]);
        //array using array initializer
        int[] firstTen = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("first = " + firstTen[0]);
        int arrayLength = firstTen.length;
        System.out.println("length of array = " + arrayLength);
        System.out.println("last = " + firstTen[arrayLength - 1]);
        //array initializer only works if it is on the first line
        int[] newArray;
        //newArray = new int[]{5, 4, 3, 2, 1};
        newArray = new int[5];
        for(int i = 0; i < newArray.length; i++){
           newArray[i] = newArray.length - i;
        }
        for (int j : newArray) {
            System.out.print(j + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(newArray));
        Object objectVariable = newArray;
        if(objectVariable instanceof int[]){
            System.out.println("objectVariable is really an int array");
        }

        Object[] objectArray = new Object[3];
        objectArray[0] = "Hello";
        objectArray[1] = new StringBuilder("World");
        objectArray[2] = newArray;
    }
}
