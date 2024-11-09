public interface Board {
    void resetBoard();
    boolean markCell(int row, int col, char symbol);
    boolean checkWinner(char symbol);
    boolean isDraw();
    void displayBoard();
}
