import model.DocGiaList;
import model.InputValidator;
import model.SachList;

import java.util.Scanner;

public class Demo {
    public static Scanner sc = new Scanner(System.in);
    private static InputValidator inputValidator;

    public static void main(String[] args) {
        inputValidator = new InputValidator();
        SachList sachList = new SachList();
        DocGiaList docGiaList = new DocGiaList();

        while (true) {
            System.out.println("--------------------------------");
            System.out.println("Lua chon nguoi dung");
            System.out.println("1. Doc Gia");
            System.out.println("2. Thu Thu");
            System.out.println("0. Thoat");
            System.out.println("--------------------------------");
            System.out.print("Nhap lua chon cua ban: ");
            int choice = sc.nextInt();
            //int choice = inputValidator.readInt();
            switch (choice) {
                case 1 -> {
                    while (true) {
                        System.out.println("--------------------------------");
                        System.out.println("Toi co the giup gi duoc cho ban");
                        System.out.println("1. Hien thi thong tin nguoi dung");
                        System.out.println("2. Hien thi sach");
                        System.out.println("3. Muon sach");
                        System.out.println("4. Tra sach");
                        System.out.println("0. Thoat");
                        System.out.println("--------------------------------");
                        System.out.print("Nhap lua chon cua ban: ");
                        choice = inputValidator.readInt();
                        if (choice == 0) {
                            break;
                        }
                        switch (choice) {
                            case 1:
                                System.out.println("Case 1");
                                break;
                            case 2:
                                System.out.println("Case 2");
                                break;
                            case 3:
                                System.out.println("Case 3");
                                break;
                            case 4:
                                System.out.println("Case 4");
                                break;
                            default:
                                System.out.println("Hay nhap lua chon hop le: ");
                        }
                    }
                }

                case 2 -> {
                    while (true) {
                        System.out.println("--------------------------------");
                        System.out.println("Toi co the giup gi duoc cho ban");
                        System.out.println("1. Hien thi doc gia");
                        System.out.println("2. Them doc gia");
                        System.out.println("3. Xoa doc gia");
                        System.out.println("4. Hien thi sach");
                        System.out.println("5. Them sach ");
                        System.out.println("6. Xoa sach");
                        System.out.println("0. Thoat");
                        System.out.println("--------------------------------");
                        System.out.print("Nhap lua chon cua ban: ");
                        choice = inputValidator.readInt();
                        if (choice == 0) {
                            break;
                        }
                        switch (choice) {
                            case 1:
                                System.out.println("Case 1");
                                break;
                            case 2:
                                System.out.println("Case 2");
                                break;
                            case 3:
                                System.out.println("Case 3");
                                break;
                            case 4:
                                System.out.println("Case 4");
                                break;
                            case 5:
                                System.out.println("Case 5");
                                break;
                            case 6:
                                System.out.println("Case 6");
                                break;
                            default:
                                System.out.println("Hay nhap lua chon hop le: ");
                        }
                    }
                }
                case 0 -> {
                    System.out.println("Bye bye!");
                    System.exit(0);
                }
            }
        }



    }
}
