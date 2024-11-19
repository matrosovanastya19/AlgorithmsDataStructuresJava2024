package display;
import board.Board;

public class ConsoleDisplay implements Display {
    @Override
    public void showBoard(Board board) {
        board.displayBoard();
    }

    @Override
    public void showWinner(char symbol) {
        System.out.println("Гравець " + symbol + " переміг!");
    }

    @Override
    public void showDraw() {
        System.out.println("Нічия!");
    }
}
