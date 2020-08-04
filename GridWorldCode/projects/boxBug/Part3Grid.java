import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;

import java.util.ArrayList;
import java.util.Locale;

public class Part3Grid{

    public static void main(String[] args) {

        Grid<String> grid = new BoundedGrid<String>(10,10);
        World world = new World(grid);

        int r,c;
        r = grid.getNumRows();
        c = grid.getNumCols();
        //----------------

        System.out.println("r and c");
        System.out.println(r +" "+c);

        int occupiedLocation = grid.getOccupiedLocations().size();
        //----------------
        System.out.println("occupiedLocation");
        System.out.println(occupiedLocation);
        //----------------

        System.out.println("removed value of 2,2");
        String remove = grid.remove(new Location(2,2));
        System.out.println(remove);

        grid.put(new Location(7,7),"Bugs are cute");

        String g = "";
        //----------------

        System.out.println("value of temp (7,7)");
        Location temp = new Location(7,7);
        if(grid.isValid(temp)){
            g = grid.get(temp);
            System.out.println(g);
        }
        //----------------

        System.out.println("occupiedLocs");

        ArrayList<Location> occupiedLocs = grid.getOccupiedLocations();
        for (Location o: occupiedLocs){
            System.out.println(grid.get(o));
        }
        //----------------

        System.out.println("adjacentLocs for temp");

        ArrayList<Location> adjacentLocs = grid.getValidAdjacentLocations(temp);
        for (Location o: adjacentLocs){
            System.out.println(grid.get(o));
        }
        //----------------

        System.out.println("emptyAdjacentLocs");

        ArrayList<Location> emptyAdjacentLocs = grid.getEmptyAdjacentLocations(temp);
        for (Location o: emptyAdjacentLocs){
            System.out.println(grid.get(o));
        }

        for (Location t: adjacentLocs){
            grid.put(t,"empty");
        }

        // check that
        ArrayList<Location> occupiedAdjacentLocs = new ArrayList<>();
        //----------------

        for (Location lc :adjacentLocs) {
            if(grid.get(lc) != null){
            occupiedAdjacentLocs.add(lc);
            }
        }
        //----------------

        for (Location lc :occupiedAdjacentLocs) {

            grid.put(lc,"occupied");

        }

        // -------- 13
        ArrayList<String> nbrs = new ArrayList<>();

        ArrayList<Location> adjLoc77 = grid.getValidAdjacentLocations(new Location(7,7));

        for (Location f: adjLoc77){
            nbrs.add(grid.get(f));
        }

        // -------- 14
        for (String tr: nbrs){
            if(tr.compareTo(grid.get(new Location(7,7))) > 0){
                System.out.println(tr);
            }
        }

        world.show();

    }

}
