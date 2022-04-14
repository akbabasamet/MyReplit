package Scanner;

import java.util.Scanner;

public class Scanner_10 {
    /*
            Kullanıcıdan dakika girmesini isteyin, Dakikaları birkaç yıl ve gün sayısına dönüştürmek için bir Java programı yazın.

        INPUT:

        Dakika sayısı: 3456789

        OUTPUT :

        3456789 dakika yaklaşık 6 yıl 210 gündür
      */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("toplam dakika girin");
        int dakika=scan.nextInt();

        int biryilDakika=(365*24*60);
        int yil=dakika/biryilDakika;
        int artik=dakika%biryilDakika;
        int gun=artik/(24*60);

        System.out.println(yil + " yil " + gun + " gundur" );

    }
}

