package org.example.model;

public class HoaDon {
    private String tenKhachHang;
    private Integer soMay;
    private String tenOrder;

    private Double giaOrder;

    public HoaDon() {}

    public HoaDon(String tenKhachHang, Integer soMay, String tenOrder, Double giaOrder) {
        this.tenKhachHang = tenKhachHang;
        this.soMay = soMay;
        this.tenOrder = tenOrder;
        this.giaOrder = giaOrder;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }
    public void setTenKhachHang(TaiKhoan tk) {
        this.tenKhachHang = tk.getTenKhachHang();
    }

    public Integer getSoMay() {
        return soMay;
    }
    public void setSoMay(MayKhach mk) {
        this.soMay = mk.getSoMay();
    }
    public String getTenOrder() {
        return tenOrder;
    }
    public void setTenOrder(Order od) {
        this.tenOrder = od.getTen();
    }

    public Double getGiaOrder() {
        return giaOrder;
    }
    public void setGiaOrder(Double giaOrder) {
        this.giaOrder = giaOrder;
    }

    public void displayHoaDon() {
        System.out.println("------HOA DON------");
        System.out.println("khach hang: " + getTenKhachHang());
        System.out.println("So may: " + getSoMay());
        System.out.println(getTenOrder() + " : " + getGiaOrder());
    }


}