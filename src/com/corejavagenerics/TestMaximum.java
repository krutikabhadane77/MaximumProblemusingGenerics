//UC1 Given 3 Integers find the maximum
//UC2 Given 3 Floats find the maximum
package com.corejavagenerics;

public class TestMaximum {
    public static void getMaximumFloat(Float[] arr) {

        Float max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++) {
            int a = arr[i].compareTo(max);
            if (a > 0) {
                max = arr[i];
                position = i;
            }
        }
        System.out.println("Maximum integer is " + max+" and its position is "+position);
    }
    public static void main(String[] args) {
        Float[] arr = {2.3f,4.2f,7.5f};
        getMaximumFloat(arr);
    }

}