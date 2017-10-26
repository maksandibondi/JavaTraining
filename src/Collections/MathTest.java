package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.math.*;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.max;

public class MathTest {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i:a){
            i = abs(i);
            int maax = max(i,i);
        }

        String x = "1 "+"2 "+"-1 "+"-5 "+"4";
        System.out.print(x);
        char o =  x.charAt(1);
        System.out.print("\n" + o);
    }


}