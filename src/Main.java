import model.Circle;
import model.Rectangle;
import model.Triangle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            System.out.println("\nBan can giup gi?");
            System.out.println("1. Tinh chu vi hinh tron.");
            System.out.println("2. Tinh chu vi hinh tam giac.");
            System.out.println("3. Tinh chu vi hinh chu nhat.");
            System.out.println("0. Thoat khoi chuong trinh");
            System.out.println("Nhap lua chon cua ban");
            Scanner myObj = new Scanner(System.in);
            int choose = myObj.nextInt();
            Scanner myObj1 = new Scanner(System.in);

            switch (choose) {
                case 1:
                    Circle myCircle = new Circle();
                    System.out.println("Nhap ban kinh hinh tron: ");
                    myCircle.setBan_kinh(myObj1.nextInt());
                    myCircle.Chu_vi();
                    break;
                case 2:
                    Rectangle myRectangle = new Rectangle();
                    System.out.println("Nhap chieu dai: ");
                    myRectangle.setDai(myObj1.nextInt());
                    System.out.println("Nhap chieu rong: ");
                    myRectangle.setRong(myObj1.nextInt());
                    myRectangle.Chu_vi();
                    break;
                case 3:
                    Triangle myTriangle = new Triangle();
                    System.out.println("Nhap canh cua tam giac: ");
                    myTriangle.setCanh1(myObj1.nextInt());
                    System.out.println("Nhap canh cua tam giac: ");
                    myTriangle.setCanh2(myObj1.nextInt());
                    System.out.println("Nhap canh cua tam giac: ");
                    myTriangle.setCanh3(myObj1.nextInt());

                    myTriangle.Chu_vi();
                    break;
                case 0:
                    System.out.println("Bye bye");
                    System.exit(0);
                default:
                    System.out.println("Lua chon khong hop le.");
            }
        }
    }
}

