import board.Board;
import board.TicTacToeBoard;
import display.ConsoleDisplay;
import display.Display;
import game.Game;
import game.TicTacToeGame;
import player.ComputerPlayer;
import player.HumanPlayer;
import player.Player;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Board board = new TicTacToeBoard();
        Player player1 = new HumanPlayer('X', scanner);
        Player player2 = new ComputerPlayer('O');
        Display display = new ConsoleDisplay();

        Game game = new TicTacToeGame(board, player1, player2, display);
        game.startGame();
    }
}
