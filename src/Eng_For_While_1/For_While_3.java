package Eng_For_While_1;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class For_While_3 {
    /*
        Write a code that returns the duplicate chars in a String array.(interview Question)

    Input :

    String str=“Javaisalsoeasy”

    Output: [a, s]
     */
    public static void main(String[] args) {


        String str = "Javaisalsoeasy";
        String output = " ";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {

                if (str.charAt(i) == str.charAt(j)) {
                    if (!output.contains(str.substring(i, (i + 1))))
                        output += str.charAt(j) + " ";
                    break;
                }
            }
        }
        System.out.println(output);
    }
}
