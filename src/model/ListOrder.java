package model;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListOrder {
    private List<Order> listOrder;
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

    public void addListOrder(Scanner sc) {
        System.out.print("Nhap so order muon them: ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            Order order = new Order();
            sc.nextLine();
            System.out.print("\nNhap ten do an: ");
            order.setTenDoAn(sc.nextLine());
            System.out.print("Nhap gia do an: ");
            order.setGiaDoAn(sc.nextDouble());
            sc.nextLine();
            System.out.print("Nhap ten do uong: ");
            order.setTenDoUong(sc.nextLine());
            System.out.print("Nhap gia do uong: ");
            order.setGiaDoUong(sc.nextDouble());
            addOrder(order);
        }
    }

}
