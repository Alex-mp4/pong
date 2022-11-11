package pong;

public class Pong {
    Paddle paddle1 = new Paddle(5, 5, 10);
    Paddle paddle2 = new Paddle(15, 15, 10);
    Boll boll = new Boll(10, 10, 1, 1);
    int width;
    int height;

    public void update() {
        boll.move();
        checkCollision();
    }

    public void checkCollision() {
        if (boll.y == 0 || boll.y == height) {
            boll.bounce();
        }
        if (boll.x == paddle1.x && boll.y == paddle1.y) { //this actually doesn't work,
            // needs intersect or something, but we don't have that rn, this will only bounce on
            // the first pixel
            boll.bouncePaddle();
        }

        if (boll.x == paddle2.x && boll.y == paddle2.y) { //this actually doesn't work,
            // needs intersect or something, but we don't have that rn, this will only bounce on
            // the first pixel
            boll.bouncePaddle();
        }
    }
}
