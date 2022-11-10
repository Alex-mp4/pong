package pong;

public class Pong {
    Paddle paddle1 = new Paddle();
    Paddle paddle2 = new Paddle();
    Boll boll = new Boll();
    int width;
    int height;

    public void update() {
        boll.move();
    }

    public void checkCollision() {
        if (boll.y == 0 || boll.y == height) {
            boll.bounce();
        }
    }
}
