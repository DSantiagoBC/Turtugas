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
public class Body extends Thread {

    private Turtle turtle;
    private int elevation;

    Body(Turtle turtle) {
        this.turtle = turtle;
        elevation = 32;
    }

    @Override
    public void run() {
        turtle.setPos(-53, elevation);
        contour();
        ornament1();
        ornament2();
        turtle.setPos(-150,0);
    }

    private void contour() {
        turtle.pd();

        turtle.rt(90);
        turtle.fd(106);
        turtle.rt(90);
        turtle.fd(106);
        turtle.rt(90);
        turtle.fd(106);
        turtle.rt(90);
        turtle.fd(106);

        turtle.pu();
    }

    private void ornament1() {
        turtle.rt(90);
        turtle.fd(12);
        turtle.rt(90);
        turtle.fd(16);

        turtle.pd();

        turtle.fd(28);
        turtle.lt(90);
        turtle.fd(82);
        turtle.lt(90);
        turtle.fd(28);
        turtle.lt(90);
        turtle.fd(82);
        
        turtle.pu();
        
        turtle.lt(90);
        turtle.fd(16);
        turtle.lt(90);
        turtle.fd(8);
        
        turtle.pd();
        
        turtle.fd(12);
        turtle.lt(120);
        turtle.fd(12);
        turtle.lt(120);
        turtle.fd(12);
        
        turtle.pu();
        
        turtle.lt(120);
        turtle.fd(18);
        
        turtle.pd();
        
        turtle.fd(12);
        turtle.lt(120);
        turtle.fd(12);
        turtle.lt(120);
        turtle.fd(12);
        
        turtle.pu();
        
        turtle.lt(120);
        turtle.fd(18);
        
        turtle.pd();
        
        turtle.fd(12);
        turtle.lt(120);
        turtle.fd(12);
        turtle.lt(120);
        turtle.fd(12);
        
        turtle.pu();
        
        turtle.lt(120);
        turtle.fd(18);
        
        turtle.pd();
        
        turtle.fd(12);
        turtle.lt(120);
        turtle.fd(12);
        turtle.lt(120);
        turtle.fd(12);
        
        turtle.pu();
    }

    private void ornament2() {
        turtle.lt(120);
        turtle.fd(4);
        turtle.rt(90);
        turtle.fd(42);

        turtle.pd();

        circle(4, 360);
        
        turtle.pu();
        
        turtle.rt(90);
        turtle.fd(21);
        turtle.lt(90);

        turtle.pd();

        circle(4, 360);
        
        turtle.pu();
        
        turtle.rt(90);
        turtle.fd(21);
        turtle.lt(90);

        turtle.pd();

        circle(4, 360);
        
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
