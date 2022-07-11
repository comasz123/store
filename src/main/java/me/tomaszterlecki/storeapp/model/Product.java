package me.tomaszterlecki.storeapp.model;

public class Product {
    private int id;
    private String description;
    private double price;
    private int quantityOnStock;

    public Product() {
    }

    public Product(int id, String description, double price, int quantityOnStock) {
        this.id = id;
        this.description = description;
        this.price = price;
        this.quantityOnStock = quantityOnStock;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQuantityOnStock() {
        return quantityOnStock;
    }

    public void setQuantityOnStock(int quantityOnStock) {
        this.quantityOnStock = quantityOnStock;
    }
}
