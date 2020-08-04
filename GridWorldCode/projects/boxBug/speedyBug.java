import info.gridworld.actor.Bug;

import java.awt.*;
import java.util.Random;

public class speedyBug extends Bug {

    public speedyBug(){

        int[] a = {0,45,90,135,180,225,270,315};
        int r = (int) (Math.random()*a.length);
        setDirection(a[r]);

    }

    public void act() {

        while (canMove()){
            move();
        }
            turn();
            setColor(randomColor());

    }

    public Color randomColor(){

        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        return new Color(r,g,b);
    }
}
