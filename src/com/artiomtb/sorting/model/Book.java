package com.artiomtb.sorting.model;

import java.util.Date;

public class Book {
   private String name;
   private String authorName;
   private Date publishDate;

    public Book(Date publishDate, String authorName, String name) {
        this.publishDate = publishDate;
        this.authorName = authorName;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getAuthorName() {
        return authorName;
    }

    public Date getPublishDate() {
        return publishDate;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAuthorName(String authorName) {
        this.authorName = authorName;
    }

    public void setPublishDate(Date publishDate) {
        this.publishDate = publishDate;
    }

    @Override
    public String toString() {
        return "Book{" +
                "name='" + name + '\'' +
                ", authorName='" + authorName + '\'' +
                ", publishDate=" + publishDate +
                '}';
    }
}
