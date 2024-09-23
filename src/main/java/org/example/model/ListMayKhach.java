package org.example.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListMayKhach {
    private List<MayKhach> mayKhachList;

    public ListMayKhach() {
        this.mayKhachList = new ArrayList<>();
    }


    public void displayMayKhach() {
        if (mayKhachList.isEmpty()) {
            System.out.println("Danh sach order trong!");
        } else {
            for (MayKhach mayKhach: mayKhachList) {
                mayKhach.showMayKhach();
            }
        }
    }

    public void kichHoatMay(Scanner sc) {
        System.out.print("Nhập số máy muốn chơi: ");
        int n = sc.nextInt();
        for (MayKhach mayKhach: mayKhachList) {
            if (mayKhach.getSoMay().equals(n)) {
                mayKhach.setHoatDong(true);
                System.out.println("Máy tính đang hoạt động!");
            }
        }
    }
}
