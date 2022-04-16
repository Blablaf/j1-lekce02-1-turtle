package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        /* ZACINAME S DOMECKY (??? kdybych chtela kazdy domecek jinou barvou, da se do metody zadat
        aby po kazdem domecku zvolila nahodne dalsi barvu, popripade aby se nasledujici domecek
        vykreslil v konkretnich barvach v danem poradi...? Myslim tim jinak, nez vypsat 5x
        nakresli domecek a predtim pokazde zmenit barvu
         */
        for (int i = 0; i < 5; i++) {
            nakresliDomecek(zofka);
        }
        //DOMECEK VLEVO DOLE
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(850);
        zofka.turnRight(270);
        zofka.move(300);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliDomecek(zofka);

        //DOMECEK VPRAVO DOLE
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(500);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliDomecek(zofka);

        //PRASATKO-telo
        zofka.penUp();
        zofka.turnRight(270);
        zofka.move(500);
        zofka.turnLeft(90);
        zofka.move(60);
        zofka.turnRight(90);
        zofka.penDown();
        nakresliDomecek(zofka);
//PRASATKO trefuju misto s nozickami
        zofka.turnLeft(90);
        zofka.penUp();
        zofka.move(180);
        zofka.turnRight(90);
        zofka.move(10);
        zofka.turnRight(90);
        zofka.move(15);
        zofka.turnLeft(90);
        zofka.penDown();

        //PRASATKO - nozicky
        zofka.turnLeft(45.0);
        zofka.move(40.0);
        zofka.turnRight(180.0);
        zofka.move(40.0);
        zofka.turnRight(90.0);
        zofka.move(40.0);
        zofka.turnRight(180.0);
        zofka.move(40.0);
        zofka.turnLeft(45.0);
        zofka.turnRight(180);
        zofka.penUp();
        zofka.move(75);
        zofka.turnRight(180);
        zofka.penDown();
        zofka.turnLeft(45.0);
        zofka.move(40.0);
        zofka.turnRight(180.0);
        zofka.move(40.0);
        zofka.turnRight(90.0);
        zofka.move(40.0);
        zofka.turnRight(180.0);
        zofka.move(40.0);
        zofka.turnLeft(45.0);
    }

    private void nakresliDomecek(Turtle zofka) {
        zofka.setPenColor(Color.pink);
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
        zofka.penUp();
        zofka.move(100);
        zofka.turnLeft(90);
        zofka.penDown();
    }


}
