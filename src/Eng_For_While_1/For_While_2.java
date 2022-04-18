package Eng_For_While_1;

import java.util.Scanner;

public class For_While_2 {
    /*
        Ask user to enter 2 integer then find GCD (Greatest Common Divisor) and LCM (Least Common Multiple)

    Input :

    30 and 40

    Expected OutPut:

    GCD for 30 and 40 = 10

    LCM for 30 and 40 = 120
     */
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);

        System.out.println("1.tam sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("2.tam sayiyi giriniz");
        int sayi2 = scan.nextInt();

        int ebob = 1;
        int ekok = 1;


        for (int i = 1; i <= sayi1 && i <= sayi2 ; i++) {
            if (sayi1 % i == 0 && sayi2 % i == 0) {
                ebob=i;
            }
            ekok=(sayi1*sayi2)/ebob;
        }
        System.out.println("ekok " + ekok);
        System.out.println("ebob" + ebob);


    }
}
