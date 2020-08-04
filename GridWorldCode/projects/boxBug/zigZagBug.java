import info.gridworld.actor.Bug;

public class zigZagBug extends Bug {


    public zigZagBug(){
        turn();
        turn();
    }

    public void act(){

            for (int i = 0; i < 5; i++) {
                move();
            }
            turn();
            turn();
            turn();
            for (int i = 0; i < 5; i++) {
                move();
            }
            turn();
            turn();
            turn();
            turn();
            turn();
            for (int i = 0; i < 5; i++) {
                move();
            }


    }


}
