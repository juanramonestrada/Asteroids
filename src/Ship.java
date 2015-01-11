import java.awt.*;

/**
 * Created by JUAN RAMON on 11/01/2015.
 * part of asteroids game
 */

public class Ship extends BaseVectorShape {
    //define ship polygon
    private int[] shipx = {-6, -3, 0, 3, 6, 0};
    private int[] shipy = {6, 7, 7, 7, 6, -7};

    //bounds rectangle
    public Rectangle getBounds(){
        Rectangle r = null;
        r = new Rectangle((int)getX()-6,(int)getY()-6,12,12);
        return r;
    }

    Ship(){
        setShape(new Polygon(shipx, shipy, shipx.length));
        setAlive(true);
    }
}
