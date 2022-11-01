//UC1 Given 3 Integers find the maximum
//UC2 Given 3 Floats find the maximum
//UC3 Given 3 Strings find the maximum
//Refactor all the 3 to One Generic Method and find the maximum
//Refactor-2 to create Generic Class to take in 3 variables of Generic Type
package com.corejavagenerics;

public class TestMaximum {
    public static <T extends Comparable<T>> T getMax(T x, T y, T z) {
        T max = x;
        if (y.compareTo(max) > 0)
            max = y;
        if (z.compareTo(max) > 0)
            max = z;
        return max;
    }
    public static void main(String[] args) {
        getMax(10,40,20);
        System.out.println("Maximum integer is "+getMax(10,40,20));
        getMax(2.3f,4.2f,7.5f);
        System.out.println("Maximum float is "+getMax(2.3f,4.2f,7.5f));
        getMax("Apple", "Peach", "Banana");
        System.out.println("Maximum string is "+getMax("Apple", "Peach", "Banana"));

    }
}