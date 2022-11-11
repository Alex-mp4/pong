package pong;

public class Boll {
    int x;
    int y;
    int vx;
    int vy;

    public Boll(int x, int y, int vx, int vy) {
        this.x = x;
        this.y = y;
        this.vx = 1;
        this.vy = 1;
    }

    public void move() {
        x = x + vx;
        y = y + vy;
    }

    public void bounce() {
        vy *= -1;
    }

    public void bouncePaddle() {
        vx *= -1;
    }
}
