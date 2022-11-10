package pong;

public class Paddle {
    int x;
    int y;
    int width = 10;

    public Paddle(int x, int y, int width) {
        this.x = x;
        this.y = y;
        this.width = width;
    }

    public void moveUp(int x, int y) {
        y = y - 1;
    }

    public void moveDown(int x, int y) {
        y = y + 1;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public int getWidth() {
        return width;
    }
}
