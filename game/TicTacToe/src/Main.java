public class Main {
    public static void main(String[] args) {
        Board board = new TicTacToeBoard();
        Player player1 = new HumanPlayer('X');
        Player player2 = new HumanPlayer('O');
        Display display = new ConsoleDisplay();

        Game game = new TicTacToeGame(board, player1, player2, display);
        game.startGame();
    }
}
