package Collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.math.*;
import java.util.Arrays;
import java.util.Random;

import static java.lang.StrictMath.abs;
import static java.lang.StrictMath.max;

public class MathTest {
    public static void main(String[] args) {
        // Abs and Max
        int[] a = new int[10];
        for(int i:a){
            i = abs(i);
            int maax = max(i,i);
        }


        // Random fill and Sorting the array in multiple dimensions
        Random rand = new Random();
        double[][] ar = new double[3][4];
        for (int i = 0; i<ar.length; i++ ){
            for (int l = 0; l<ar[0].length; l++) {
                ar[i][l] = rand.nextDouble();
                System.out.print(ar[i][l] + "\n");
            }
        }
        for (double[] k:ar) {
            Arrays.sort(k);
        }
        for(double[] k:ar) {
            for (double c:k) {
                System.out.print(c);
            }
            System.out.print("\n");
        }
        }
    }
