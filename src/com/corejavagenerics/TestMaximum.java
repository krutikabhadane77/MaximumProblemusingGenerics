//UC1 Given 3 Integers find the maximum
//UC2 Given 3 Floats find the maximum
//UC3 Given 3 Strings find the maximum
//Refactor all the 3 to One Generic Method and find the maximum
package com.corejavagenerics;

public class TestMaximum {
    public static <T extends Comparable<T>> void getMax(T[] arr) {
        T max = arr[0];
        int position = 0;
        for (int i = 0; i < arr.length; i++)
        {
            int a = arr[i].compareTo(max);
            if(a > 0)
            {
                max = arr[i];
                position = i;
            }
        }
        System.out.println("Maximum element is " + max+" and its position is "+position);
    }
    public static void main(String[] args) {
        Integer[] integerArray = {10, 40, 20};
        getMax(integerArray);
        Float[] floatArray = {2.3f,4.2f,7.5f};
        getMax(floatArray);
        String[] stringArray = {"Apple", "Peach", "Banana"};
        getMax(stringArray);
    }
}