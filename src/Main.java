import java.util.Scanner;
public class Main {
    public static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        Board b2 = new Board(8, 9);
        while (b2.isGameOver()){
            char in;
            b2.printBoard(false);
            System.out.println("Enter “w” to go up, “a” to go left, “s” to go down, and “d” to go right \n" +
                    "Enter “r” to print the board, “i” for information on collected treasures ");
            in =input.next().charAt(0);
            b2.move(in);
        }
    }
}