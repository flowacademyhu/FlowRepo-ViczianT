package haziallatok;
public class Cat {

    private double height;
    private int legCount;

    public Cat() {
        this.height = 15.0;
        this.legCount = 4;
    }

    public Cat(double height, int legCount) {
        this.height = height;
        this.legCount = legCount;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getLegCount() {
        return legCount;
    }

    public void setLegCount(int legCount) {
        this.legCount = legCount;
    }

    @Override
    public String toString() {
        return "Marmagasság: " + height + " cm. Lábak száma: " + legCount;
    }
}
