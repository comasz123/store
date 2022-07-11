package me.tomaszterlecki.storeapp.database;

import me.tomaszterlecki.storeapp.model.Product;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProductDatabase {
    private List<Product> products = new ArrayList<>();

    public ProductDatabase () {
        products.add(new Product(34, "Telewizor", 3500.00, 23));
        products.add(new Product(23, "Pralka", 1100.00, 30));
        products.add(new Product(12, "Aparat", 500.00, 230));
        products.add(new Product(11, "Słuchawki", 200.00, 300));
        products.add(new Product(212, "Kabel HDMI", 80.00, 300));
        products.add(new Product(100, "Głośniki", 340.00, 200));
    }

    public List<Product> getProducts() {
        return products;
    }
}
