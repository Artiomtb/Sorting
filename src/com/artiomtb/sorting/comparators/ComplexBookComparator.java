package com.artiomtb.sorting.comparators;

import com.artiomtb.sorting.model.Book;

import java.io.Serializable;
import java.util.Comparator;

public class ComplexBookComparator implements Comparator<Book>, Serializable {
    @Override
    public int compare(Book book1, Book book2) {
        int result = book1.getPublishDate().compareTo(book2.getPublishDate());
        if (result == 0) {
            result = book1.getAuthorName().compareTo(book2.getAuthorName());
        }
        if (result == 0) {
            result = book1.getName().compareTo(book2.getName());
        }
        return result;
    }
}
