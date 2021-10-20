package com.springmasterclass01.springmasterclass01;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {

    private final SortAlgorithm sortAlgorithm;

    public BinarySearchImpl(@Qualifier("bubbleSortAlgorithm") SortAlgorithm sortAlgorithm) {
        this.sortAlgorithm = sortAlgorithm;
    }

    public int binarySearch(int[] numbers, int numberToSearch) {
        int[] sortedNumbers = sortAlgorithm.sort(numbers);

        return 3;
    }
}
