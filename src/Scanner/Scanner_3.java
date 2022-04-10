package Scanner;

import java.util.Scanner;

public class Scanner_3 {
    /*
    Kullanıcıdan dikdörtgenin kenar uzunluklarını alın ve dikdörtgenin alanını ve çevresini konsola yazdıran bir program yazın.

        Örnek Çıktı:

        Alan: 32

        Çevre: 24
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("1.uzun kenari giriniz");
        double uzunKenar=scan.nextDouble();
        System.out.println("2.kisa kenari giriniz");
        double kisaKenar=scan.nextDouble();

        double alan=kisaKenar*uzunKenar;
        double cevre=2*(kisaKenar+uzunKenar);

        System.out.println("cevre : " + cevre + " alan : " + alan);

    }
}
