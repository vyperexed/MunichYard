package logic;

import java.util.ArrayList;
import java.util.Queue;
import java.util.Random;

public class GameManager {

    private static PlayerCharacter clientPlayer;
    private static ArrayList<PlayerCharacter> playerList;
    private static ArrayList<Station> startingPositions;
    private static Queue<PlayerCharacter> turnRemainingPlayers;
    private static PlayerCharacter currentPlayer;

    /*
     */
    private static ArrayList<Boolean> misterXVisibility;
    private static int misterXMoveCounter;

    public static void setClientPlayer(PlayerCharacter _clientPlayer) {
        clientPlayer = _clientPlayer;
    }

    public static void setPlayerList(ArrayList<PlayerCharacter> _playerList) {
        playerList = _playerList;
    }

    public static void setStartingPositions(ArrayList<Station> _startingPositions) {
        startingPositions = _startingPositions;
    }

    public static PlayerCharacter getPlayer(String name) {
        for(PlayerCharacter p : playerList)
            if(p.getName().equals(name))
                return p;
        return null;
    }

    public static void placePlayerCharacters() {
        for(PlayerCharacter p : playerList) {
            int i = new Random().nextInt(startingPositions.size());
            p.position = startingPositions.get(i);
            startingPositions.remove(i);
        }
    }

    public static void nextRound() {
        turnRemainingPlayers.clear();
        turnRemainingPlayers.addAll(playerList);
        nextTurn();
    }

    public static void nextTurn() {
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
