import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.actor.Rock;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;
import java.util.Locale;

public class TheMazeRunner {

    public static void main(String[] args) {

        ActorWorld world = new ActorWorld();
        //World world = new World(grid);

        // ----------
        world.add(new Location(0,3),new Rock());
        world.add(new Location(0,5),new Rock());
        world.add(new Location(1,2),new Rock());
        world.add(new Location(2,2),new Rock());
        world.add(new Location(3,2),new Rock());
        world.add(new Location(4,2),new Rock());
        world.add(new Location(7,3),new Rock());
        world.add(new Location(6,5),new Rock());
        world.add(new Location(1,3),new Rock());
        world.add(new Location(5,3),new Rock());
        world.add(new Location(5,5),new Rock());
        world.add(new Location(6,3),new Rock());
        world.add(new Location(8,3),new Rock());
        world.add(new Location(8,4),new Rock());
        world.add(new Location(8,5),new Rock());
        world.add(new Location(8,6),new Rock());
        world.add(new Location(8,7),new Rock());
        world.add(new Location(6,7),new Rock());
        world.add(new Location(6,8),new Rock());
        world.add(new Location(6,9),new Rock());
        world.add(new Location(6,6),new Rock());
        world.add(new Location(2,5),new Rock());
        world.add(new Location(3,5),new Rock());
        world.add(new Location(4,5),new Rock());
        world.add(new Location(5,5),new Rock());
        world.add(new Location(0,4),new Rock());
        world.add(new Location(0,7),new Rock());
        world.add(new Location(1,7),new Rock());
        world.add(new Location(2,7),new Rock());
        world.add(new Location(8,8),new Rock());
//        world.add(new Location(8,9),new Rock());
        world.add(new Location(2,6),new Rock());
        // ----------

        RunnerBug bug = new RunnerBug();
        world.add(new Location(7,9), bug);
        world.show();
    }

}
