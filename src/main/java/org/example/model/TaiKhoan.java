package org.example.model;

public class TaiKhoan {
    private int idTaiKhoan;

    public int getIdTaiKhoan() {
        return idTaiKhoan;
    }

    public void setIdTaiKhoan(int idTaiKhoan) {
        idTaiKhoan = idTaiKhoan;
    }

    private String tenTaiKhoan;
    private String tenKhachHang;
    private String matKhau;

    public String getTenTaiKhoan() {
        return tenTaiKhoan;
    }
    public void setTenTaiKhoan(String tentaikhoan) {
        this.tenTaiKhoan = tentaikhoan;
    }

    public String getMatKhau() {
        return matKhau;
    }
    public void setMatKhau(String matkhau) {
        this.matKhau = matkhau;
    }

    public String getTenKhachHang() {
        return tenKhachHang;
    }

    public void setTenKhachHang(String tenKhachHang) {
        this.tenKhachHang = tenKhachHang;
    }

    public void showTaiKhoan() {
        System.out.println("Id tài khoản: " + getIdTaiKhoan());
        System.out.println("Tên khách hàng: " + getTenKhachHang());
        System.out.println("Tên tai khoản: " + getTenTaiKhoan());
        System.out.println("Mật Khẩu: " + getMatKhau());
    }
}
