/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tortuga;

import ch.aplu.turtle.Turtle;

/**
 *
 * @author Equipo
 */
public class Cabeza extends Thread {

    private Turtle turtle;
    private int elevation;

    Cabeza(Turtle turtle) {
        this.turtle = turtle;
        elevation = 40;
    }

    @Override
    public void run() {
        turtle.setPos(24, elevation);
        neck();
        contour();
        mouth();
        eyes();
        turtle.setPos(-150,0);
    }

    private void neck() {
        turtle.penDown();
        turtle.rt(180);
        turtle.fd(8);
        turtle.rt(90);
        turtle.fd(48);
        turtle.rt(90);
        turtle.fd(8);
        turtle.rt(90);
        turtle.fd(48);
        turtle.pu();
    }

    private void contour() {
        turtle.fd(16);

        turtle.pd();

        turtle.lt(90);
        turtle.fd(40);
        turtle.lt(90);
        turtle.fd(80);
        turtle.lt(90);
        turtle.fd(40);
        turtle.lt(90);
        turtle.fd(80);

        turtle.pu();
    }

    private void mouth() {
        turtle.lt(90);
        turtle.fd(12);
        turtle.lt(90);
        turtle.fd(24);

        turtle.pd();

        turtle.fd(8);
        turtle.lt(90);
        turtle.fd(8);
        turtle.rt(90);
        turtle.fd(8);
        turtle.rt(90);
        turtle.fd(8);
        turtle.lt(90);
        turtle.fd(8);
        turtle.lt(90);
        turtle.fd(8);
        turtle.rt(90);
        turtle.fd(8);
        turtle.rt(90);
        turtle.fd(8);
        turtle.rt(90);
        turtle.fd(32);
        turtle.rt(90);
        turtle.fd(8);
        turtle.rt(90);
        turtle.fd(32);

        turtle.pu();
    }

    private void eyes() {
        turtle.fd(16);
        turtle.rt(90);
        turtle.fd(22);

        turtle.pd();

        circle(10, 360);
        
        turtle.pu();
        
        turtle.rt(90);
        turtle.fd(6);

        turtle.pd();

        turtle.lt(90);
        circle(4, 180);
        
        turtle.pu();
        
        turtle.rt(90);
        turtle.fd(38);

        turtle.pd();

        turtle.lt(90);
        circle(10, 360);
        
        turtle.pu();
        
        turtle.rt(90);
        turtle.fd(6);

        turtle.pd();

        turtle.lt(90);
        circle(4, 180);
        
        turtle.pu();
    }

    private void circle(double radius, int ang) {
        double heading = turtle.heading();
        double posX = turtle.getX();
        double posY = turtle.getY();
        for (int i = 0; i <= ang; i += 4) {
            turtle.rt(4);
            turtle.fd(radius * .0698);
        }
        turtle.setHeading(heading);
        turtle.setPos(posX, posY);
    }
}
