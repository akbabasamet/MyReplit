package Scanner;

import java.util.Scanner;

public class Scanner_9 {
    /*
            Girilen zamanı saniyeye çeviren bir program yazınız.

        Örnek Çıktı:

        1 saat 10 dakika 50 saniye ==>

        4250 saniye
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("saati giriniz");
        int saat=scan.nextInt();
        System.out.println("dakikayi giriniz");
        int dakika=scan.nextInt();
        System.out.println("saniyeyi giriniz");
        int saniye=scan.nextInt();
        int toplamSaniye=saat*3600+dakika*60+ saniye;
        System.out.println("toplamSaniye : " +toplamSaniye + " saniye");

    }
}
