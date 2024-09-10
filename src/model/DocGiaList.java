package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DocGiaList {
    private List<DocGia> docGiaList;

    public DocGiaList() { this.docGiaList = new ArrayList<>(); }

    public void addDocGia(DocGia docGia) { this.docGiaList.add(docGia); }

    public void removeDocGia(DocGia docGia) { this.docGiaList.remove(docGia); }

    public void displayDocGia() {
        int i = 1;
        if (docGiaList.isEmpty()) {
            System.out.println("Khong co doc gia nao!");
        } else {
            for (DocGia docGia: docGiaList) {
                System.out.println("Doc gia thu " + i);
                docGia.showDocGia();
                i++;
            }
        }
    }
    public void themDocGia(Scanner sc) {
        System.out.print("Nhap so doc gia muon them: ");
        int n = sc.nextInt();

        for (int  i = 0; i < n; i ++) {
            DocGia dg = new DocGia();sc.nextLine();
            System.out.print("\nNhap ten doc gia: ");
            dg.setTenDocGia(sc.nextLine());
            System.out.print("Nhap dia chi: ");
            dg.setDiaChi(sc.nextLine());
            System.out.print("Nhap so dien thoai: ");
            dg.setSoDienThoai(sc.nextInt());
            System.out.print("Nhap nam sinh: ");
            dg.setNamSinh(sc.nextInt());
            addDocGia(dg);

        }

    }

    public void xoaDocGia(Scanner sc) {
        System.out.print("Nhap ten doc gia muon xoa: ");
        String input = sc.nextLine();
        for (DocGia dg: docGiaList) {
            if (dg.getTenDocGia().equals(input)) {
                removeDocGia(dg);
                System.out.println("Xoa thanh cong!");
                break;
            }
        }
    }


}
