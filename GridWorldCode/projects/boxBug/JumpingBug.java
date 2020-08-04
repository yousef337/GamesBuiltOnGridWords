import info.gridworld.actor.Bug;

import java.awt.*;
import java.util.Random;

public class JumpingBug extends Bug {
    int c = 0;
    int g = 0;

    public JumpingBug(){

    }

    public void act() {

       if(canMove()) {
           move();
           if(canMove()){
               move();
           }else{
               setColor(randomColor());
               turn();
               turn();
           }
       }else{
           setColor(randomColor());
           turn();
           turn();
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
