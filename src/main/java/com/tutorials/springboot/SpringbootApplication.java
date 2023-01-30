package com.tutorials.springboot;

import com.tutorials.springboot.Algorithum.BinarySearchAlgorithum;
import com.tutorials.springboot.Algorithum.QuickSortAlgorithum;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {

        // LOOSE  COUPLING
		// Binary Search/Quick sort algo object created in Binary Search Impl
		// BinarySearchImpl binarySearch = new BinarySearchImpl();
		// int result = binarySearch.binarySearch(new int[]{1,2,3,45},8);

		// TIGHT COUPLING
		System.out.println("Loose Coupling");
		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithum());
		int result = binarySearch.binarySearch(new int[]{1,2,3,4,5}, 4);
		System.out.println(result);
		System.out.println("Dependency Managed by Spring");
		ApplicationContext applicationContext = SpringApplication.run(SpringbootApplication.class, args);
		BinarySearchImpl binarySearchBean = applicationContext.getBean(BinarySearchImpl.class);
		result = binarySearchBean.binarySearch(new int[]{1,2,3,4,5}, 4);
		System.out.println(result);
	}

}
