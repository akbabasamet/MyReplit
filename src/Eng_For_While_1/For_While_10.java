package Eng_For_While_1;

public class For_While_10 {
    /*
        Write a Program to find the sum of natural numbers from 1 to 100.

    OUTPUT : Sum of Natural Numbers 5050
     */
    public static void main(String[] args) {
        int toplam=0;
        for(int i=1; i<=100; i++){
            toplam+=i;
        }
        System.out.println(toplam);

    }
}
