package com.company;


//I have an array of the numbers 1 to 100 in a random order.
// One of the numbers is missing.
// Write an algorithm to figure out what the number is missing.

public class Main {

    public static void main(String[] args) {
	// write your code here
        int a[] = {6,2,1,4,5};
        int miss = getMissingNo(a);
        System.out.println(miss);

    }

    public static int getMissingNo (int a[])
    {
        int n = a.length; // n is the length of the array
        int i, total;

        total  = (n+1)*(n+2)/2; // total should be n * (n+1)/2
                                // but numbers in array are from 1 instead of 0 so add 1 to both ns

        for ( i = 0; i< n; i++)
            total -= a[i];
        return total;
    }
}
