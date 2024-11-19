package player;
import java.util.Scanner;

import board.Board;

public class HumanPlayer implements Player {
    private char symbol;
    private Scanner scanner;

    public HumanPlayer(char symbol, Scanner scanner) {
        this.symbol = symbol;
        this.scanner = scanner;
    }

    @Override
    public char getSymbol() {
        return symbol;
    }

    @Override
    public void makeMove(Board board) {
        int row, col;
        while (true) {
            System.out.println("Гравець " + symbol + ", введіть координати як одне число (наприклад, 11 для рядка 1 і стовпця 1):");
            String input = scanner.next();  
    
            if (input.length() == 2) {  
                row = Character.getNumericValue(input.charAt(0));
                col = Character.getNumericValue(input.charAt(1));
    
                if (row >= 0 && row <= 2 && col >= 0 && col <= 2) {  
                    if (board.markCell(row, col, symbol)) {
                        break; 
                    } else {
                        System.out.println("Неправильний хід, спробуйте ще раз.");
                    }
                } else {
                    System.out.println("Помилка: введені числа повинні бути в діапазоні 0–2.");
                }
            } else {
                System.out.println("Помилка: введіть рівно два числа, наприклад, 11 або 02.");
            }
        }
    }
}
