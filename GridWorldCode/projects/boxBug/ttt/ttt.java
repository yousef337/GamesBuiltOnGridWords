package ttt;
import java.util.Scanner;

public class ttt {

    static String[][] b = new String[3][3];
    static String player = "x";
    static boolean gameOver = false;

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        fillBoard();
        printBoard();

        while (!gameOver) {

            System.out.println("player "+player + " turn");
            System.out.println("choose one row");
            int r = s.nextInt();
            System.out.println("choose one col");
            int c = s.nextInt();

            while (r > 2 || c > 2 || r < 0 | c < 0){
                System.out.println("please enter something valid");
                System.out.println("choose one row");
                 r = s.nextInt();
                System.out.println("choose one col");
                 c = s.nextInt();
            }

            // check if empty
            while (!b[r][c].equals("-")) {
                System.out.println("please enter something valid");
                System.out.println("choose one row");
                r = s.nextInt();
                System.out.println("choose one col");
                c = s.nextInt();
            }

            b[r][c] = player;


            if(checkHor() || checkVer() || checkDiaM() || checkDia()){
                gameOver = true;
                System.out.println(player + " has won");
            }

            if (tie()) {
                gameOver = true;
                System.out.println(" draw ");
            }

            System.out.println();
            System.out.println("-----------");
            printBoard();

            turn();

        }
    }

    public static boolean checkDiaM(){
        int c = 0;
        for (int i = b. length-1; i <= 0; i--) {
            if(b[b.length-i][i].equals(player)){
                c++;
            }
        }

        if ( c == 3)
            return true;
        return false;
    }

    public static boolean checkDia(){
        int c = 0;
        for (int i = 0; i < 3; i++) {
            if(b[i][i].equals(player)){
                c++;
            }
        }

        if ( c == 3)
            return true;
        c = 0;

        return false;
    }

    public static boolean checkVer(){
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(b[j][i].equals(player)){
                    c++;
                }
                if ( c == 3)
                    return true;
            }
            c = 0;


        }


        return false;

    }


    public static boolean checkHor(){
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if(b[i][j].equals(player)){
                    c++;
                }
                if ( c == 3)
                    return true;
            }

            c= 0;

        }


        return false;
    }

    public static void turn(){
        if(player.equals("x"))
            player = "o";
        else
            player = "x";
    }

    public static boolean tie(){
        int c = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               if (!b[i][j].equals(player)){
                    c++;
               }
            }

        }

        if (c == 9)
            return true;
        return false;
    }

    public static void fillBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
               b[i][j] = "-";
            }
        }
    }

    public static void printBoard(){
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(b[i][j] + " ");
            }
            System.out.println();
        }
    }

}
