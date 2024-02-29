package root.model;

public class Rectangle implements Shape{
    int dai, rong;
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
    public void Chu_vi() {
        double C_Rectangle = (dai + rong) * 2;
        System.out.println("Chu vi hinh chu nhat la: " + C_Rectangle);
    }
}
