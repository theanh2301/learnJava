import java.util.Scanner;
interface demo1{
    public void chu_vi1();
}

class Circle1 implements demo1 {
    int ban_kinh1;
    public Circle1(){}
    public int getBan_kinh1() {
        return ban_kinh1;
    }
    public void setBan_kinh1(int ban_kinh1) {
        this.ban_kinh1 = ban_kinh1;
    }


    public void chu_vi1() {
        double C_Circle1 = ban_kinh1*2*3.14;
        System.out.println("Chu vi hinh tron la: " + C_Circle1);
    }
}
class Triangle1 implements demo1 {
    int dai1, rong1;
    public Triangle1(){}
    public int getDai1() {
        return dai1;
    }
    public int getRong1() {
        return rong1;
    }
    public void setDai1(int dai1) {
        this.dai1 = dai1;
    }
    public void setRong1(int rong1) {
        this.rong1 = rong1;
    }

    @Override
    public void chu_vi1() {
        double C_HCN1 = (dai1 + rong1) * 2;
        System.out.println("Chu vi hinh chu nhat la: " + C_HCN1);
    }
}

class Rectangle1 implements demo1 {
    int canh11, canh12, canh13;
    public Rectangle1(){}
    public int getCanh11() {
        return canh11;
    }
    public int getCanh12() {
        return canh12;
    }
    public int getCanh13() {
        return canh13;
    }
    public void setCanh11(int canh11) {
        this.canh11 = canh11;
    }
    public void setCanh12(int canh12) {
        this.canh12 = canh12;
    }
    public void setCanh13(int canh13) {
        this.canh13 = canh13;
    }

    @Override
    public void chu_vi1() {
        double C_Rectangle1 = canh11 + canh12 + canh13;
        System.out.println("Chu vi hinh tam giac la: " + C_Rectangle1);
    }
}

// -------------------------------------------------------------------------
public class demo{
    public static void main(String[] args){
        Circle1 tron = new Circle1();
        System.out.println("Nhap ban kinh: ");
        Scanner scanner = new Scanner(System.in);
        tron.setBan_kinh1(scanner.nextInt());
        tron.chu_vi1();

        Triangle1 HCN = new Triangle1();
        System.out.println("\nNhap chieu dai: ");
        HCN.setDai1(scanner.nextInt());
        System.out.println("Nhap chieu rong: ");
        HCN.setRong1(scanner.nextInt());
        HCN.chu_vi1();

        Rectangle1 tam_giac = new Rectangle1();
        System.out.println("\nNhap canh cua tam giac: ");
        tam_giac.setCanh11(scanner.nextInt());
        System.out.println("Nhap canh cua tam giac: ");
        tam_giac.setCanh12(scanner.nextInt());
        System.out.println("Nhap canh cua tam giac: ");
        tam_giac.setCanh13(scanner.nextInt());
        tam_giac.chu_vi1();
    }
}