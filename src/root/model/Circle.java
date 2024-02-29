package root.model;

public class Circle implements Shape{
    int ban_kinh;
    public Circle(){}
    public int getBan_kinh() {
        return ban_kinh;
    }
    public void setBan_kinh(int ban_kinh) {
        this.ban_kinh = ban_kinh;
    }

    @Override
    public void Chu_vi() {
        double C_Circle = ban_kinh*2*3.14;
        System.out.println("Chu vi hinh tron la: " + C_Circle);
    }
}
