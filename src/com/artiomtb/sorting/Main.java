package com.artiomtb.sorting;

import com.artiomtb.sorting.comparators.ComplexBookComparator;
import com.artiomtb.sorting.comparators.NameBookComparator;
import com.artiomtb.sorting.model.Book;

import java.util.Arrays;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Book[] list = {
                new Book(new Date(new Date().getTime() - 86400000 * 5), "First", "First Book"),
                new Book(new Date(new Date().getTime() - 86400000 * 4), "Second", "Second Book"),
                new Book(new Date(new Date().getTime() - 86400000 * 5), "Third", "Third Book"),
                new Book(new Date(new Date().getTime() - 86400000 * 3), "Fourth", "Fourth Book"),
                new Book(new Date(new Date().getTime() - 86400000 * 5), "Fifth", "Fifth Book"),
        };
        System.out.println("Before:");
        System.out.println(Arrays.asList(list));
        Sorter.sort(list, new NameBookComparator());
        System.out.println("After name sorting:");
        System.out.println(Arrays.asList(list));
        Sorter.sort(list, new ComplexBookComparator());
        System.out.println("After complex sorting:");
        System.out.println(Arrays.asList(list));
    }
}
