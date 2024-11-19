package game;
import java.util.Random;

import board.Board;
import display.Display;

import player.Player;

public class TicTacToeGame implements Game {
    private Board board;
    private Player player1;
    private Player player2;
    private Player currentPlayer;
    private Display display;

    public TicTacToeGame(Board board, Player player1, Player player2, Display display) {
        this.board = board;
        this.player1 = player1;
        this.player2 = player2;
        this.display = display;
        setRandomStartingPlayer();
    }

    @Override
    public void startGame() {
        board.resetBoard();
        while (true) {
            display.showBoard(board);
            currentPlayer.makeMove(board);

            if (board.checkWinner(currentPlayer.getSymbol())) {
                display.showBoard(board);
                display.showWinner(currentPlayer.getSymbol());
                break;
            } else if (board.isDraw()) {
                display.showBoard(board);
                display.showDraw();
                break;
            }

            switchPlayer();
        }
    }

    @Override
    public void switchPlayer() {
        currentPlayer = (currentPlayer == player1) ? player2 : player1;
    }

    @Override
    public void setRandomStartingPlayer() {
        Random rand = new Random();
        currentPlayer = rand.nextBoolean() ? player1 : player2;
    }
}