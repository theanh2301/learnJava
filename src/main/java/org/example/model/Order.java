package org.example.model;

public abstract class Order {
    private String ten;
    private Double gia;

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    public Double getGia() {
        return gia;
    }

    public void setGia(Double gia) {
        this.gia = gia;
    }

    public Order() {}

    public Order(String ten, Double gia) {
        this.ten = ten;
        this.gia = gia;
    }

    public void showOrder() {
        System.out.println(getTen()+ ": " + getGia());
    }
}

