package com.example.buysell.models;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class product {
    private long id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;

    @Override
    public String toString() {
        return "product{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", city='" + city + '\'' +
                ", author='" + author + '\'' +
                '}';
    }

    public product() {
    }

    public product(long id, String title, String description, int price, String city, String author) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.price = price;
        this.city = city;
        this.author = author;
    }
}
