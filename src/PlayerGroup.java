import java.util.ArrayList;
import java.util.List;

class PlayerGroup {
    private int playerCount;

    List<Player> players;

    PlayerGroup() {
        this.players = new ArrayList<>();
    }

    PlayerGroup(int playerCount) {
        this.playerCount = playerCount;
        this.players = new ArrayList<>();
    }

    public void addPlayer(Player player) {
        players.add(player);
    }


    public int getPlayerCount() {
        return playerCount;
    }
}