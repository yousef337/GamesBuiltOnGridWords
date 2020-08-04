import info.gridworld.actor.Bug;
import info.gridworld.actor.Flower;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class RunnerBug extends Bug {

    public RunnerBug(){
        setDirection(-90);
    }

    public void act(){

        if(getGrid().isValid(getLocation().getAdjacentLocation(getDirection()-90)) && ((getGrid().get(getLocation().getAdjacentLocation(getDirection()-90)) instanceof Flower) || getGrid().get(getLocation().getAdjacentLocation(getDirection()-90)) == null)){
            setDirection(getDirection()-90);
            move();
        }else if (canMove()){
            move();
        }else{
        turn();
        turn();
        }

        /*
        ArrayList<Location> arr = getGrid().getEmptyAdjacentLocations(this.getLocation());
        System.out.println(arr);

        // new Location
        int i = 0;
        int c = 0;
        System.out.println(getDirection());
        if (getDirection() == 0){
            c = 1;
        }else if (getDirection() == 90){
            i = -1;
        }else if (getDirection() == 180){
            c = -1;
        }else if (getDirection() == 270){
            i = 1;
        }

        Location loc = new Location(getLocation().getRow()+i,getLocation().getCol()+c);
        System.out.println(loc.getRow() + " " + loc.getCol());
        boolean ifEx = false;

        for (Location f:arr) {
            if (f.getRow() == loc.getRow() && loc.getCol() == f.getCol()){
                ifEx = true;
                System.out.println(ifEx);
            }
        }
        System.out.println(canMove());

        if(canMove() && ifEx ) {
            move();
        }else{
            turn();
            turn();
        }
*/
        /*
        if(this.getDirection()%90 == 0 && canMove()){
            move();
        }else if (getDirection() == 0){
            setDirection(this.getDirection()+90);
        }else if (getDirection() == 180) {
            setDirection(this.getDirection()+90);
        }else if (getDirection() == 270){
            setDirection(this.getDirection()+90);
        }
        else{
            setDirection(this.getDirection()+90);

        }
        */

    }


}
