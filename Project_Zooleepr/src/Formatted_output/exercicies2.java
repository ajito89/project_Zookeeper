package Formatted_output;

import java.util.Locale;

public class exercicies2 {
    public static void main(String[] args) {
        String name = "My name is %c. %s ";
        String age = "My age is %d ";
        String height = "My height is %.2fm";
        System.out.println(String.format(name + age + height, 'M', "Anderson", 22, 1.53));

        Locale.setDefault(Locale.ENGLISH);
        double pi = Math.PI;
        //write your code below
        //System.out.printf(String.valueOf(pi));
        String pio ="%.3f";
        String result = String.format(pio, pi);
        System.out.println(result);
    }

}
