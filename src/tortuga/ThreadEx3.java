package tortuga;

//ThreadEx3.java
import ch.aplu.turtle.*;
import java.awt.Color;

public class ThreadEx3 extends TurtleFrame {

    public void simular() {
        Turtle hilo1 = new Turtle(this, Color.ORANGE);
        Turtle hilo2 = new Turtle(this, Color.RED);
        Turtle hilo3 = new Turtle(this, Color.MAGENTA);
        Turtle hilo4 = new Turtle(this, Color.BLUE);
        Turtle hilo5 = new Turtle(this, Color.GREEN);

        hilo1.setPos(-134, -50);
        hilo2.setPos(-10, -50);
        hilo3.setPos(-46, -50);
        hilo4.setPos(-62, -50);
        hilo5.setPos(-98, -50);
        
        hilo1.setPenColor(Color.ORANGE);
        hilo2.setPenColor(Color.RED);
        hilo3.setPenColor(Color.MAGENTA);
        hilo4.setPenColor(Color.BLUE);
        hilo5.setPenColor(Color.GREEN);

        new Cabeza(hilo1).start();
        new Body(hilo2).start();/*
        new Cabeza(hilo3).start();
        new Cabeza(hilo4).start();
        new Cabeza(hilo5).start();*/
    }

    public static void main(String[] args) {
        ThreadEx3 tablero = new ThreadEx3();
        tablero.simular();
    }
}
