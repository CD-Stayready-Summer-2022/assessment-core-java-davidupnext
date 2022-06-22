package com.codedifferently.assessment01.part04;

public class Jumper {

    /*
     * Complete the function below.
     */
    int arr[];
    public int jumps(int k, int j) {
        if (j == k) {
            return 1;
        }
        int minJumps = Integer.MAX_VALUE;
        int min = Integer.MAX_VALUE;
        for (int i = k + 1; i <= j
                && i <= j+ arr[j]; i++) {
            int jumps = jumps(k, j);
            if (jumps != Integer.MAX_VALUE && jumps + 1 < min)
                min = jumps + 1;
        }
        return min;
    }
}
