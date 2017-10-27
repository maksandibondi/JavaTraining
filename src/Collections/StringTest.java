package Collections;

import java.util.Arrays;
import java.util.Random;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.max;


public class StringTest {
    public static void main(String[] args) {

        // Strings basic
        String n = "1 "+"2 "+"-1 "+"-5 "+"4";
        System.out.print(n);
        char o = n.charAt(1);
        System.out.print("\n" + o);

        // string immutability
        String s1 = "foo";
        String s2 = "bar";
        s2.concat(s1);
        System.out.print(s2 + "\n");
        s2 = s2.concat(s1);
        System.out.print(s2+ "\n");
        String s3 = "101.02";

        // parisng doubles from string
        double x = Double.parseDouble(s3);
        double f = x + 2;
        System.out.print(f + "\n");

        // splitting string to multiple values
        String s4 = "1 34 5 6 7 8";
        String[] a = s4.split("\\s");
        for(String k:a){
            System.out.print(k + " ");
        }

    }
}
