import java.applet.Applet;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.geom.AffineTransform;
import java.awt.image.BufferedImage;
import java.util.Random;

/**
 * Created by JUAN RAMON on 13/01/2015.
 * The Asteroid.java is the game itself
 */
public class Asteroids extends Applet implements Runnable, KeyListener {
    //the main thread becames the game loop
    Thread gameLoop;

    //use this as a double buffer
    BufferedImage backbuffer;

    //the main drawing object for back buffer
    Graphics2D g2d;

    //toggle for drawing bounding boxes
    boolean showBounds = false;

    //create the asteroid array
    int ASTEROIDS = 20;
    Asteroid[] ast = new Asteroid[ASTEROIDS];

    //create the bullet array
    int BULLETS = 10;
    Bullet[] bullet = new Bullet[BULLETS];
    int currentBullet = 0;

    //the player's ship
    Ship ship = new Ship();

    //create the identity transform(0,0)
    AffineTransform identity = new AffineTransform();

    //create a random number generator
    Random rand = new Random();

    //applet init event
    public void init() {
        //create the back buffer for smooth graphics
        backbuffer = new BufferedImage(640, 480, BufferedImage.TYPE_INT_RGB);
        g2d = backbuffer.createGraphics();

        //set up the ship
        ship.setX(320);
        ship.setY(240);

        //set up the bullets
        for (int n = 0; n < BULLETS; n++) {
            bullet[n] = new Bullet();
        }

        //create the asteroids
        for (int n = 0; n < ASTEROIDS; n++) {
            ast[n] = new Asteroid();
            ast[n].setRotationVelocity(rand.nextInt(3) + 1);
            ast[n].setX((double) rand.nextInt(600) + 20);
            ast[n].setY((double) rand.nextInt(440) + 20);
            ast[n].setMoveAngle((double) rand.nextInt(360));
            double ang = ast[n].getMoveAngle() - 90;
            ast[n].setVelX(calcAngleMoveX(ang));
            ast[n].setVelY(calcAngleMoveY(ang));
        }

        //start the user input listener
        addKeyListener(this);
    }

    //strub method
    public double calcAngleMoveY(double ang) {
        return 0;
    }

    //strub method
    public double calcAngleMoveX(double ang) {
        return 0;
    }

    //applet update event to redraw the screen
    public void update(Graphics g){
        //start off transforms at identity
        g2d.setTransform(identity);

        //erase the background
        g2d.setPaint(Color.black);
        g2d.fillRect(0,0,getSize().width, getSize().height);

        //print same status information
        g2d.setColor(Color.white);
        g2d.drawString("Ship: " + Math.round(ship.getX())+ "," + Math.round(ship.getY()), 5, 10);
        g2d.drawString("Move angle: " + Math.round(ship.getMoveAngle())+90, 5, 25);
        g2d.drawString("{{ ", 5, 40);
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    @Override
    public void run() {

    }
}
