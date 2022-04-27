package Eng_Method_Array;

public class Method_Array_1 {
    /*
    Write a return method to reverse number.

Input : 12345

Output : 54321
     */
    public static void main(String[] args) {


        int arr[] = {1, 2, 3, 4, 5};
        tersCevirme(arr);
        System.out.println(tersCevirme(arr));

    }

    private static String tersCevirme(int[] arr) {
        String str = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            str += arr[i];

        }
        return str;
    }
}
