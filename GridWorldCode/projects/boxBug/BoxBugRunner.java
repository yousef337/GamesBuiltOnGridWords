/* 
 * AP(r) Computer Science GridWorld Case Study:
 * Copyright(c) 2005-2006 Cay S. Horstmann (http://horstmann.com)
 *
 * This code is free software; you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 * 
 * @author Cay Horstmann
 * @author Chris Nevison
 * @author Barbara Cloud Wells
 */

import info.gridworld.actor.ActorWorld;
import info.gridworld.actor.Bug;
import info.gridworld.grid.Location;
import java.util.Scanner;
import java.awt.Color;
import java.util.Random;

/**
 * This class runs a world that contains box bugs. <br />
 * This class is not tested on the AP CS A and AB exams.
 */
public class BoxBugRunner
{
    public static void main(String[] args)
    {
        ActorWorld world = new ActorWorld();

        EaterBug b = new EaterBug();
        world.add(new Location(4, 4), b);
        world.show();

        if (false) {

            CircleBug sss1 = new CircleBug();
            SpiralBug sss2 = new SpiralBug();
            zBug sss3 = new zBug();
            zigZagBug sss4 = new zigZagBug();
            JumpingBug sss5 = new JumpingBug();

            DiagonalBug sss6 = new DiagonalBug();
            RandomWalkerBug sss7 = new RandomWalkerBug();
            RandomTurningBug sss8 = new RandomTurningBug();
            speedyBug sss9 = new speedyBug();

            Bug[] bugs = {sss1, sss2, sss3, sss4, sss5, sss6, sss7, sss8, sss9};

            System.out.println("1 for CircleBug");
            System.out.println("2 for SpiralBug");
            System.out.println("3 for zBug");
            System.out.println("4 for zigZagBug");
            System.out.println("5 for JumpingBug");
            System.out.println("6 for DiagonalBug");
            System.out.println("7 for RandomWalkerBug");
            System.out.println("8 for RandomTurningBug");
            System.out.println("9 for speedyBug");
            System.out.println("10 for left Maze");
            System.out.println("11 for right Maze");
            System.out.println("0 and 12 and above and negative numbers are for exit");

            int t = new Scanner(System.in).nextInt();

            while (t > 0 && t < 12) {
                if (t < 10) {
                    world.add(new Location(4, 4), bugs[t - 1]);
                    world.show();
                } else if (t == 10) {
                    TheMazeRunner l = new TheMazeRunner();
                    l.main(args);
                } else {
                    TheMazeRight la = new TheMazeRight();
                    la.main(args);
                }

                t = new Scanner(System.in).nextInt();


            }
        }

    }
}