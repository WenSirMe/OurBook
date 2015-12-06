package org.sssta.ourbook.model;



/**
 * Created by Heaven on 2015/12/6.
 */
public class Book {
    public final String name;
    public final String brief;
    public final String author;
    public final int price;
    public final int img;
    public final int wordCount;
    public final float evaluate;

    public Book(String name, String brief, String author, int price, int img, int wordCount, float evaluate) {
        this.name = name;
        this.brief = brief;
        this.author = author;
        this.price = price;
        this.img = img;
        this.wordCount = wordCount;
        this.evaluate = evaluate;
    }
}
