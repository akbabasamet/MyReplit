package Eng_Method_Array;

public class Method_Array_2 {
    /*
            Write a Java program that reverse a sentence by using Array (with all spaces and special characters).

        Input : Coding is greate.

        Output : .etaerg si gnidoC
     */
    public static void main(String[] args) {
        String str = "Coding is greate.";

        String arr[] = str.split("");

        String str1="";
        for (int i = arr.length-1; i >=0 ; i--) {
            str1+=arr[i];

        }
        System.out.println(str1);

    }
}
