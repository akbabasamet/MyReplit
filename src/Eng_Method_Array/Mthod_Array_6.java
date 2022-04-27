package Eng_Method_Array;

public class Mthod_Array_6 {
    /*
        Write a method that accepts an integer array as input and prints the minimum and the maximum numbers from given array

    Input : {3,2,5,4,1,6}

    Output :

    min: 1

    max: 6
     */
    public static void main(String[] args) {


        int input[] = {3, 2, 5, 4, 1, 6};
        maxAndMinNum(input);

    }
    private static void maxAndMinNum(int[] input) {
        int min = input[0];
        int max = 0;
        for (int i = 0; i <input.length ; i++) {
            if (input[i]>max){
                max=input[i];
            }
            if (input[i]<min){
                min=input[i];
            }
        }
        System.out.println(min);
        System.out.println(max);
    }
}
