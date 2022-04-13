package Scanner;

import java.util.Scanner;

public class Scanner_8 {
    /*
    Kullanıcıdan üç basamaklı bir sayı girmesini ve bu sayının basamaklarının toplamını bulmasını isteyin.

Örnek Çıktı:

Verilen tamsayının rakamları toplamı 10'dur.
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("uc basamakli sayi giriniz");
        int sayi=scan.nextInt();
        int basamak1=sayi%10;
        int sayi2=sayi/10;
        int basamak2=sayi2%10;
        int sayi3=sayi2/10;
        int basamak3=sayi3%10;
        System.out.println(basamak1+basamak2+basamak3);


    }
}
