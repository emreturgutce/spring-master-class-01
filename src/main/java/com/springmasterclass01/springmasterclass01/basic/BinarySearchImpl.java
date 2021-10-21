package com.springmasterclass01.springmasterclass01.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
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
