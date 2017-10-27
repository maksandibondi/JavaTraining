package Algorithms;

import java.util.Arrays;
import java.util.Random;

/**
 * Created by Administrator on 10/27/2017.
 */
public class Sorting {
    public static void main(String[] args) {

        // Random fill and Sorting the array in multiple dimensions

        Random rand = new Random(); // new Random obj
        double[][] ar = new double[3][4]; // two-dim array

        for (int i = 0; i<ar.length; i++ ){
            for (int l = 0; l<ar[0].length; l++) {
                ar[i][l] = rand.nextDouble();
                //System.out.print(ar[i][l] + "\n");
            }
        }

        for(double[] k:ar) {
            Arrays.sort(k);
            for (double c:k) {
                System.out.print(c);
            }
            System.out.print("\n");
        }
    }
 }

