import info.gridworld.actor.Bug;

public class zBug extends Bug {

    boolean tr = true;

    public zBug(){
        turn();
        turn();
    }

    public void act(){

        if (tr) {
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
            tr = false;
        }

    }


}
