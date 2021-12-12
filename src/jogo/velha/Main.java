package jogo.velha;
import java.util.Scanner;

public class Main {
    public static void main (String[] args ) {
        Scanner sc = new Scanner(System.in);

        int[] arrPositions = new int[9];

        char[][] table = {
                {'_','|','_','|','_'},
                {'_','|','_','|','_'},
                {'_','|','_','|','_'}
        };

        for(int i = 1; i <= 10; i++) {

            int player = verifyPlayer(i);

            if(i < 10) {
                System.out.printf("Time player %d %nChoose a position:%n", player);
            } else {
                System.out.println("Draw");
            }

            printTable(table);

            int positionChosen = sc.nextInt();

            while(contains(arrPositions, positionChosen)){
                System.out.println("This position is chosen, please choose other:");
                positionChosen = sc.nextInt();
            }

            arrPositions[i - 1] = positionChosen;

            System.out.println();

            updateTable( positionChosen, player, table);
        }
    }

    public static void updateTable(int posicao, int player, char[][] table){
        char character;

        if(player == 1){
            character = 'x';
        } else {
            character = 'O';
        }

        switch (posicao) {
            case 1:
                table[0][0] = character;
                printTable(table);
                verifyWinner(table);
                break;

            case 2:
                table[0][2] = character;
                printTable(table);
                verifyWinner(table);
                break;

            case 3:
                table[0][4] = character;
                printTable(table);
                verifyWinner(table);
                break;

            case 4:
                table[1][0] = character;
                printTable(table);
                verifyWinner(table);
                break;

            case 5:
                table[1][2] = character;
                printTable(table);
                verifyWinner(table);
                break;

            case 6:
                table[1][4] = character;
                printTable(table);
                verifyWinner(table);
                break;

            case 7:
                table[2][0] = character;
                printTable(table);
                verifyWinner(table);
                break;

            case 8:
                table[2][2] = character;
                printTable(table);
                verifyWinner(table);
                break;

            case 9:
                table[2][4] = character;
                printTable(table);
                verifyWinner(table);
                break;

            default:
                break;

        }
    }

    public static void printTable(char[][] table) {
        for (char[] row: table) {
            for (char collum : row) {
                System.out.print(collum);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static void verifyWinner(char[][] table) {
        if(
            table[0][0] == 'x' && table[0][2] == 'x' && table[0][4] == 'x' ||
            table[1][0] == 'x' && table[1][2] == 'x' && table[1][4] == 'x' ||
            table[2][0] == 'x' && table[2][2] == 'x' && table[2][4] == 'x' ||

            table[0][0] == 'x' && table[1][0] == 'x' && table[2][0] == 'x' ||
            table[0][2] == 'x' && table[1][2] == 'x' && table[2][2] == 'x' ||
            table[0][4] == 'x' && table[1][4] == 'x' && table[2][4] == 'x' ||

            table[0][0] == 'x' && table[1][2] == 'x' && table[2][4] == 'x' ||
            table[0][4] == 'x' && table[1][2] == 'x' && table[2][0] == 'x'
        ){
            System.out.println("Player 1 is winner!");
            System.exit(0);
    } else if (
                table[0][0] == 'O' && table[0][2] == 'O' && table[0][4] == 'O' ||
                table[1][0] == 'O' && table[1][2] == 'O' && table[1][4] == 'O' ||
                table[2][0] == 'O' && table[2][2] == 'O' && table[2][4] == 'O' ||

                table[0][0] == 'O' && table[1][0] == 'O' && table[2][0] == 'O' ||
                table[0][2] == 'O' && table[1][2] == 'O' && table[2][2] == 'O' ||
                table[0][4] == 'O' && table[1][4] == 'O' && table[2][4] == 'O' ||

                table[0][0] == 'O' && table[1][2] == 'O' && table[2][4] == 'O' ||
                table[0][4] == 'O' && table[1][2] == 'O' && table[2][0] == 'O'
        ){
            System.out.println("Player 2 is winner!");
            System.exit(0);
        }
    }

    public static boolean contains(final int[] arr, final int key) {
        boolean found = false;

        for(int i = 0; i < arr.length; i++) {
            if (arr[i] == key) {
                found = true;
                break;
            }
        }
        return found;
    }

    public static int verifyPlayer(int time){
        if(time % 2 == 1) {
            return 1;
        } else {
            return 2;
        }
    }
}
