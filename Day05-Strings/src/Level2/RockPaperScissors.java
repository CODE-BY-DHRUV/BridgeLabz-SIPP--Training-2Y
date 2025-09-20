import java.util.Scanner;
public class RockPaperScissors {
        public static String getComputerChoice() {
            int choice = (int) (Math.random() * 3);
            switch (choice) {
                case 0: return "Rock";
                case 1: return "Paper";
                default: return "Scissors";
            }
        }
        public static String determineWinner(String user, String computer) {
            if (user.equalsIgnoreCase(computer)) {
                return "Draw";
            } else if ((user.equalsIgnoreCase("Rock") && computer.equalsIgnoreCase("Scissors")) ||
                    (user.equalsIgnoreCase("Paper") && computer.equalsIgnoreCase("Rock")) ||
                    (user.equalsIgnoreCase("Scissors") && computer.equalsIgnoreCase("Paper"))) {
                return "User";
            } else {
                return "Computer";
            }
        }
        public static String[][] calculateStats(int userWins, int computerWins, int totalGames) {
            String[][] stats = new String[2][3];
            stats[0][0] = "User";
            stats[1][0] = "Computer";

            stats[0][1] = String.valueOf(userWins);
            stats[1][1] = String.valueOf(computerWins);

            double userPercent = ((double) userWins / totalGames) * 100;
            double computerPercent = ((double) computerWins / totalGames) * 100;

            stats[0][2] = String.format("%.2f%%", userPercent);
            stats[1][2] = String.format("%.2f%%", computerPercent);

            return stats;
        }

        public static void displayResults(String[][] gameResults, String[][] stats) {
            System.out.println("\nGame Results:");
            System.out.println("Game\tUser\tComputer\tWinner");
            System.out.println("------------------------------------------");
            for (int i = 0; i < gameResults.length; i++) {
                System.out.println((i + 1) + "\t" + gameResults[i][0] + "\t" +
                        gameResults[i][1] + "\t\t" + gameResults[i][2]);
            }

            System.out.println("\nOverall Stats:");
            System.out.println("Player\tWins\tWinning %");
            System.out.println("---------------------------");
            for (int i = 0; i < stats.length; i++) {
                System.out.println(stats[i][0] + "\t" + stats[i][1] + "\t" + stats[i][2]);
            }
        }

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            System.out.print("Enter number of games: ");
            int n = sc.nextInt();
            sc.nextLine();

            String[][] gameResults = new String[n][3];
            int userWins = 0, computerWins = 0;

            for (int i = 0; i < n; i++) {
                System.out.print("Enter your choice for game " + (i + 1) + " (Rock/Paper/Scissors): ");
                String userChoice = sc.nextLine();
                String computerChoice = getComputerChoice();
                String winner = determineWinner(userChoice, computerChoice);

                if (winner.equals("User")) userWins++;
                else if (winner.equals("Computer")) computerWins++;

                gameResults[i][0] = userChoice;
                gameResults[i][1] = computerChoice;
                gameResults[i][2] = winner;
            }

            String[][] stats = calculateStats(userWins, computerWins, n);
            displayResults(gameResults, stats);

            sc.close();
        }
    }


