package com.xpanxion.assignments.student;

import java.util.ArrayList;
import java.util.PrimitiveIterator;

public class Invoice {
    private ArrayList<Product> invoiceList;

    public Invoice(int n){
        this.invoiceList = new ArrayList<>();
    }
    public void addProduct(Product n){
        this.invoiceList.add(n);
    }
    public double getTotalCost(){
        double total = 0;
        for (Product product : invoiceList) {
            total += product.getPrice();
        }
        return total;
    }
}
