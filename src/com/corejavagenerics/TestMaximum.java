//UC1 Given 3 Integers find the maximum
//UC2 Given 3 Floats find the maximum
//UC3 Given 3 Strings find the maximum
//Refactor all the 3 to One Generic Method and find the maximum
//Refactor-2 to create Generic Class to take in 3 variables of Generic Type
//UC4 Extend the max method to take more than three parameters
//UC5 Extend the max method to also print the max to std out using Generic Method
package com.corejavagenerics;
import java.util.Arrays;
public class TestMaximum <T> {
    T[] typeArray;
    public TestMaximum(T[] typeArray)
    {
        this.typeArray = typeArray;
    }
    public TestMaximum()
    {

    }
    public static <T extends Comparable<T>> void getMax(TestMaximum testMaximum) {
        Arrays.sort(testMaximum.typeArray);
        T max = (T) testMaximum.typeArray[0];
        int position = 0;
        for (int i = 0; i < testMaximum.typeArray.length; i++)

        {
            T a = (T)testMaximum.typeArray[i];
            int b = a.compareTo(max);
            if(b > 0)
            {
                max = (T) testMaximum.typeArray[i];
                position = i;
            }
        }
        System.out.println("Maximum element is : "+max);
        System.out.println("Maximum string is " + max+" and its position is "+position);
        printArray(testMaximum.typeArray);

    }

    //Print the maximum
    public static void printArray(Object[] typeArray) {
        for (Object element : typeArray)
        {
            System.out.println(element+"  ");
        }
    }

    public static void main(String[] args) {
        TestMaximum testMaximum=new TestMaximum();
        Integer[] integerArray={10,20,40,60,30};
        Float[] floatArray={2.3f,4.2f,7.5f,8.5f,1.2f};
        String[] stringArray = {"Apple", "Peach", "Banana","Pineapple"};
        getMax(new TestMaximum(integerArray));
        getMax(new TestMaximum(floatArray));
        getMax(new TestMaximum(stringArray));
    }
}