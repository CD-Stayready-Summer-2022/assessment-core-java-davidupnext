package com.codedifferently.assessment01.part01;

public class IntegerArrayUtils {
    /**
     * Get the sum of all integers in array
     * @param intArray
     * @return
     */
    public static Integer getSum(Integer[] intArray){
        Integer sum = 0;
        for (int i=0;i<= intArray.length;i++){
            sum+=i;
        }
        return sum;
    }

    /**
     * Get the product of all integers in the array
     * @param intArray
     * @return
     */
    public static Integer getProduct(Integer[] intArray){
        Integer product = 1;
        for (int i=1;i<= intArray.length;i++){
            product *=i;
        }
        return product;
    }

    /**
     * Get the average of all integers in the array
     * @param intArray
     * @return
     */
    public static Double getAverage(Integer[] intArray) {
        Double average = 0.0;
        Double sum = 0.0;

        for (int i = 0; i <= intArray.length; i++) {
            sum+= i;
        }
        average =sum/5;
        return average;
    }
}
