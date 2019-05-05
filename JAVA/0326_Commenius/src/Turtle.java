public class Turtle {

    private int posX;
    private int posY;
    private boolean tollStatus;
    private int gameAreaWidth;
    private int gameAreaHeight;

    public Turtle(int gameAreaWidth, int gameAreaHeight) {
        this.posX = 0;
        this.posY = 0;
        this.tollStatus = false;
        this.gameAreaWidth = gameAreaWidth;
        this.gameAreaHeight = gameAreaHeight;

    }

    public boolean move(String command) {
        // System.out.println(this.posX + " " + this.posY);
        switch (command) {
            case "JOBB":
                if (posX > gameAreaHeight || posY > gameAreaWidth) {
                     return false;
                 } else {
                    posY++;
                    return true;
                }
            case "BAL":
                if (posX > gameAreaHeight || posY > gameAreaWidth) {
                    return false;
                } else {
                    posY--;
                    return true;
                }
            case "LE":
                if (posX > gameAreaHeight || posY > gameAreaWidth) {
                    return false;
                } else {
                    posX++;
                    return true;
                }
            case "FEL":
                if (posX > gameAreaHeight || posY > gameAreaWidth) {
                    return false;
                } else {
                    posX--;
                    return true;
                }
        }
     return false;
    }

    public void changePen (boolean tollStatus) {
        this.tollStatus = tollStatus;
    }

    @Override
    public String toString() {
        return "Turtle{" +
                "posX=" + posX +
                ", posY=" + posY +
                ", Rajzolsz?" + tollStatus +
                ", gameAreaWidth=" + gameAreaWidth +
                ", gameAreaHeight=" + gameAreaHeight +
                '}';
    }

    public int getPosX() {
        return posX;
    }

    public void setPosX(int posX) {
        this.posX = posX;
    }

    public int getPosY() {
        return posY;
    }

    public void setPosY(int posY) {
        this.posY = posY;
    }

    public boolean isTollStatus() {
        return tollStatus;
    }

    public void setTollStatus(boolean tollStatus) {
        this.tollStatus = tollStatus;
    }

    public int getGameAreaWidth() {
        return gameAreaWidth;
    }

    public void setGameAreaWidth(int gameAreaWidth) {
        this.gameAreaWidth = gameAreaWidth;
    }

    public int getGameAreaHeight() {
        return gameAreaHeight;
    }

    public void setGameAreaHeight(int gameAreaHeight) {
        this.gameAreaHeight = gameAreaHeight;
    }
}