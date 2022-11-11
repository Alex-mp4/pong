package pong;

public class testPong {
    public static void main(String[] args) {
        Paddle paddle = new Paddle(5, 5, 10);
        Boll boll = new Boll(10, 10, 1, 1);

        boll.move();
        boll.bounce();
        boll.move();
        boll.move();
        boll.move();
        boll.bounce();
        boll.bouncePaddle();
        boll.move();
        boll.move();
        paddle.moveDown();
        paddle.moveUp();
    }
}
