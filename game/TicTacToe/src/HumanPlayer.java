import java.util.Scanner;

public class HumanPlayer implements Player {
    private char symbol;
    private Scanner scanner;

    public HumanPlayer(char symbol) {
        this.symbol = symbol;
        this.scanner = new Scanner(System.in);
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public void makeMove(Board board) {
        int row, col;
        while (true) {
            System.out.println("Гравець " + symbol + ", введіть рядок і стовпець (0, 1, 2):");
            row = scanner.nextInt();
            col = scanner.nextInt();
            if (board.markCell(row, col, symbol)) {
                break;
            } else {
                System.out.println("Неправильний хід, спробуйте ще раз.");
            }
        }
    }
}
