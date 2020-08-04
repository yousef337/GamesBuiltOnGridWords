package P2;
import info.gridworld.grid.Grid;

import java.awt.*;
import info.gridworld.grid.Location;

public class DropGame {

    private Grid<Piece> theGrid;

    public DropGame(Grid<Piece> gr){
        theGrid = gr;
    }

    public Location dropLocationForColumn(int column){

        for (int i = theGrid.getNumRows()-1; i >=0; i--){

                if(theGrid.get(new Location(i,column)) == null){
                        return new Location(i,column);
                }
        }

        return null;

    }

    public boolean dropMatchNeighbors(int column, Color pieceColor){

        Location loc = dropLocationForColumn(column);
        if (loc == null || loc.getCol() == theGrid.getNumCols() - 1 || loc.getCol() == 0 || loc.getRow() == theGrid.getNumRows()-1){
            return false;
        }

//        System.out.println(loc.getRow());//2
//        System.out.println(loc);
//        System.out.println(theGrid.getNumRows()-1);//3

            boolean a = theGrid.get(new Location(loc.getRow(),loc.getCol()+1)) != null && theGrid.get(new Location(loc.getRow(),loc.getCol()+1)).getColor().equals(pieceColor);
            boolean b = theGrid.get(new Location(loc.getRow(),loc.getCol()-1)) != null && theGrid.get(new Location(loc.getRow(),loc.getCol()-1)).getColor().equals(pieceColor);
            boolean c = theGrid.get(new Location(loc.getRow()+1,loc.getCol())) != null && theGrid.get(new Location(loc.getRow()+1,loc.getCol())).getColor().equals(pieceColor);

            System.out.println(a + " " + b + " " + c);
            //System.out.println(pieceColor);

            return a && b && c;


    }



}
