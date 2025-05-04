package homework_4;

import java.util.Scanner;

public class Noughts_and_Crosses {
    public static void main(String[] args) {
        char[][] board = new char[3][3];
        getGameBoard(board);
        Scanner scanner = new Scanner(System.in);
        int currentPlayer = 1;
        int movesCount = 0;
        boolean gameWon = false;

        while (true) {
            printBoard(board);
            if (movesCount == 9) {
                System.out.println("Ходы больше невозможны, ничья!");
                break;
            }
            //Я никак не мог придумать, как сделать смену игрока, инзачально пытался сделать переход через проверку четности итерации хода, но тут гораздо более экономично сразу с присвоением символа координате
            //Лучше я бы не придумал, а хуже оно просто не работало
            System.out.println("Игрок " + currentPlayer + " (" + (currentPlayer == 1 ? 'X' : 'O') + "), введите строку и столбец:");
            int row = -1, col = -1;
            row = scanner.nextInt() - 1;
            col = scanner.nextInt() - 1;
            char symbol = (currentPlayer == 1) ? 'X' : 'O';
            board[row][col] = symbol;
            movesCount++;
            if (checkWin(board, symbol)) {
                printBoard(board);
                System.out.println("Поздравляем! Игрок " + currentPlayer + " (" + symbol + ") победил!");
                gameWon = true;
                break;
            }
            currentPlayer = (currentPlayer == 1) ? 2 : 1;
        }
        scanner.close();
    }

    private static void getGameBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                board[i][j] = '-';
            }
        }
    }

    private static void printBoard(char[][] board) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static boolean checkWin(char[][] board, char symbol) {
        for (int i = 0; i < 3; i++) {
            if (board[i][0] == symbol && board[i][1] == symbol && board[i][2] == symbol) return true;
            if (board[0][i] == symbol && board[1][i] == symbol && board[2][i] == symbol) return true;
        }
        if (board[0][0] == symbol && board[1][1] == symbol && board[2][2] == symbol) return true;
        return board[0][2] == symbol && board[1][1] == symbol && board[2][0] == symbol;
    }
}