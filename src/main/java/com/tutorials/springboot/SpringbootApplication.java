package com.tutorials.springboot;

import com.tutorials.springboot.Algorithum.BinarySearchAlgorithum;
import com.tutorials.springboot.Algorithum.QuickSortAlgorithum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

        // LOOSE  COUPLING
		// Binary Search/Quick sort algo object created in Binary Search Impl
		// BinarySearchImpl binarySearch = new BinarySearchImpl();
		// int result = binarySearch.binarySearch(new int[]{1,2,3,45},8);

		// TIGHT COUPLING
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithum());
		int result = binarySearch.binarySearch(new int[]{1,2,3,4,5}, 4);
		System.out.println(result);
		//SpringApplication.run(SpringbootApplication.class, args);
	}

}
