package MemoryGame;

import P2.DropWorld;
import com.sun.source.doctree.ThrowsTree;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class MemoryWorld extends World<Card> {

    private MemoryGame game;
    private static MemoryWorld world;
    private Location card1;
    private Location card2;
    private int points = 0;
    private int mismatches;
    ArrayList<Location> xs = new ArrayList<>();


    public MemoryWorld(int rows,int cols){
        Grid<Card> gr = new BoundedGrid<>(rows,cols);
        game = new MemoryGame(gr);
        this.setGrid(gr);
    }

    public static void main(String[] args) {
        MemoryWorld d = new MemoryWorld(4,4);
        d.show();
    }

    @Override
    public boolean locationClicked(Location loc) {

        if(xs.contains(loc)){
            return true;
        }

        if(card2 != null){
            this.getGrid().get(card1).hide();
            this.getGrid().get(card2).hide();
            game.hideCard(card1);
            game.hideCard(card2);
            card1 = null;
            card2 = null;
        }

        if (card1 == null){
            card1 = loc;
            game.showCard(card1);
            this.getGrid().get(card1).show();

        }else{

            card2 = loc;
            this.getGrid().get(card2).show();

            if(game.match(card1,card2) && !card1.equals(card2)){
                System.out.println("TRUE");
                game.showCard(card1);
                game.showCard(card2);
                this.getGrid().get(card1).show();
                this.getGrid().get(card2).show();
                xs.add(card1);
                xs.add(card2);
                card1 = null;
                card2 = null;
                points += 4;
                setMessage(""+points + " mismatches: " + mismatches);
                return true;
            }else{

                this.getGrid().get(card2).show();
                game.showCard(card2);
                points -= 2;
                mismatches++;
                setMessage(""+points + " mismatches: " + mismatches);

            }

        }


        return true;
    }
}

// f1
// sleep
// f2
