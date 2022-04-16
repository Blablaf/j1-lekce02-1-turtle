package net.sevecek.turtle;

import net.sevecek.turtle.engine.*;

import java.awt.*;

public class HlavniProgram {

    public void main(String[] args) {
        Turtle zofka;

        zofka = new Turtle();
        zofka.setLocation(100,200);

        /* 1) ZACINAME S DOMECKY (??? kdybych chtela kazdy domecek jinou barvou, da se do metody zadat
        aby po kazdem domecku zvolila nahodne dalsi barvu, popripade aby se nasledujici domecek
        vykreslil v konkretnich barvach v danem poradi...? Myslim tim jinak, nez vypsat 5x
        nakresli domecek a predtim pokazde zmenit barvu
         */
        for (int i = 0; i < 5; i++) {
            nakresliDomecek(zofka);
        }
        //2) DOMECEK VLEVO DOLE
        zofka.penUp();
        zofka.turnLeft(90);
        zofka.move(850);
        zofka.turnRight(270);
        zofka.move(200);
        zofka.turnRight(180);
        zofka.penDown();
        nakresliDomecek(zofka);

        //3) DOMECEK VPRAVO DOLE
        zofka.penUp();
        zofka.turnRight(90);
        zofka.move(500);
        zofka.turnLeft(90);
        zofka.penDown();
        nakresliDomecek(zofka);

        //4) PRASATKO-telo
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
        zofka.penUp();

        //5) SLUNICKO
        zofka.setLocation(200,100);
        zofka.penDown();

        for (int i = 0; i < 12; i++) {
            zofka.move(30);
            zofka.turnRight(180.0);
            zofka.move(30);
            zofka.turnRight(180.0);
            zofka.turnRight(30);
            zofka.move(10);
        }

        //6) PODPIS
        zofka.penUp();
        zofka.setLocation(100, 550);
        zofka.turnLeft(90);
        zofka.penDown();
        // "I"
        zofka.move(100);
        zofka.penUp();
        // "R"
        zofka.setLocation(150, 550);
        zofka.penDown();
        zofka.move(100);
        zofka.penUp();
        zofka.setLocation(150, 550);
        zofka.penDown();
        zofka.turnLeft(90);
        for (int i = 0; i < 7; i++) {
            zofka.move(15);
            zofka.turnRight(30.0);
        }
        zofka.turnLeft(165);
        zofka.move(70);
        zofka.penUp();
        //"E"
        zofka.setLocation(220, 650);
        zofka.turnRight(225);
        zofka.penDown();
        for (int i = 0; i < 2; i++){
            zofka.turnRight(90.00);
            zofka.move(40.00);
            zofka.turnRight(180.00);
            zofka.move(40.00);
            zofka.turnRight(90.00);
            zofka.move(50.00);
        }
        zofka.turnRight(90.00);
        zofka.move(40.00);
        zofka.turnLeft(90.00);
        zofka.penUp();
        //"N"
        zofka.setLocation(290,650);
        zofka.penDown();
        zofka.move(100.00);
        zofka.turnRight(145.00);
        zofka.move(125.00);
        zofka.turnLeft(145.00);
        zofka.move(100.00);
        zofka.penUp();
        //"A"
        zofka.setLocation(390,650);
        zofka.penDown();
        zofka.turnRight(17.00);
        zofka.move(105.00);
        zofka.turnRight(145.00);
        zofka.move(105.00);
        zofka.turnLeft(180.00);
        zofka.move(50.00);
        zofka.turnLeft(70.00);
        zofka.move(32.00);
        zofka.turnRight(88.00);

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
/*vim ze ta zelvicka se misty hybe zbytecne, a slunicko ma paprsky ve smeru trajektorie namisto kolmo k ni
a prasatko ma nozicky sejdrem - ale nemela jsem kurz JAVA2, prace s objekty a tohle mi zabralo hrooozne hodin
a predstavu ze to budu opravovat a nedejboze stiskem nejakeho tlacitka o vsechno prijdu...!!! priste to bude lepsi!:)
*/
}
