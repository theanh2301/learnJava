import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Hello and welcome!");

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
        System.out.println("8. Thêm đồ ăn");
        System.out.println("9. Thêm đồ uống ");
        System.out.println("10. Hiển thị hóa đơn");
        System.out.println("0. Thoát");


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