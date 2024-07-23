package com.example.buysell.services;

import com.example.buysell.models.product;
import lombok.Getter;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProductService {
    @Getter
    private List<product> products = new ArrayList<>();
    private long ID = 0;

    {
        products.add(new product(++ID, "Playstation 4", "simple discription", 67000, "Ashgabat", "Oraz"));
        products.add(new product(++ID, "Playstation 5", "simple discription", 420000, "Moscow", "Oraz"));
        products.add(new product(++ID, "Iphone 15", "simple discription", 120000, "USA", "Oraz"));

    }

    public void saveProduct(product product) {
        product.setId(++ID);
        products.add(product);
    }

    public void deleteProduct(long id) {
        products.removeIf(product -> product.getId() == id);
    }

    public product getById(long id) {
        for (product product : products) {
            if (product.getId() == id) return product;
        }
        return null;
    }
}
