import info.gridworld.grid.Location;

import java.util.ArrayList;

public class Part3Location{

    public static void main(String[] args) {

        Location loc1 = new Location(2,4);
        Location loc2 = new Location(6,3);
        Location loc3 = new Location(2,3);

        System.out.println("Print everything");


        System.out.println(loc1);
        System.out.println(loc2);
        System.out.println(loc3);

        System.out.println("Get Rows");

        System.out.println(loc1.getRow());
        System.out.println(loc2.getRow());
        System.out.println(loc3.getRow());

        System.out.println("Compare between 1 and 2");

        if(loc1.compareTo(loc2) > 0){
            System.out.println(loc1);
        }else{
            System.out.println(loc2);
        }

        System.out.println("Are they equal");

        if(loc1.compareTo(loc2) == 0){
            System.out.println("loc1 and loc2 are equal");
        }else{
            System.out.println("loc1 and loc2 are not equal");
        }

        System.out.println("Print everything");


        System.out.println(loc1);
        System.out.println(loc2);
        System.out.println(loc3);

        System.out.println("Print dir");

        Location l8 = loc1.getAdjacentLocation(Location.SOUTHEAST);

        int dir;
        dir = loc2.getDirectionToward(loc3);
        System.out.println(dir);


        ArrayList<Location> arr = new ArrayList<>();
        int[] arri = {0,45,90,135,180,225,270,315};
        for (int i = 0; i < 8; i++) {
            arr.add(loc2.getAdjacentLocation(arri[i]));
        }

        System.out.println("Print every location from the array to loc3");

        for (Location a: arr){
            System.out.println(loc3.getDirectionToward(a));
        }

        System.out.println("Print random location");
        System.out.println("Row 0,2 col 4,7");

        System.out.println(randomLocation(0,2,4,7));

        //---------------------------


    }

    //returns a Location with row values in the range
    //column values in the range [colStart, colEnd]

    public static Location randomLocation(int rowStart, int rowEnd,
                                   int colStart, int colEnd){
        int row = 0;
        int col = 0;

        row = (int) (Math.random()*(rowEnd-rowStart)) + rowStart+1;
        col = (int) (Math.random()*(colEnd-colStart)) + colStart+1;

        return new Location(row,col);

    }

}
