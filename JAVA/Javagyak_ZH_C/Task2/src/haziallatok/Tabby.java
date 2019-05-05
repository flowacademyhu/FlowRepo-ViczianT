package haziallatok;

public class Tabby extends Cat {

    private int hitPower;

    public int getHitPower() {
        return hitPower;
    }

    public void setHitPower(int hitPower) {
        this.hitPower = 3;
    }

    public Tabby(int hitPower) {
        this.hitPower = hitPower;
    }

    public Tabby(double height, int legCount, int hitPower) {
        super(height, legCount);
        this.hitPower = hitPower;
    }

    @Override
    public String toString() {
        return "Tabby: " + super.toString() + " és ennyit üt: " + hitPower;
    }
}
