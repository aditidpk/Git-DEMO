import processing.core.PApplet;

import java.util.Arrays;
import java.util.List;

public class ProcessingBall extends PApplet {
    
    private static  float Y_POS1 = 15;
    private static float RADIUS = 20;
    private float x1;
    private float x2;
    private float x3;
    private float x4;

    Ball ball1;
    Ball ball2;
    Ball ball3;
    Ball ball4;
    private List<Ball> balls;

    @Override
    public void setup() {
        size(500, 500);
        ball1 = new Ball(x1, Y_POS1, x1+1, RADIUS);
        ball2 = new Ball(x1, Y_POS1+120, x1+2, RADIUS);
        ball3 = new Ball(x1, Y_POS1+240, x1+3, RADIUS);
        ball4 = new Ball(x1, Y_POS1+360, x1+4, RADIUS);

        balls = Arrays.asList(ball1, ball2, ball3, ball4);
    }

    @Override
    public void draw() {
        balls.forEach(ball -> ball.drawBalls(this));
    }

    public static void main(String[] args) {
        String[] appletArgs = new String[] { "ProcessingBall" };
        PApplet.main(appletArgs);
    }
}