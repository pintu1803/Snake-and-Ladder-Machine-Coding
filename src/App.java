import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        System.out.println("Welcome to Snake and Ladder Game!");

        Board board = new Board();

        Scanner scanner = new Scanner(System.in);

        board.setSnakeCount(scanner.nextInt());

        for(int i = 0; i < board.getSnakeCount(); i++) {
            int head = scanner.nextInt();
            int tail = scanner.nextInt();

            board.addSnake(new Snake(head, tail));
        }

        board.setLadderCount(scanner.nextInt());

        for(int i = 0; i < board.getLadderCount(); i++) {
            int start = scanner.nextInt();
            int end = scanner.nextInt();

            board.addLadder(new Ladder(start, end));
        }

        PlayerGroup playerGroup = new PlayerGroup(scanner.nextInt());
        for(int i = 0; i < playerGroup.getPlayerCount(); i++) {
            String name = scanner.next();
            playerGroup.addPlayer(new Player(name));
        }

        scanner.close();

        GameService gameService = new GameService(board, playerGroup, new Dice(6));
        gameService.startGame();

    }
}
