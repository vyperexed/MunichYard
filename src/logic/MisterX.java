package logic;

import java.util.ArrayList;

public class MisterX extends PlayerCharacter {
    private int blackTicketCount;
    private int doubleTicketCount;
    private ArrayList<MoveType> presentMoves;

    public int getBlackTicketCount() {
        return blackTicketCount;
    }

    public int getDoubleTicketCount() {
        return doubleTicketCount;
    }

    public ArrayList<MoveType> getPresentMoves() {
        return presentMoves;
    }

    /**
     * TODO: blackTicketSetzen(), doppelzugTicketSetzen(), ?( bewegen() )
     */
}
