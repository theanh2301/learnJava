import model.ListOrder;

import java.util.Scanner;

public class Demo {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        /*ListOrder listOrder = new ListOrder();
        listOrder.addListOrder(sc);
        listOrder.displayOrder();*/
        while (true) {
        System.out.println("-----Menu-----");
        System.out.println("1. Danh sách đồ ăn nước uống");
        System.out.println("2. Thêm đồ ăn");
        System.out.println("3. Thêm đồ uống ");
        System.out.println("4. Hiển thị hóa đơn");
        System.out.println("0. Thoát");

        System.out.print("Mời lựa chọn ");
        String input = sc.nextLine();
        switch (input) {
            case "1": {
                System.out.println("case 1");
                break;
            }
            case "2": {
                System.out.println("case 2");
                break;
            }
            case "3": {
                System.out.println("case 3");
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
