package com.tutorials.springboot;

import com.tutorials.springboot.Algorithum.BinarySearchAlgorithum;
import com.tutorials.springboot.Interfaces.SortAlgorithum;

public class BinarySearchImpl {
    private SortAlgorithum sortAlgorithum ;
    public BinarySearchImpl(SortAlgorithum sortAlgorithum)
    {
        super();
        this.sortAlgorithum = sortAlgorithum;
    }
    public int binarySearch(int[] numbers, int numberToSearch)
    {
        //sorting
        System.out.println(sortAlgorithum);
        numbers = sortAlgorithum.sort(numbers);
        //finding index
        //return index
        return -1;

    }
}
