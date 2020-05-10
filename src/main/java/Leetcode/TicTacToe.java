package Leetcode;

import java.util.*;

public class TicTacToe {

    static ArrayList<Integer> playerPositions = new ArrayList<>();
    static ArrayList<Integer> cpuPositions = new ArrayList<>();

    public static void main(String[] args) {

        char[][] gameBoard = {{' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '},
                {'-', '+', '-', '+', '-'},
                {' ', '|', ' ', '|', ' '}};

        printGameboard(gameBoard);

        while (true) {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter your placement (1-9): ");
            int playerPos = scanner.nextInt();

            while (playerPositions.contains(playerPos) ||
                    cpuPositions.contains(cpuPositions)) {
                System.out.println("Position taken!! Enter correct position!");
                playerPos = scanner.nextInt();
            }

//            System.out.println(playerPos);

            placePiece(gameBoard, playerPos, "player_1");

            String result = checkWinner();

            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            Random random = new Random();

            int cpuPos = random.nextInt(9) + 1;

            while (playerPositions.contains(cpuPos) ||
                    cpuPositions.contains(cpuPositions)) {
                cpuPos = random.nextInt(9) + 1;
            }

            placePiece(gameBoard, cpuPos, "CPU");

            printGameboard(gameBoard);

            result = checkWinner();

            if (result.length() > 0) {
                System.out.println(result);
                break;
            }

            System.out.println(result);

        }
    }

    public static void printGameboard(char[][] gameBoard) {
        for (char[] row : gameBoard) {
            for (char c : row) {
                System.out.print(c);
            }
            System.out.println();
        }
    }

    public static void placePiece(char gameBoard[][], int position, String user) {

        char symbol = 'X';

        if (user.equalsIgnoreCase("player_1")) {
            symbol = 'X';
            playerPositions.add(position);
        } else if (user.equalsIgnoreCase("CPU")) {
            symbol = 'O';
            cpuPositions.add(position);
        }


        switch (position) {
            case 1:
                gameBoard[4][0] = symbol;
                break;
            case 2:
                gameBoard[4][2] = symbol;
                break;
            case 3:
                gameBoard[4][4] = symbol;
                break;
            case 4:
                gameBoard[2][0] = symbol;
                break;
            case 5:
                gameBoard[2][2] = symbol;
                break;
            case 6:
                gameBoard[2][4] = symbol;
                break;
            case 7:
                gameBoard[0][0] = symbol;
                break;
            case 8:
                gameBoard[0][2] = symbol;
                break;
            case 9:
                gameBoard[0][4] = symbol;
                break;
            default:
                System.out.println("Invalid input!");
        }
    }


    public static String checkWinner() {

        List topRow = Arrays.asList(1, 2, 3);
        List midRow = Arrays.asList(4, 5, 6);
        List botRow = Arrays.asList(7, 8, 9);
        List leftCol = Arrays.asList(1, 4, 7);
        List midCol = Arrays.asList(2, 5, 8);
        List rightCol = Arrays.asList(3, 6, 9);
        List cross1 = Arrays.asList(1, 5, 9);
        List cross2 = Arrays.asList(7, 5, 3);

        List<List> winning = new ArrayList<List>();
        winning.add(topRow);
        winning.add(midRow);
        winning.add(botRow);
        winning.add(leftCol);
        winning.add(midCol);
        winning.add(rightCol);
        winning.add(cross1);
        winning.add(cross2);

        for (List l : winning) {
            if (playerPositions.containsAll(l)) {
                return "Congratulations you win !!!";
            } else if (cpuPositions.containsAll(l)) {
                return "CPU wins !!!";
            } else if ((playerPositions.size() + cpuPositions.size()) == 9) {
                System.out.println("Mai baga o fisa!! ");
            }
        }
        return "";
    }
}

