package pong;

public class Paddle {
    int x;
    int y;
    int width = 10;

    public Paddle(int x, int y, int width) {
        this.x = 5;
        this.y = 5;
        this.width = 10;
    }

    public void moveUp() {
        y = y - 1;
    }

    public void moveDown() {
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
