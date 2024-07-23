package com.example.buysell.models;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Setter
@Getter
@AllArgsConstructor
public class product {
    private long id;
    private String title;
    private String description;
    private int price;
    private String city;
    private String author;
}
