package model;

public class Sach {
    private String tenSach;
    private String tenTacGia;
    private Integer taiBan;
    private Boolean muonTraSach = false;

    public String getTenSach() {
        return tenSach;
    }
    public void setTenSach(String tenSach) {
        this.tenSach = tenSach;
    }

    public String getTenTacGia() {
        return tenTacGia;
    }
    public void setTenTacGia(String tenTacGia) {
        this.tenTacGia = tenTacGia;
    }

    public Integer getTaiBan() {
        return taiBan;
    }
    public void setTaiBan(Integer taiBan) {
        this.taiBan = taiBan;
    }


    public String getMuonTraSach() {
        if (muonTraSach) {
            return "Sach dang duoc muon";
        }
        return  "Sach chua duoc muon";
    }

    public void setMuonTraSach(Boolean muonTraSach) {
        this.muonTraSach = muonTraSach;
    }


    public void showSach() {
        System.out.println("Ten sach: " + getTenSach());
        System.out.println("Ten tac gia: " + getTenTacGia());
        System.out.println("Tai ban: " + getTaiBan());
        System.out.println("Tinh trang sach: " + getMuonTraSach());
    }
}
