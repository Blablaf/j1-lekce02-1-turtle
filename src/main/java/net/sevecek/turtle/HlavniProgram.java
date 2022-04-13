package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();

        nakresliDomecek(zofka);
        zofka.penUp();
        zofka.move(100);
        zofka.turnRight(270);
        zofka.penDown();
        zofka.setPenColor(Color.pink);
        nakresliDomecek(zofka);


    }

    private void nakresliDomecek(Turtle zofka) {
        zofka.turnRight(45);
        zofka.move(50);
        zofka.turnRight(90);
        zofka.move(50);
        zofka.turnRight(45);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
        zofka.turnRight(90);
        zofka.move(70);
    }


}
