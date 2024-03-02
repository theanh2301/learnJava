package model;

public class Triangle implements IShape {
    int canh1, canh2, canh3;

    public int getCanh1() {
        return canh1;
    }

    public void setCanh1(int canh1) {
        this.canh1 = canh1;
    }

    public int getCanh2() {
        return canh2;
    }

    public void setCanh2(int canh2) {
        this.canh1 = canh2;
    }

    public int getCanh3() {
        return canh3;
    }

    public void setCanh3(int canh3) {
        this.canh1 = canh3;
    }

    @Override
    public void Chu_vi() {
        double C_Triangle = canh1 + canh2 + canh3;
        System.out.println("Chu vi hinh tam giac la: " + C_Triangle);
    }
}
