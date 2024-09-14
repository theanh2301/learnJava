package model;

public class HoaDon {
    private String tenKhachHang;
    private Integer soMay;
    private String tenDoAn;
    private Double giaDoAn;
    private String tenDoUong;
    private Double giaDoUong;

    public HoaDon() {}

    public HoaDon(String tenKhachHang, Integer soMay, String tenDoAn, Double giaDoAn, String tenDoUong, Double giaDoUong ) {
        this.tenKhachHang = tenKhachHang;
        this.soMay = soMay;
        this.tenDoAn = tenDoAn;
        this.tenDoUong = tenDoUong;
        this.giaDoAn = giaDoAn;
        this.giaDoUong = giaDoUong;
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

    public String getTenDoAn() {
        return tenDoAn;
    }
    public void setTenDoAn(Order od) {
        this.tenDoAn = od.getTenDoAn();
    }

    public Double getGiaDoAn() {
        return giaDoAn;
    }
    public void setGiaDoAn(Order od) {
        this.giaDoAn = od.getGiaDoAn();
    }

    public String getTenDoUong() {
        return tenDoUong;
    }
    public void setTenDoUong(Order od) {
        this.tenDoUong = od.getTenDoUong();
    }

    public Double getGiaDoUong() {
        return giaDoUong;
    }
    public void setGiaDoUong(Order od) {
        this.giaDoUong = od.getGiaDoUong();
    }

    public void displayHoaDon() {
        System.out.println("------HOA DON------");
        System.out.println("khach hang: " + getTenKhachHang());
        System.out.println("So may: " + getSoMay());
        System.out.println(getTenDoAn() + " : " + getGiaDoAn());
        System.out.println(getTenDoUong() + " : " +getGiaDoUong());
    }
}