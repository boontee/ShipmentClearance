package org.acme.cc_approval.model;

public class Item {
    String name;
    Integer quantity;
    Integer unitPrice;
    Integer totalPrice;
    public Item(String name, Integer quantity, Integer unitPrice, Integer totalPrice) {
        this.name = name;
        this.quantity = quantity;
        this.unitPrice = unitPrice;
        this.totalPrice = totalPrice;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getQuantity() {
        return quantity;
    }
    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }
    public Integer getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(Integer unitPrice) {
        this.unitPrice = unitPrice;
    }
    public Integer getTotalPrice() {
        return totalPrice;
    }
    public void setTotalPrice(Integer totalPrice) {
        this.totalPrice = totalPrice;
    }
    @Override
    public String toString() {
        return "Item [name=" + name + ", quantity=" + quantity + ", unitPrice=" + unitPrice + ", totalPrice="
                + totalPrice + "]";
    }
}
