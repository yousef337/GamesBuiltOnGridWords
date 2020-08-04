package P2;
import info.gridworld.grid.BoundedGrid;
import info.gridworld.grid.Grid;
import info.gridworld.world.World;
import info.gridworld.grid.Location;

import java.awt.Color;

public class DropWorld extends World<Piece>{

    private static DropGame game;
    private static Color currentColor;
    private boolean gameOver = false;

    public DropWorld(int rows, int cols){

        Grid<Piece> gp = new BoundedGrid<>(4,6);
        game = new DropGame(gp);
        this.setGrid(gp);
        currentColor = Color.BLUE;
        flipTurn();

    }

    public static void main(String[] args) {
        DropWorld d = new DropWorld(4,6);
        d.show();
    }

    public void flipTurn(){

        if(currentColor.equals(Color.BLUE)){
            currentColor = Color.RED; // blue and red
        }else{
            currentColor = Color.BLUE; // blue and red
        }

    }


    public boolean locationClicked(Location loc){

        if(gameOver){
            return false;
        }

        int col = loc.getCol();
        Location l = game.dropLocationForColumn(col);
        if (l == null)
            return false;
        if (game.dropMatchNeighbors(col,currentColor)) {
            setMessage("Congratulation" + currentColor + "Wins");
            gameOver = true;
        }
        getGrid().put(l,new Piece(currentColor));

        flipTurn();

        return true;
    }


}
