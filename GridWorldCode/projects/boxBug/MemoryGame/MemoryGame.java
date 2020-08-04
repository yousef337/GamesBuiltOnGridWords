package MemoryGame;

import info.gridworld.grid.Grid;
import info.gridworld.grid.Location;

import java.util.ArrayList;

public class MemoryGame {
    private Grid<Card> theGrid;

    public MemoryGame(Grid<Card> g){
        theGrid = g;
        String[] arr = {"a","b","c","d","e","f","g","h","a","b","c","d","e","f","g","h"};
        shuffle(arr);
    }

    public boolean isCardHidden(Location loc){
        return theGrid.get(loc).isHidden;
    }

    public boolean match(Location loc1, Location loc2){

        if(theGrid.get(loc1).toString().equals(theGrid.get(loc2).toString())){

            System.out.println(theGrid.get(loc1).toString());
            System.out.println(theGrid.get(loc2).toString());
            System.out.println("---------");
            return true;
        }

        System.out.println(theGrid.get(loc1).toString());
        System.out.println(theGrid.get(loc2).toString());
        System.out.println("---------");

        return false;
    }

    public void showCard(Location loc){
        theGrid.get(loc).show();
    }
    public void hideCard(Location loc){
        theGrid.get(loc).hide();
    }

    public void shuffle(String[] a){
        ArrayList<String> arr = new ArrayList<>();
        for (String s: a){
            arr.add(s);
        }

        ArrayList<Location> xs = new ArrayList<>();

        for (int i = 0; i < a.length; i++){

            int rand = (int) (Math.random()*(arr.size()-1));

            int x = (int) (Math.random()*4);
            int y = (int) (Math.random()*4);
            Location loc = new Location(x,y);

            while (xs.contains(loc)){

                 x = (int) (Math.random()*4);
                 y = (int) (Math.random()*4);
                 loc = new Location(x,y);

            }

            xs.add(loc);

            theGrid.put(new Location(x,y),new Card(arr.get(rand)));
            arr.remove(rand);

        }

    }

}
