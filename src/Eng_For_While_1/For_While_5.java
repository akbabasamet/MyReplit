package Eng_For_While_1;

public class For_While_5 {
    /*
    Print even numbers from 20 to 0 but do not use decrement (i--).

OUTPUT : Even Numbers from 100 to 0 are: 20 18 16 14 12 10 8 6 4 2 0
     */
    public static void main(String[] args) {


        int sayi=20;
        while (sayi>=0){
            if(sayi%2==0){
                System.out.print(sayi+" ");
            }
            sayi--;
        }

    }
}
