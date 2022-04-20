package Eng_For_While_1;

public class For_While_4 {
    /*
    Write a return method that accepts an integer as input and calculates factorial and prints like output.

Input : 6

Output: 6!=65432*1=720
     */
    public static void main(String[] args) {
        int sayi=6;
        int fakt=1;
        for(int i=1; i<=sayi; i++){
            fakt*=i;

        }
        System.out.println(fakt);
    }
}
