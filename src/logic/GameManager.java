package logic;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;

public class GameManager {

    private PlayerCharacter clientPlayer;
    private ArrayList<PlayerCharacter> playerList;
    private ArrayList<Station> startingPositions;
    private Queue<PlayerCharacter> turnRemainingPlayers;
    private PlayerCharacter currentPlayer;
    private boolean lastCardTimes2;

    /*
     */
    private ArrayList<Boolean> misterXVisibility;
    private int misterXMoveCounter;

    public void setClientPlayer(PlayerCharacter clientPlayer) {
        this.clientPlayer = clientPlayer;
    }

    public void setPlayerList(ArrayList<PlayerCharacter> playerList) {
        this.playerList = playerList;
    }

    public void setStartingPositions(ArrayList<Station> startingPositions) {
        this.startingPositions = startingPositions;
    }

    public PlayerCharacter getPlayer(String name) {
        for(PlayerCharacter p : playerList)
            if(p.getName().equals(name))
                return p;
        return null;
    }

    public void placePlayerCharacters() {
        for(PlayerCharacter p : playerList) {
            int i = new Random().nextInt(startingPositions.size());
            p.position = startingPositions.get(i);
            startingPositions.remove(i);
        }
    }

    public void nextRound() {
        turnRemainingPlayers.clear();
        turnRemainingPlayers.addAll(playerList);
        nextTurn();
    }

    public void nextTurn() {
        if(turnRemainingPlayers.size() <= 0)
            nextRound();
        currentPlayer = turnRemainingPlayers.remove();
        /** TODO: Check for game win */
    }

    /*
    MisterX immer erster in der Queue
    Bei Doppelzug Rundenneustart
    Bei 2. Zug vom Doppelzug vorherigerZugDoppelzug muss false sein sonst gehts nicht
     */

    /** TODO: Update MisterX visibility */
}
