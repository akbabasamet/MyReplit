package Scanner;

import java.util.Scanner;

public class Scanner_2 {
    /*
    Kullanıcıdan karenin kenar uzunluğunu alın ve karenin alanını ve çevresini konsola yazdıran bir program yazın.

        Ornek Cikti :

        Alan: 9

        Cevre: 12
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Karenin kenarini giriniz");
        double kenar=scan.nextDouble();

        double cevre=kenar*4;
        double alan=kenar*kenar;
        System.out.println("cevre : " + cevre);
        System.out.println("alan : " + alan);

    }
}
