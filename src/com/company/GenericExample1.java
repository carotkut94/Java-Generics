package com.company;

import java.util.ArrayList;

public class GenericExample1 {

    public static void main(String[] args) {

        // If no type provided to the array list, it can hold anything and no error would be thrown
        // ArrayList items = new ArrayList();

        // but if the item is defined with a type then it can only contain the Integer type of values
        ArrayList<Integer> items = new ArrayList<>();

        items.add(1);
        items.add(2);
        items.add(3);
        items.add(4);
        items.add(5);
        items.add(6);
        // In this case ArrayList can hold any sort of data, as no type for the array list is defined yet
        // So the method printDoubled would throw ClassCastException, as string cannot be casted to Integer
        // And this error will be thrown at run time only
        // items.add("Sidhant Rajora");

        //and if the array list is defined with the type, then above line would show error, so commented out.
        printDoubled(items);
    }
    // Changed the type for argument
    private static void printDoubled(ArrayList<Integer> a){
        // Changed Object to Integer
        for(Integer i : a)
        {
            // No force cast required
            System.out.println(i*2);
        }
    }
}
