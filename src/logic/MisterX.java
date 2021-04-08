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


    public boolean moveTaxi(Station station) {
        if(!position.getTaxiConnections().contains(station))
            return false;
        position = station;
        presentMoves.add(MoveType.Taxi);
        return true;
    }

    public boolean moveBus(Station station) {
        if(!position.getBusConnections().contains(station))
            return false;
        position = station;
        presentMoves.add(MoveType.Bus);
        return true;
    }

    public boolean moveUnderground(Station station) {
        if(!position.getUndergroundConnections().contains(station))
            return false;
        position = station;
        presentMoves.add(MoveType.Underground);
         return true;
    }

    public boolean moveBlackTicket(Station station) {
        if(!position.getAllConnections().contains(station))
            return false;
        blackTicketCount--;
        position = station;
        presentMoves.add(MoveType.Black);
        return true;
    }

    /**
     * TODO: blackTicketSetzen(), doppelzugTicketSetzen(), ?( bewegen() )
     */
}
