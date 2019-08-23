package com.example.database;

public class Product {
    private int _id;
    private String _productname;
    private int _quantity;

    public Product() {

    }

    public Product(int id, String productname, int quantity) {
        this._id = id;
        this._productname = productname;
        this._quantity = quantity;
    }

    public Product(String productname, int quantity) {
        this._productname = productname;
        this._quantity = quantity;
    }

    public void setID(int id) {
        this._id = id;
    }

    public int getID() {
        return this._id;
    }

    public void setProductname(String productname) {
        this._productname = productname;
    }


    public String getProductname() {
        return this._productname;
    }

    public void setQuantity(int quantity) {
        this._quantity = quantity;
    }

    public int getQuantity() {
        return this._quantity;
    }
}
