import processing.core.PApplet;

public class Ball {
    private float X_POS;
    private float Y_POS;
    private float SPEED;
    private float RADIUS;

    public Ball(float x_POS, float y_POS, float SPEED, float RADIUS) {
        X_POS = x_POS;
        Y_POS = y_POS;
        this.SPEED = SPEED;
        this.RADIUS = RADIUS;
    }

    public void drawBalls(PApplet pApplet) {
        pApplet.ellipse(X_POS, Y_POS, RADIUS, RADIUS);
        X_POS += SPEED;
    }


}
