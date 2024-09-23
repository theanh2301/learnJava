package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListTaiKhoan {
    private final List<TaiKhoan> taiKhoanList;

    public ListTaiKhoan() {
        this.taiKhoanList = new ArrayList<>();
    }

    public void addTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoanList.add(taiKhoan);
    }

    public void removeTaiKhoan(TaiKhoan taiKhoan) {
        this.taiKhoanList.remove(taiKhoan);
    }

    public void displayTaiKhoan() {
        if (taiKhoanList.isEmpty()) {
            System.out.println("Danh sach order trong!");
        } else {
            System.out.println("\nDanh sach order ");
            for (TaiKhoan taiKhoan: taiKhoanList) {
                taiKhoan.showTaiKhoan();
            }
        }
    }

    public void addTaiKhoanList(Scanner sc) {
        TaiKhoan taiKhoan = new TaiKhoan();
        sc.nextLine();
        System.out.print("Nhập id: ");
        taiKhoan.setIdTaiKhoan(sc.nextInt());
        System.out.print("Nhập tên khách hàng: ");
        taiKhoan.setTenKhachHang(sc.nextLine());
        System.out.print("Nhập tên tài khoản: ");
        taiKhoan.setTenTaiKhoan(sc.nextLine());
        System.out.print("Nhập mật khẩu: ");
        taiKhoan.setMatKhau(sc.nextLine());
    }

    public void removeTaiKhoanList(Scanner sc) {
        System.out.print("Nhập tên khách hàng muốn xóa: ");
        String input = sc.nextLine();
        for (TaiKhoan taiKhoan: taiKhoanList) {
            if (taiKhoan.getTenTaiKhoan().equals(input)) {
                removeTaiKhoan(taiKhoan);
                break;
            }
        }
    }
}
