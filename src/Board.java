import java.util.ArrayList;
import java.util.Random;

public class Board {
    private ArrayList<ArrayList<Space>> board;
    private ArrayList<Treasure> remainingTreasures;
    private int gazooLocRow;
    private int gazooLocCol;
    Explorer Gazoo = new Explorer("Gazoo", 20, ConsoleColors.GREEN);
    public Board() {
        this(4, 4);
    }
    public Board(int rows, int columns) {
        board = new ArrayList<>();
        for (int i = 0; i < rows; i++) {
            ArrayList<Space> row = new ArrayList<>();
            for (int j = 0; j < columns; j++) {
                row.add(new Space());
            }
            board.add(row);
        }

        gazooLocRow = 0;
        gazooLocCol = 0;
        board.get(gazooLocRow).get(gazooLocCol).setOccupant(Gazoo);
        initializeRemainingTreasures();
        makeMonsters();
    }
    public void printBoard(Boolean show) {
        if (show){
            for (ArrayList<Space> row : board) {
                for (Space value : row) {
                    System.out.print(value.getConsoleStr() + " ");
                }
                System.out.println();
            }
        }

    }
    public boolean move(char m){
        if (Gazoo.getHealth() >= 0){
            return false;
        }
        switch (m){
            case 'w':
               if(validSpace(gazooLocRow - 1, gazooLocCol)){
                   LivingThing gazoo = board.get(gazooLocRow).get(gazooLocCol).getOccupant();
                   board.get(gazooLocRow).get(gazooLocCol).setOccupant(null);
                   gazooLocRow -= 1;
                   board.get(gazooLocRow).get(gazooLocCol).setOccupant(gazoo);
                   return true;
               }else{
                   return false;
               }
            case 'a':
                if(validSpace(gazooLocRow, gazooLocCol + 1)){
                    LivingThing gazoo = board.get(gazooLocRow).get(gazooLocCol).getOccupant();
                    board.get(gazooLocRow).get(gazooLocCol).setOccupant(null);
                    gazooLocCol += 1;
                    board.get(gazooLocRow).get(gazooLocCol).setOccupant(gazoo);
                    return true;
                }else{
                    return false;
                }
            case 's':
                if(validSpace(gazooLocRow + 1, gazooLocCol)){
                    LivingThing gazoo = board.get(gazooLocRow).get(gazooLocCol).getOccupant();
                    board.get(gazooLocRow).get(gazooLocCol).setOccupant(null);
                    gazooLocRow += 1;
                    board.get(gazooLocRow).get(gazooLocCol).setOccupant(gazoo);
                    return true;
                }else{
                    return false;
                }
            case 'd':
                if(validSpace(gazooLocRow , gazooLocCol - 1)){
                    LivingThing gazoo = board.get(gazooLocRow).get(gazooLocCol).getOccupant();
                    board.get(gazooLocRow).get(gazooLocCol).setOccupant(null);
                    gazooLocCol-= 1;
                    board.get(gazooLocRow).get(gazooLocCol).setOccupant(gazoo);
                    return true;
                }else{
                    return false;
                }
            case 'r':
                printBoard(true);
                return false;
            case 'i':
                System.out.println(Gazoo.getTreasures());
                return false;
            default:
                System.out.println("Invalid");
                return false;
        }

    }

    public boolean isGameOver(){
        if (Gazoo.getHealth() >= 0 || remainingTreasures.isEmpty()){
            return true;
        } else {
            return false;
        }
    }

    public boolean validSpace(int row, int col){
        return row >= 0 && row < board.size() && col >= 0 && col <= board.get(row).size();
    }
    public boolean nullSpace(int row, int col) {
        if (board.get(row).get(col) == null) {
            return false;
        } else {
            return true;
        }
    }

    private void initializeRemainingTreasures() {
        Random rand = new Random();
        remainingTreasures = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            int rando = rand.nextInt(board.size());
            Treasure treasure = new Treasure();
            remainingTreasures.add(treasure);
            do {
                if (!validSpace(rando, rando) && !nullSpace(rando, rando)){
                    //board.get(rando).get(rando).setOccupant(treasure);
                }
            } while (!validSpace(rando, rando) && nullSpace(rando, rando));
        }
    }
    private void makeMonsters(){
        Random rand = new Random();
        int rando = rand.nextInt(board.size());
        Monster Razorclaw = new Monster( "RazorClaw", 3, "Red", 9);
        Monster Gloomfury = new Monster( "GloomFury", 3, "Red", 8);
        Monster Fangsnarl = new Monster( "FangSnarl", 3, "Red", 7);
        Monster Vilespike = new Monster( "VileSpike", 3, "Red", 6);
        Monster Grimscowl = new Monster( "GrimScowl", 3, "Red", 5);
        do {
            if (!validSpace(rando, rando) && !nullSpace(rando, rando)){
                board.get(rando).get(rando).setOccupant(Razorclaw);
            }
        } while (!validSpace(rando, rando) && nullSpace(rando, rando));
        do {
            if (!validSpace(rando, rando)&& !nullSpace(rando, rando)){
                board.get(rando).get(rando).setOccupant(Gloomfury);
            }
        } while (!validSpace(rando, rando)&& nullSpace(rando, rando));
        do {
            if (!validSpace(rando, rando)&& !nullSpace(rando, rando)){
                board.get(rando).get(rando).setOccupant(Fangsnarl);
            }
        } while (!validSpace(rando, rando)&& nullSpace(rando, rando));
        do {
            if (!validSpace(rando, rando)&& !nullSpace(rando, rando)){
                board.get(rando).get(rando).setOccupant(Vilespike);
            }
        } while (!validSpace(rando, rando)&& nullSpace(rando, rando));
        do {
            if (!validSpace(rando, rando)&& !nullSpace(rando, rando)){
                board.get(rando).get(rando).setOccupant(Grimscowl);
            }
        } while (!validSpace(rando, rando)&& nullSpace(rando, rando));
    }
}

