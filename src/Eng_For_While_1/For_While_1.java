package Eng_For_While_1;

import java.util.Scanner;

public class For_While_1 {
    /*
            Ask user to enter a name and a character, then check how many times the character is repeated in the name using loops in the name

        e.g:

        char ch1= 'a' ;

        String name =“John came late"

        Expected Output: Number of a = 2
     */
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);

        System.out.println("bir isim giriniz");
        String isim=scan.nextLine();

        System.out.println("bir harf giriniz");
        char harf =scan.next().charAt(0);

        int sayac=0;
        for (int i=0 ; i<isim.length() ; i++){

            if(isim.charAt(i)==harf){
                sayac++;
            }

        }
        System.out.println(harf + " " + sayac + " adet");

    }

}
