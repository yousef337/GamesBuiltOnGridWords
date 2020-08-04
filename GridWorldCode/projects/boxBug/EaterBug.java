import info.gridworld.actor.Actor;
import info.gridworld.actor.Bug;
import java.awt.*;
import java.util.ArrayList;
import java.util.Random;
import info.gridworld.grid.Location;

public class EaterBug extends Bug {

    public Color randomColor(){

        Random rand = new Random();
        int r = rand.nextInt(255);
        int g = rand.nextInt(255);
        int b = rand.nextInt(255);
        return new Color(r,g,b);
    }

    private double getAngle(Bug bug){
        double delta_x = (bug.getLocation().getRow()-getLocation().getRow());
        double delta_y = (bug.getLocation().getCol()-getLocation().getCol());
        double theta_radians = Math.atan2(delta_y, delta_x);
        return 180*theta_radians/Math.PI;
    }

    public void act() {

        ArrayList<Location> occupiedAdjacentLocations = getGrid().getOccupiedAdjacentLocations(this.getLocation());
        boolean round = false;

        for (Location loc: occupiedAdjacentLocations){
            System.out.println(loc);

            if(this.getGrid().get(loc) instanceof Bug && !round){
                System.out.println((int) (getAngle((Bug) getGrid().get(loc))));
                setDirection((int) (getAngle((Bug) getGrid().get(loc))));
                getGrid().get(loc).removeSelfFromGrid();
                setColor(randomColor());
                round = true;
            }
        }

        super.act();

    }



}
