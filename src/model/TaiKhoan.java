package model;

public class TaiKhoan {
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
}
