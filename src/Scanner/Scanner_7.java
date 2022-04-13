package Scanner;

import java.util.Scanner;

public class Scanner_7 {
    /*
    Kullanıcı tarafından girilen DOUBLE sayıyı tam sayıya çeviren bir program yazınız.
     */
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("double sayi giriniz");
        double sayi=scan.nextDouble();
        int yeniSayi=(int)sayi;
        System.out.println(yeniSayi);



    }
}
