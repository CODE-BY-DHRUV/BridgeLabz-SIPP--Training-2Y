import java.util.*;
public class TicTacToe {
        private char[] board  = new char[10];
        private char playerLetter;
        private char computerLetter;
        private String currentPlayer;
        private Random random ;

    public TicTacToe() {
        board = new char[10];
        random = new Random();
        initializeBoard(); // UC 1
    }
    public void initializeBoard() {
        for (int i = 1; i < board.length; i++) {
            board[i] = ' ';
        }
    }

    // UC 2: Player chooses X or O
    public void chooseLetter(Scanner sc) {
        while (true) {
            System.out.print("Choose your letter (X or O): ");
            char choice = sc.next().toUpperCase().charAt(0);

            if (choice == 'X' || choice == 'O') {
                playerLetter = choice;
                computerLetter = (choice == 'X') ? 'O' : 'X';
                System.out.println("Player: " + playerLetter + " | Computer: " + computerLetter);
                break;
            } else {
                System.out.println("Invalid choice! Please choose X or O.");
            }
        }
    }

    // UC 3: Show current board
    public void showBoard() {
        System.out.println("\nCurrent Board:");
        System.out.println(" " + board[1] + " | " + board[2] + " | " + board[3]);
        System.out.println("---+---+---");
        System.out.println(" " + board[4] + " | " + board[5] + " | " + board[6]);
        System.out.println("---+---+---");
        System.out.println(" " + board[7] + " | " + board[8] + " | " + board[9]);
        System.out.println();
    }

    // UC 4 & UC 5: Check if a space is free
    public boolean isFreeSpace(int index) {
        return board[index] == ' ';
    }


    public boolean makeMove(int index, char letter) {
        if (index >= 1 && index <= 9 && isFreeSpace(index)) {
            board[index] = letter;
            return true;
        }
        return false;
    }


    public void tossToStart() {
        if (random.nextBoolean()) {
            currentPlayer = "Player";
        } else {
            currentPlayer = "Computer";
        }
        System.out.println(currentPlayer + " will start first!");
    }

    public boolean isWinner(char letter){
        return (board[1] == letter && board[2] == letter && board[3] == letter) ||
                (board[4] == letter && board[5] == letter && board[6] == letter) ||
                (board[7] == letter && board[8] == letter && board[9] == letter) ||
                (board[1] == letter && board[4] == letter && board[7] == letter) ||
                (board[2] == letter && board[5] == letter && board[8] == letter) ||
                (board[3] == letter && board[6] == letter && board[9] == letter) ||
                (board[1] == letter && board[5] == letter && board[9] == letter) ||
                (board[3] == letter && board[5] == letter && board[7] == letter);
    }





    public boolean isBoardFull() {
        for (int i = 1; i < board.length; i++) {
            if (board[i] == ' ') return false;
        }
        return true;
    }

    public int computerMove() {
        // UC 8: Try to win
        for (int i = 1; i <= 9; i++) {
            if (isFreeSpace(i)) {
                board[i] = computerLetter;
                if (isWinner(computerLetter)) {
                    board[i] = ' ';
                    return i;
                }
                board[i] = ' ';
            }
        }

        // UC 9: Block player win
        for (int i = 1; i <= 9; i++) {
            if (isFreeSpace(i)) {
                board[i] = playerLetter;
                if (isWinner(playerLetter)) {
                    board[i] = ' ';
                    return i;
                }
                board[i] = ' ';
            }
        }

        // UC 10: Take one of the corners
        int[] corners = {1, 3, 7, 9};
        for (int corner : corners) {
            if (isFreeSpace(corner)) return corner;
        }

        // UC 11: Take center if free
        if (isFreeSpace(5)) return 5;

        // UC 11: Take any side
        int[] sides = {2, 4, 6, 8};
        for (int side : sides) {
            if (isFreeSpace(side)) return side;
        }

        return -1; // No move possible
    }



     public void playGame(Scanner sc) {
         while(true){
             showBoard();

             if (currentPlayer.equals("Player")) {
                 System.out.print("Enter position (1-9): ");
                 int position = sc.nextInt();

                 if (!makeMove(position, playerLetter)) {
                     System.out.println("Invalid move. Try again.");
                     continue;
                 }

                 if (isWinner(playerLetter)) {
                     showBoard();
                     System.out.println("Congratulations! You win!");
                     break;
                 }

                 currentPlayer = "Computer";

             } else {
                 int move = computerMove();
                 makeMove(move, computerLetter);
                 System.out.println("Computer placed at position " + move);

                 if (isWinner(computerLetter)) {
                     showBoard();
                     System.out.println("Computer wins! Better luck next time.");
                     break;
                 }

                 currentPlayer = "Player";
             }

             if (isBoardFull()) {
                 showBoard();
                 System.out.println("It's a tie!");
                 break;
             }
         }
     }




    public boolean playAgain(Scanner sc){
        System.out.println("Do you want to play again? (Y/N):");
        char choice = sc.next().toUpperCase().charAt(0);
        return choice == 'Y';
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        do{
            TicTacToe game = new TicTacToe();
            game.chooseLetter(sc);
            game.tossToStart();
            game.playGame(sc);
        }while(new TicTacToe().playAgain(sc));
        sc.close();
        System.out.println("Thanks for playing TIC TAC TOE");
    }
}
