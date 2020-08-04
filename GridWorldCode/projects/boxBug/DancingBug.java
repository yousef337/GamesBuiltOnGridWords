import info.gridworld.actor.Bug;

import java.awt.*;
import java.util.Random;

public class DancingBug extends Bug {

    private int[] numArr;
    private int index;

    public DancingBug(int[] arr){
        numArr = arr;
        index = 0;
    }

    public Color randomColor(){

        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        return new Color(r,g,b);
    }

    public void act() {

        if(index == numArr.length){
            index = 0;
        }

        for (int i = 0; i < numArr[index]; i++) {
            turn();
        }

        setColor(randomColor());

        index++;
        super.act();
    }
}
