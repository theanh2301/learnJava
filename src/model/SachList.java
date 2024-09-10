package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SachList {
    private List<Sach> sachList;

    public SachList() { this.sachList = new ArrayList<>(); }

    public void addSach(Sach s) { this.sachList.add(s); }

    public void removeSach(Sach s) { this.sachList.remove(s); }

    public void displaySach() {
        int i = 1;
        if (sachList.isEmpty()) {
            System.out.println("Khong co quyen sach nao");
        } else {
            for (Sach s: sachList) {
                System.out.println("\nQuyen sach thu " + i);
                s.showSach();
                i++;
            }
        }
    }

    public void themSach(Scanner sc) {
        System.out.print("Nhap so sach can them: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Sach s = new Sach();
            sc.nextLine();
            System.out.print("\nNhap ten sach: ");
            s.setTenSach(sc.nextLine());
            System.out.print("Nhap tac gia: ");
            s.setTenTacGia(sc.nextLine());
            System.out.print("Tai ban lan thu: ");
            s.setTaiBan(sc.nextInt());
            addSach(s);
        }

    }

    public void xoaSach(Scanner sc) {
        System.out.print("Nhap ten sach can xoa");
        String input = sc.nextLine();
        for(Sach s: sachList) {
            if (s.getTenSach().equals(input)) {
                removeSach(s);
                System.out.println("Xoa thanh cong");
                break;
            }
        }
    }

    public void capNhatSach(Scanner sc) {
        System.out.print("Nhap ten sach muon thay doi: ");
        String input = sc.nextLine();

        for (Sach s: sachList) {
            if (s.getTenSach().equals(input)) {
                removeSach(s);
                s = new Sach();
                sc.nextLine();
                System.out.print("\nNhap ten sach: ");
                s.setTenSach(sc.nextLine());
                System.out.print("Nhap tac gia: ");
                s.setTenTacGia(sc.nextLine());
                System.out.print("Tai ban lan thu: ");
                s.setTaiBan(sc.nextInt());
                addSach(s);
                System.out.println("Cap nhat sach thanh cong");
                break;
            }
        }
    }

    public void timKiemSach(Scanner sc) {
        System.out.print("Nhap ten sach can tìm: ");
        String input = sc.nextLine();
        for (Sach s: sachList) {
            if (s.getTenSach().equals(input)) {
                s.showSach();
            }
        }
    }

    ArrayList<Sach> muonList = new ArrayList<>();


    public void muonSach(Scanner sc) {
        System.out.print("Nhap ten sach muon muon: ");
        String input = sc.nextLine();
        for (Sach sach: sachList) {
            if (sach.getTenSach().equals(input)) {
                sach.setMuonTraSach(true);
                System.out.println("Muon sach thanh cong!");
            }
        }
    }

    public void traSach(Scanner sc) {
        System.out.print("Nhap ten sach muon tra: ");
        String input = sc.nextLine();
        for (Sach sach: sachList) {
            if (sach.getTenSach().equals(input)) {
                sach.setMuonTraSach(false);
                System.out.println("Tra sach thanh cong!");
            }
        }
    }

}
