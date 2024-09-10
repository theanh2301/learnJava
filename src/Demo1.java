import model.DocGiaList;
import model.SachList;
import java.util.Scanner;


public class Demo1 {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
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
            String choice = sc.nextLine();
            switch (choice) {
                case "1" -> {
                    System.out.println("Case 1");
                    while (true) {
                        System.out.println("--------------------------------");
                        System.out.println("Toi co the giup gi duoc cho ban");
                        System.out.println("1. Hien thi thong tin nguoi dung");
                        System.out.println("2. Hien thi sach");
                        System.out.println("3. Muon sach");
                        System.out.println("4. Tra sach");
                        System.out.println("0. Thoat");
                        System.out.println("--------------------------------");
                        sc.nextLine();
                        System.out.print("Nhap lua chon cua ban: ");
                        choice = sc.nextLine();
                        if (choice.equals("0")) {
                            break;
                        }
                        switch (choice) {
                            case "1":
                                System.out.println("Case 1");
                                docGiaList.displayDocGia();
                                break;
                            case "2":
                                System.out.println("Case 2");
                                sachList.displaySach();
                                break;
                            case "3":
                                System.out.println("Case 3");
                                sachList.muonSach(sc);
                                break;
                            case "4":
                                System.out.println("Case 4");
                                sachList.traSach(sc);
                                break;
                            default:
                                System.out.println("Hay nhap dung lua chon: ");
                                break;
                        }
                    }
                }
                case "2" -> {
                    System.out.println("Case 2");
                    while (true) {
                        System.out.println("--------------------------------");
                        System.out.println("Toi co the giup gi duoc cho ban");
                        System.out.println("1. Hien thi doc gia");
                        System.out.println("2. Them doc gia");
                        System.out.println("3. Xoa doc gia");
                        System.out.println("4. Hien thi sach");
                        System.out.println("5. Them sach ");
                        System.out.println("6. Xoa sach");
                        System.out.println("7. Cap nhat sach");
                        System.out.println("0. Thoat");
                        System.out.println("--------------------------------");
                        sc.nextLine();
                        System.out.print("Nhap lua chon cua ban: ");
                        choice = sc.nextLine();
                        if (choice.equals("0")) {
                            break;
                        }
                        switch (choice) {
                            case "1":
                                System.out.println("Case 1");
                                docGiaList.displayDocGia();
                                break;
                            case "2":
                                System.out.println("Case 2");
                                docGiaList.themDocGia(sc);
                                break;
                            case "3":
                                System.out.println("Case 3");
                                docGiaList.xoaDocGia(sc);
                                break;
                            case "4":
                                System.out.println("Case 4");
                                sachList.displaySach();
                                break;
                            case "5":
                                System.out.println("Case 5");
                                sachList.themSach(sc);
                                break;
                            case "6":
                                System.out.println("Case 6");
                                sachList.xoaSach(sc);
                                break;
                            case "7":
                                System.out.println("Case 7");
                                sachList.capNhatSach(sc);
                                break;
                            default:
                                System.out.println("Hay nhap dung lua chon: ");
                                break;
                        }
                    }
                }
                case "0" -> {
                    System.out.println("Bye Bye! ^ ^");
                    System.exit(0);
                }


            }


        }
    }
}
