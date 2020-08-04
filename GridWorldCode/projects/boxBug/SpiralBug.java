import info.gridworld.actor.Bug;

public class SpiralBug extends Bug {
    int c = 0;
    int g = 0;
    public SpiralBug(){

    }


    public void act()
    {
        for (int t = 0 ;t <c/2; t++) {
            move();
        }

        g++;
        if (g%2 == 0) {
            turn();
            turn();
            c++;
        }
    }


}
