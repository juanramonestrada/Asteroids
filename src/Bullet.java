import java.awt.*;

/**
 * Created by JUAN RAMON on 11/01/2015.
 * Bullet Class use to shoot asteroids and aliens
 */
public class Bullet extends BaseVectorShape {

    public Rectangle getBounds(){
        Rectangle r = null;
        r = new Rectangle((int)getX(), (int)getY(), 1, 1);
        return r;
    }

    Bullet(){
        // createe the bullet shape
        setShape(new Rectangle(0, 0, 1, 1));
        setAlive(false);
    }

}
