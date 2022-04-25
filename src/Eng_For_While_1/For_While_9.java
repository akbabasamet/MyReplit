package Eng_For_While_1;

import java.util.Scanner;

public class For_While_9 {
    /*
            Write a java program to reverse the number which user entered.

        Input :1238
        Output :Reverse Of The Number: 8321
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz");
        int sayi= scan.nextInt();

        String str=String.valueOf(sayi);
        System.out.println(str);
        String tersStr="";

        for (int i = str.length()-1; i>=0 ; i--) {
            tersStr+=str.charAt(i);
        }
        System.out.println(tersStr);
        int tersSayi=Integer.valueOf(tersStr);
        System.out.println(tersSayi);

    }
}
