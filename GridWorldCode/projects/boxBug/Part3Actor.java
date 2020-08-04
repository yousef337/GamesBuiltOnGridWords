import info.gridworld.actor.Actor;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;
import info.gridworld.world.World;

import java.awt.*;
import java.util.ArrayList;

public class Part3Actor {

    public static void main(String[] args) {
        Grid<Actor> grid = new BoundedGrid<Actor>(10,10);
        World world = new World(grid);

        Actor clown = new Actor();
        //----------------

        clown.setColor(Color.red);
        //----------------

        clown.putSelfInGrid(grid,new Location(4,6));
        //----------------

        clown.setDirection(315);
        clown.setDirection(clown.getDirection()-90);

        // 6

        System.out.println("getOccupiedLocations");

        System.out.println(grid.getOccupiedLocations().size());

        // 7

        ArrayList<Location> arr = grid.getEmptyAdjacentLocations(new Location(4,6));

        for (Location f: arr){
            Actor a = new Actor();
            a.putSelfInGrid(grid,f);

        }
        //----------------

        ArrayList<Actor> nbrs = grid.getNeighbors(new Location(4,6));

        for (Actor c:nbrs) {
            if(c instanceof Rock){
                c.removeSelfFromGrid();
            }
        }

        //----------

        Location l = clown.getLocation();
        //----------------

        if(grid.get(new Location(l.getRow(),l.getCol()-1)) == null){
            grid.put(new Location(l.getRow(),l.getCol()-1),clown);
            grid.remove(l);
            l = new Location(l.getRow(),l.getCol()-1);
        }
        //----------------

        if(grid.get(new Location(l.getRow()+1,l.getCol())) == null){
            grid.put(new Location(l.getRow()+1,l.getCol()),clown);
            grid.remove(l);
            l = new Location(l.getRow()+1,l.getCol());
        }
        //----------------

        clown.act();
        //----------------

        System.out.println("clown's information");
        System.out.println(clown);

        //----------------

        clown.removeSelfFromGrid();

        //----------------

        world.show();

    }
}
