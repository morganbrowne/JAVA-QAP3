package QAP3.Problem2;



public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint() {}

    public MovablePoint(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed) {
            this.xSpeed = xSpeed;
            this.ySpeed = ySpeed;
    }

    // Getter for MovablePoint...
    public float getXSpeed() {
        return xSpeed;
    }
    public float getYSpeed() {
        return ySpeed;
    }
    // Setters for MovablePoint...
    public void setXSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }
    public void setYSpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    // Get xSpeed and ySpeed.
    public float[] getSpeed() {
        return new float[] {
            xSpeed, ySpeed
        };
    }

    // Method to move the point
    public MovablePoint move() {
        setX(getX() + xSpeed);
        setY(getY() + ySpeed);
        return this;
    }
}
