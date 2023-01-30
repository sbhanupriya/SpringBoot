package com.tutorials.springboot.Algorithum;

import com.tutorials.springboot.Interfaces.SortAlgorithum;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class QuickSortAlgorithum implements SortAlgorithum {
    public int[] sort(int[] numbers)
    {
        //sort
        return numbers;
    }
}
