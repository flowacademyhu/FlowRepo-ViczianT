package butorgyar;

public class Butorlap {

    private double length;
    private double width;
    private boolean isTartolap;

    final int pricePerTartolap = 5000;
    final int pricePerHatlap = 500;

    public Butorlap(double length, double width, boolean isTartolap) {
        this.length = length / 100;
        this.width = width / 100;
        this.isTartolap = isTartolap;
    }

    public int getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public boolean getisTartolap() {
        return this.isTartolap;
    }

    public void setisTartolap(boolean isTartolap) {
        this.isTartolap = isTartolap;
    }

    public double arSzamol() {
        if (this.isTartolap) {
            return (length * width) / pricePerHatlap;
        } else {
            return (length * width) / pricePerTartolap;
        }
    }
}
