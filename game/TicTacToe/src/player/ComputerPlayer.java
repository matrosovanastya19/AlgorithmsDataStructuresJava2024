package player;
import board.Board;
import java.util.Random;
public class ComputerPlayer implements Player {
    private char symbol;
    private Random random = new Random();

    public ComputerPlayer(char symbol) {
        this.symbol = symbol;
    }

    @Override
    public void makeMove(Board board) {
        int row, col;
        while (true) {
            row = random.nextInt(3); // Випадкове число від 0 до 2
            col = random.nextInt(3); // Випадкове число від 0 до 2
            if (board.markCell(row, col, symbol)) {
                System.out.println("Комп'ютер зробив хід: рядок " + row + ", стовпець " + col);
                break;
            }
        }
    }

    @Override
    public char getSymbol() {
        return symbol;
    }
}
