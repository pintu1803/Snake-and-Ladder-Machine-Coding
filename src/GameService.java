

class GameService {
    private Board board;
    private PlayerGroup playerGroup;
    private Dice dice;

    public GameService(Board board, PlayerGroup playerGroup, Dice dice) {
        this.board = board;
        this.playerGroup = playerGroup;
        this.dice = dice;
    }

    public void startGame() {
        // Game logic to start the game

        while(true) {
            for (Player player : playerGroup.players) {
                int diceRoll = dice.roll();

                int currPosition = player.getCurrentPosition();
                int newPosition = currPosition + diceRoll;
                int finalPosition = board.makeMove(board, newPosition);

                if(finalPosition == -1) {
                    continue;
                }

                player.setCurrentPosition(finalPosition);

                System.out.println(player.getName() + " rolled a " + diceRoll + " and moved from " + currPosition + " to " + finalPosition);

                if(finalPosition == board.getWinningPosition()) {
                    System.out.println(player.getName() + " wins the game!");
                    return;
                }
            }
        }
    }


}