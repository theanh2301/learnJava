package model;

public class DocGia {
    public String tenDocGia;
    public String diaChi;
    public Integer soDienThoai;
    public Integer namSinh;

    public String getTenDocGia() {
        return tenDocGia;
    }
    public void setTenDocGia(String tenDocGia) {
        this.tenDocGia = tenDocGia;
    }

    public String getDiaChi() {
        return diaChi;
    }
    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public Integer getSoDienThoai() {
        return soDienThoai;
    }
    public void setSoDienThoai(Integer soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public Integer getNamSinh() {
        return namSinh;
    }
    public void setNamSinh(Integer namSinh) {
        this.namSinh = namSinh;
    }

    public void showDocGia() {
        System.out.println("Ten doc gia: " + getTenDocGia());
        System.out.println("Dia chi: " + getDiaChi());
        System.out.println("So dien thoai: " + getSoDienThoai());
        System.out.println("Nam sinh: " + getNamSinh());
    }
}
