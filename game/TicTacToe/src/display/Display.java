package display;
import board.Board;

public interface Display {
    void showBoard(Board board);
    void showWinner(char symbol);
    void showDraw();
}
