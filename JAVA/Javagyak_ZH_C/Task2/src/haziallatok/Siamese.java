package haziallatok;

public class Siamese extends Cat {

    private boolean adorable;

    public boolean isAdorable() {
        return adorable;
    }

    public void setAdorable(boolean adorable) {
        this.adorable = adorable;
    }

    public Siamese(boolean adorable) {
        this.adorable = adorable;
    }

    public Siamese(double height, int legCount, boolean adorable) {
        super(height, legCount);
        this.adorable = adorable;
    }

    @Override
    public String toString() {
        return "Siamese: " + super.toString() + "és ennyire cuki: " + adorable;
    }
}
