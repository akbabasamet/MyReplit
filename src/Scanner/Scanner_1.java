package Scanner;

import java.util.Scanner;

public class Scanner_1 {
    public static void main(String[] args) {
        /*
        Kullanıcıdan bir sayı alın ve sayının küpünün yarısını konsola yazdıran bir program yazın.
         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Sayi giriniz");
        double sayi=scan.nextDouble();
        double yeniSayi=(sayi*sayi*sayi)/2;
        System.out.println(yeniSayi);


    }
}
