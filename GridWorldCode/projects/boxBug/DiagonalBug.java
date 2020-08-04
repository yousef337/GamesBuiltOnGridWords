import info.gridworld.actor.Bug;

import java.awt.*;
import java.util.Random;

public class DiagonalBug extends Bug {

    public DiagonalBug() {

        int[] a = {45,135,225,315};
        int r = (int) (Math.random()*a.length);
        setDirection(a[r]);

    }

    public void act() {

        if(canMove()){
            move();
        }else{
            turn();
            turn();
            turn();
            turn();
            setColor(randomColor());

        }

    }

    public Color randomColor(){

        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        return new Color(r,g,b);
    }

}
