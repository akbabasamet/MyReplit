package Scanner;

import java.util.Scanner;

public class Scanner_6 {
    /*
    Kullanıcıdan bir Float değer girmesini isteyin, bu sayıyı short değişken tipine dönüştürün ve konsolda yazdırın.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir deger giriniz");
        float deger=scan.nextFloat();
        short degerYeni=(short) deger;
        System.out.println(degerYeni);


    }
}
