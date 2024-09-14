import model.ListOrder;

import java.util.Scanner;

public class Demo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        ListOrder listOrder = new ListOrder();
        listOrder.addListOrder(sc);
        listOrder.displayOrder();
    }
}
