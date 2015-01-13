/**
 * Created by JUAN RAMON on 12/01/2015.
 *
 */
public class BaseGameEntity extends Object {
    //variable
    protected boolean alive;
    protected double x, y;
    protected double velX, velY;
    protected double moveAngle, faceAngle;

    //accessors methods
    public boolean isAlive(){return alive;}
    public double getX(){return x;}
    public double getY(){return y;}
    public double getVelX(){return velX;}
    public double getVelY(){return velY;}
    public double getMoveAngle(){return moveAngle;}
    public double getFaceAngle(){return faceAngle;}

    //mutators methods
    public void setAlive(boolean alive){this.alive = alive;}
    public void setX(double x){this.x = x;}
    public void setY(double y){this.y = y;}



}
