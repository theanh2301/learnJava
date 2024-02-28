import java.util.Scanner;
interface shape {
    public void chu_vi();
}

class Circle implements shape {
    int ban_kinh;
    public Circle(){}
    public int getBan_kinh() {
        return ban_kinh;
    }
    public void setBan_kinh(int ban_kinh) {
        this.ban_kinh = ban_kinh;
    }

    @Override
    public void chu_vi() {
        double C_Circle = ban_kinh*2*3.14;
        System.out.println("Chu vi hinh tron la: " + C_Circle);
    }
}

class Rectangle implements shape {
    int canh1, canh2, canh3;
    public Rectangle(){}
    public int getCanh1() {
        return canh1;
    }
    public int getCanh2() {
        return canh2;
    }
    public int getCanh3() {
        return canh3;
    }
    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }
    public void setCanh2(int canh2) {
        this.canh1 = canh2;
    }
    public void setCanh3(int canh3) {
        this.canh1 = canh3;
    }

    @Override
    public void chu_vi() {
        double C_Rectangle = canh1 + canh2 + canh3;
        System.out.println("Chu vi hinh tam giac la: " + C_Rectangle);
    }
}

class Triangle implements shape {
    int dai, rong;
    public Triangle(){}
    public int getDai() {
        return dai;
    }
    public int getRong() {
        return rong;
    }
    public void setDai(int dai) {
        this.dai = dai;
    }
    public void setRong(int rong) {
        this.rong = rong;
    }

    @Override
    public void chu_vi() {
        double C_HCN = (dai + rong) * 2;
        System.out.println("Chu vi hinh chu nhat la: " + C_HCN);
    }
}

// -----------------------------------------------------------------------
public class Shape{
    public static void main(String[] args) {
        while (1 == 1) {
            System.out.println("Ban can giup gi?");
            System.out.println("1. Tinh chu vi hinh tron.");
            System.out.println("2. Tinh chu vi hinh tam giac.");
            System.out.println("3. Tinh chu vi hinh chu nhat.");
            System.out.println("0. Thoat khoi chuong trinh");
            System.out.println("Nhap lua chon cua ban");
            Scanner myObj = new Scanner(System.in);
            int choose = myObj.nextInt();
            switch (choose)
            {
                case 1:
                    Circle myCircle = new Circle();
                    System.out.println("Nhap ban kinh hinh tron: ");
                    myCircle.setBan_kinh(myObj.nextInt());
                    myCircle.chu_vi();
                    break;
                case 2:
                    Rectangle myRectangle = new Rectangle();
                    System.out.println("Nhap canh cua tam giac: ");
                    myRectangle.setCanh1(myObj.nextInt());
                    System.out.println("Nhap canh cua tam giac: ");
                    myRectangle.setCanh2(myObj.nextInt());
                    System.out.println("Nhap canh cua tam giac: ");
                    myRectangle.setCanh3(myObj.nextInt());
                    myRectangle.chu_vi();
                    break;
                case 3:
                    Triangle myTriangle = new Triangle();
                    System.out.println("Nhap chieu dai: ");
                    myTriangle.setDai(myObj.nextInt());
                    System.out.println("Nhap chieu rong: ");
                    myTriangle.setRong(myObj.nextInt());
                    myTriangle.chu_vi();
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
