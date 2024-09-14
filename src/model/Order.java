package model;

public class Order {
    private String tenDoAn;
    private Double giaDoAn;
    private String tenDoUong;
    private Double giaDoUong;

    public Order() {}

    public Order(String tenDoAn, Double giaDoAn, String tenDoUong, Double giaDoUong) {
        this.tenDoAn = tenDoAn;
        this.giaDoAn = giaDoAn;
        this.tenDoUong = tenDoUong;
        this.giaDoUong = giaDoUong;
    }

    public String getTenDoAn() {
        return tenDoAn;
    }
    public void setTenDoAn(String tendoan) {
        this.tenDoAn = tendoan;
    }

    public Double getGiaDoAn() {
        return giaDoAn;
    }
    public void setGiaDoAn(Double giadoan) {
        this.giaDoAn = giadoan;
    }

    public String getTenDoUong() {
        return tenDoUong;
    }
    public void setTenDoUong(String tendouong) {
        this.tenDoUong = tendouong;
    }

    public Double getGiaDoUong() {
        return giaDoUong;
    }
    public void setGiaDoUong(Double giadouong) {
        this.giaDoUong = giadouong;
    }

    public void showOrder() {
        System.out.println(getTenDoAn() + " : " + getGiaDoAn());
        System.out.println(getTenDoUong() + " : " + getGiaDoUong());
    }
}

