package Collections;

import java.lang.reflect.Array;
import java.util.*;
import java.util.Collections;
import java.util.Iterator;

public class ArrayTest{
    public static void main(String[] args) {
        // write your code here

        double[] x = new double[50];
        Arrays.fill(x,1);
        int i = 0;
        for (double k:x) {
            k = 1;
            System.out.print(k + "\n");
        }

    }
}