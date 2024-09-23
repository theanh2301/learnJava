package org.example.model;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOrder {
    private final List<Order> listOrder;
    public ListOrder() {
        this.listOrder = new ArrayList<>();
    }

    public void addOrder(Order order) {
        this.listOrder.add(order);
    }

    public void removeOrder(Order order) {
        this.listOrder.remove(order);
    }

    public void displayOrder() {
        if (listOrder.isEmpty()) {
            System.out.println("Danh sach order trong!");
        } else {
            System.out.println("\nDanh sach order ");
            for (Order order: listOrder) {
                order.showOrder();
            }
        }
    }

    public void addDoAn(Scanner sc) {
        System.out.print("Nhập số đồ ăn muốn thêm ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Order order = new DoAn();
            sc.nextLine();
            System.out.print("Nhập tên đồ ăn: ");
            order.setTen(sc.nextLine());
            System.out.print("Nhập giá đồ ăn: ");
            order.setGia(sc.nextDouble());
            addOrder(order);
        }
    }

    public void addDoUong(Scanner sc) {
        System.out.print("Nhập số đồ uống muốn thêm: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Order order = new DoUong();
            sc.nextLine();
            System.out.print("Nhập tên đồ uống: ");
            order.setTen(sc.nextLine());
            System.out.print("Nhập giá đồ uống: ");
            order.setGia(sc.nextDouble());
            addOrder(order);
        }
    }

    public void removeOrderList(Scanner sc) {
        System.out.print("Nhâp tên đồ ăn/ đồ uống muốn xóa");
        String input = sc.nextLine();
        for (Order order: listOrder) {
            if (order.getTen().equals(input)) {
                removeOrder(order);
                break;
            }
        }
    }


}
