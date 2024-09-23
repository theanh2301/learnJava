package org.example;

import org.example.model.ListMayKhach;
import org.example.model.ListOrder;
import org.example.model.ListTaiKhoan;

import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");
        ListMayKhach listMayKhach = new ListMayKhach();
        ListTaiKhoan listTaiKhoan = new ListTaiKhoan();
        ListOrder listOrder = new ListOrder();

        //Chọn giao diện máy chủ máy khách

        //Giao diện máy chủ
        System.out.println("-----Menu-----");
        System.out.println("1. Danh sách máy khách");
        System.out.println("2. Danh sách tài khoản");
        System.out.println("3. Thêm tài khoản");
        System.out.println("4. Xóa Tài Khoản");
        System.out.println("5. Danh sách đồ ăn nước uống");
        System.out.println("6. Thêm đồ ăn");
        System.out.println("7. Thêm đồ uống");
        System.out.println("8. Xóa đồ ăn/uống");
        System.out.println("9. Hiển thị hóa đơn");
        System.out.println("0. Thoát");

        System.out.print("Lựa chọn: ");
        String input1 = sc.nextLine();
        switch (input1) {
            case "1": {
                System.out.println("case 1");
                listMayKhach.displayMayKhach();
                break;
            }
            case "2": {
                System.out.println("case 2");
                listTaiKhoan.displayTaiKhoan();
                break;
            }
            case "3": {
                System.out.println("case 3");
                listTaiKhoan.addTaiKhoanList(sc);
                break;
            }
            case "4": {
                System.out.println("case 4");
                listTaiKhoan.removeTaiKhoanList(sc);
                break;
            }
            case "5": {
                System.out.println("case 5");
                listOrder.displayOrder();
                break;
            }
            case "6": {
                System.out.println("case 6");
                listOrder.addDoAn(sc);
                break;
            }
            case "7": {
                System.out.println("case 7");
                listOrder.addDoUong(sc);
                break;
            }
            case "8": {
                System.out.println("case 8");
                listOrder.removeOrderList(sc);
                break;
            }
            case "9": {
                System.out.println("case 9");
                break;
            }
            case "0": {
                System.exit(0);
                break;
            }
            default: {
                System.out.println("Hãy nhập đúng lựa chọn");
            }
        }
        //Hiển thị danh sách máy khách -> chọn máy trống (nếu tất cả các máy đều hoạt động thì thông báo hết máy

        //Giao diện đăng nhập -> kích hoạt máy
        System.out.println("-----Đăng nhập-----");
        System.out.println("Tên tài Khoản: ");
        System.out.println("Mât Khẩu: ");
        while (true) {
            //Vào giao diện máy khách
            System.out.println("-----Menu-----");
            System.out.println("1. Danh sách đồ ăn nước uống");
            System.out.println("2. Thêm đồ ăn");
            System.out.println("3. Thêm đồ uống ");
            System.out.println("4. Hiển thị hóa đơn");
            System.out.println("0. Thoát");

            System.out.print("Lựa chọn: ");
            String input2 = sc.nextLine();
            switch (input2) {
                case "1": {
                    System.out.println("case 1");
                    listOrder.displayOrder();
                    break;
                }
                case "2": {
                    System.out.println("case 2");
                    listOrder.addDoAn(sc);
                    break;
                }
                case "3": {
                    System.out.println("case 3");
                    listOrder.addDoUong(sc);
                    break;
                }
                case "4": {
                    System.out.println("case 4");
                    break;
                }
                case "0": {
                    System.exit(0);
                    break;
                }
                default: {
                    System.out.println("Hãy nhập đúng lựa chọn");
                }
            }
        }
    }
}