package org.example;

import org.example.model.ListOrder;

import java.util.Scanner;

public class Demo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ListOrder listOrder = new ListOrder();
        while (true) {
        System.out.println("-----Menu-----");
        System.out.println("1. Danh sách đồ ăn nước uống");
        System.out.println("2. Thêm đồ ăn");
        System.out.println("3. Thêm đồ uống ");
        System.out.println("4. Xoá Order");
        System.out.println("0. Thoát");

        System.out.print("Mời lựa chọn ");
        String input = sc.nextLine();
        switch (input) {
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
                System.out.println("case 3");
                listOrder.removeOrderList(sc);
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
