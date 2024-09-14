package model;

public class MayKhach {
    private Integer soMay;
    private Boolean hoatDong = false;

    public Integer getSoMay() {
        return soMay;
    }
    public void setSoMay(Integer somay) {
        this.soMay = somay;
    }

    public String getHoatDong() {
        if (hoatDong) {
            return "May dang hoat dong";
        }
        return "May chua hoat dong";
    }

    public void setHoatDong(Boolean hoatdong) {
        this.hoatDong = hoatdong;
    }

    public void showMayKhach() {
        System.out.println("So may: " + getSoMay());
        System.out.println("Tinh trang may: " + getHoatDong());
    }
}
