import info.gridworld.actor.Bug;

import java.awt.*;
import java.util.Random;

public class RandomWalkerBug extends Bug {

    public RandomWalkerBug() {

        int[] a = {90,270};
        int r = (int) (Math.random()*a.length);
        setDirection(a[r]);

    }

    public void act() {

        int[] a = {90,270};
        int r = (int) (Math.random()*a.length);
        setDirection(a[r]);

        if(canMove()){
            move();
        }else{
            setDirection(this.getDirection()+180);
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
