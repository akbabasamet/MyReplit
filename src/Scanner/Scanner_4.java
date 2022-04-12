package Scanner;

import java.util.Scanner;

public class Scanner_4 {
    /*
            Kullanıcıya günde ne kadar çay içtiğini ve ne kadar şeker kullandığını sorun. Yılda kaç kg şeker kullandığını hesaplayın ve yazdırın.

        1 şeker = 1.7 gr

        Örnek Çıktı:

        Yılda 12.41 kg şeker kullanıyor.
     */
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("Gunde ne kadar cay iciyorsunuz");
        int bardak=scan.nextInt();
        System.out.println("Her bardaga ne kadar seker atiyorsunuz");
        int seker=scan.nextInt();
        double yillikSeker=bardak*seker*1.7*365;
        System.out.println("yilda " + yillikSeker + " gr seker kullaniyorsunuz");




    }
}
