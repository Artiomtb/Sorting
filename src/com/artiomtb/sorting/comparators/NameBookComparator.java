package com.artiomtb.sorting.comparators;

import com.artiomtb.sorting.model.Book;

import java.io.Serializable;
import java.util.Comparator;

public class NameBookComparator implements Comparator<Book>, Serializable {
    @Override
    public int compare(Book book1, Book book2) {
        return book1.getName().compareTo(book2.getName());
    }
}
