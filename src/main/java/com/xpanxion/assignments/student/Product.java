package com.xpanxion.assignments.student;

public class Product extends Base {
    private String name;
    private double price;

    @Override
    public String toString() {
        return "Product{" +
                "Id=" + super.getId() +
                ", name='" + name + '\'' +
                ", price=" + price +
                '}';
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return super.getId();
    }


    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Product(int id, String name, double price) {
        super(id);
        this.name = name;

        this.price = price;
    }
}
